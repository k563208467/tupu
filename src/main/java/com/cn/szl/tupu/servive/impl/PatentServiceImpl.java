package com.cn.szl.tupu.servive.impl;

import com.cn.szl.tupu.dao.PatentDao;
import com.cn.szl.tupu.entity.Paper;
import com.cn.szl.tupu.entity.Patent;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IPaperService;
import com.cn.szl.tupu.servive.IPatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatentServiceImpl implements IPatentService{
    @Autowired
    PatentDao patentDao;


    @Override
    public Result add(Patent knowledge) {
        return null;
    }

    @Override
    public Result delete(int knowledgeId) {
        return null;
    }

    @Override
    public Result update(int knowledgeId) {
        return null;
    }

    @Override
    public List<Paper> getKnowledgeList(int page, int pageSize) {
        return null;
    }

    @Override
    public Paper getById(int knowledgeId) {
        return null;
    }

    @Override
    public List<Paper> getAll() {
        return null;
    }

    @Override
    public List<Paper> ListPatent(String label, int page, int pageSize) {
        return null;
    }

    @Override
    public List<Paper> findByKeyword(String keyword) {
        return null;
    }
}
