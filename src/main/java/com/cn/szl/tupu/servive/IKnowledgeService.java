package com.cn.szl.tupu.servive;


import com.cn.szl.tupu.entity.Knowledge;
import com.cn.szl.tupu.entity.Result;

import java.util.List;

public interface IKnowledgeService {

    Result add(Knowledge knowledge);

    Result delete(int knowledgeId);

    Result update(int knowledgeId);

    List<Knowledge> getKnowledgeList(int page, int pageSize);

    Knowledge getById(int knowledgeId);

    List<Knowledge> getAll();




}
