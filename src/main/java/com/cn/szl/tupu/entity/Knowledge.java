package com.cn.szl.tupu.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
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
public class Knowledge implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer KnowledgeId;  // 知识id
    @Getter
    @Setter
    @NotNull(message = "知识名称不能为空")
    @NotBlank(message = "知识名称不能为空")
    private String KnowledgeName; // 知识名称

    @Getter
    @Setter
    private Date KnowledgeTime = new Date(); // 知识加入时间

    @NotNull(message = "知识层级不能为空")
    @NotBlank(message = "知识层级不能为空")
    private String KnowledgeLevel; // 知识层级

    public String getKnowledgeName() {
        return KnowledgeName;
    }

    public String getKnowledgeLevel() {
        return KnowledgeLevel;
    }

    public void setKnowledgeLevel(String knowledgeLevel) {
        this.KnowledgeLevel = knowledgeLevel;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.KnowledgeName = knowledgeName;
    }
}