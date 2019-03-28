package com.cn.szl.tupu.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Patent implements Serializable{
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
    private String appNum;

    @Getter
    private String summary;

    @Getter
    private String school;

    @Getter
    private String url;

    @Getter
    private String label1;

    @Getter
    private String label2;
    @Getter
    private String label3;

    @Getter
    private String relevance;

}
