package com.cn.szl.tupu.entity;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/16
 * \* Time: 17:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Result {

    // 响应业务状态
    private Integer code;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static Result build(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static Result ok(Object data) {
        return new Result(data);
    }

    public static Result ok() {
        return new Result(null);
    }

    public Result() {

    }

    public static Result build(Integer code, String msg) {
        return new Result(code, msg, null);
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
        this.code = 200;
        this.msg = "OK";
        this.data = data;
    }

    public static Result error(String msg) {
        return Result.build(500,msg);
    }


    public Integer getcode() {
        return code;
    }

    public void setcode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}