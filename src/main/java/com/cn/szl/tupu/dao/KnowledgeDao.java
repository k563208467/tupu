package com.cn.szl.tupu.dao;


import com.cn.szl.tupu.entity.Knowledge;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 知识体系DAO接口
 */
@Component
public interface KnowledgeDao {

    Knowledge getById(int knowledgeId);

    void insert(Knowledge knowledge);

    void deleteById(int knowledgeId);

    void updateById(int knowledgeId);

    Knowledge getByNameAndLevel(@Param("knowledgeName") String knowledgeName , @Param("knowledgeLevel")String knowledgeLevel);

    List<Knowledge> getAll();


}
