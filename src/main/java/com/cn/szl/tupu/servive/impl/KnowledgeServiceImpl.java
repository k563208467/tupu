package com.cn.szl.tupu.servive.impl;

import com.cn.szl.tupu.dao.KnowledgeDao;
import com.cn.szl.tupu.entity.Knowledge;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/17
 * \* Time: 9:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class KnowledgeServiceImpl implements IKnowledgeService {


    @Autowired
    private KnowledgeDao dao;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result add(Knowledge knowledge) {
        Knowledge byNameAndLevel = dao.getByNameAndLevel(knowledge.getKnowledgeName(), knowledge.getKnowledgeLevel());
        if (null != byNameAndLevel){
            throw new DuplicateKeyException("数据重复!");
        }
        dao.insert(knowledge);
        return Result.ok();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result delete(int knowledgeId) {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result update(int knowledgeId) {
        return null;
    }

    @Override
    public List<Knowledge> getKnowledgeList(int page, int pageSize) {
        return null;
    }

    @Override
    public Knowledge getById(int knowledgeId) {
        return dao.getById(knowledgeId);
    }

    @Override
    public List<Knowledge> getAll() {
        return dao.getAll();
    }
}