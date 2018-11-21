package com.cn.szl.tupu.servive.impl;

import com.cn.szl.tupu.dao.PaperDao;
import com.cn.szl.tupu.entity.Paper;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PaperServiceImpl implements IPaperService {

    @Autowired
    private PaperDao paperDao;

    @Override
    public Result add(Paper knowledge) {
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
        return paperDao.getById(knowledgeId);
    }

    @Override
    public List<Paper> getAll() {
        return null;
    }

    @Override
    public List<Paper> listPaper(String label, int page, int pageSize) {
        return paperDao.listPaper(label,(page - 1) * pageSize, pageSize );
    }

    public List<Paper> findByKeyword(String keyword){
        return paperDao.findByKeyword(keyword);
    };

}