package com.cn.szl.tupu.exception;

import com.cn.szl.tupu.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/17
 * \* Time: 11:00
 * \* To change this template use File | Settings | File Templates.
 * \* Description:全局异常处理
 * \
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(DuplicateKeyException.class)
    public Result handleDuplicateKeyException(DuplicateKeyException e){
        logger.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result handException(Exception e){
        logger.error(e.getMessage(), e);
        return Result.error("未知错误,请联系系统管理员");
    }


}