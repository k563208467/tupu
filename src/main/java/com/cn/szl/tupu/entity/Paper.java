package com.cn.szl.tupu.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/17
 * \* Time: 15:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class Paper implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Getter
    private int id;

    @Getter
    private String title;

    @Getter
    private String author;

    @Getter
    private String date;

    @Getter
    private String keywords;

    @Getter
    private String summary;

    @Getter
    private String school;

    @Getter
    private String degree;

    @Getter
    private String major;

    @Getter
    private String tutor;

    @Getter
    private String url;

    @Getter
    private String web;

    @Getter
    private String label;


}