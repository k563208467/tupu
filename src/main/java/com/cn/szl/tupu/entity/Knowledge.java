package com.cn.szl.tupu.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/16
 * \* Time: 15:50
 * \* To change this template use File | Settings | File Templates.
 * \* Description:知识实体
 * \
 */

@Data
@Entity
public class Knowledge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer KnowledgeId;  // 知识id

    @Getter
    @Setter
    @NotNull(message = "知识名称不能为空")
    @NotBlank(message = "知识名称不能为空")
    private String KnowledgeTitle; // 知识名称

    @Getter
    @Setter
    @NotNull(message = "知识名称不能为空")
    @NotBlank(message = "知识名称不能为空")
    private String KnowledgeType;

    @Getter
    @Setter
    private String KnowledgeData;

    @Getter
    @Setter
    private String Summary;

    @Getter
    @Setter
    @NotNull(message = "知识名称不能为空")
    @NotBlank(message = "知识名称不能为空")
    private String Url;

    @NotNull(message = "知识层级不能为空")
    @NotBlank(message = "知识层级不能为空")
    @Getter
    @Setter
    private String KnowledgeLevel1; // 知识层级

    @NotNull(message = "知识层级不能为空")
    @NotBlank(message = "知识层级不能为空")
    @Getter
    @Setter
    private String KnowledgeLevel2; // 知识层级

    @NotNull(message = "知识层级不能为空")
    @NotBlank(message = "知识层级不能为空")
    @Getter
    @Setter
    private String KnowledgeLevel3; // 知识层级

    @Getter
    @Setter
    private ArrayList<String> relevance;


}