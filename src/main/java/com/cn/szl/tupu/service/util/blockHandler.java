package com.cn.szl.tupu.service.util;

public class blockHandler implements Runnable{
    private Object obj;
    public blockHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        doBusiness();
    }

    /**
     * 业务处理时限
     */
    public void doBusiness(){
        System.out.println("处理请求"+obj);
    }

}
