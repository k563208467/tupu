package com.cn.szl.tupu.service.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class block extends LinkedBlockingQueue<Object> {
    private static final long serialVersionUID  = -8224792866430647454L;
    private static ExecutorService es = Executors.newFixedThreadPool(10);
    private static block pbq = new block();
    private boolean flag = false;

    private block(){}

    public static block getInstance(){
        return pbq;
    }

    /**
     * 队列监听启动
     */
    public void start(){
        if(!this.flag){
            this.flag=true;
        }else {
            throw new IllegalArgumentException("队列已处于启动状态，不允许重复启动");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag){
                    try {
                        Object obj = take();
                        es.execute(new blockHandler(obj));
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }


    /**
     * 停止队列监听
     */
    public void stop(){
        this.flag = false;
    }
}
