package com.cn.szl.tupu.servive;


import com.cn.szl.tupu.entity.Paper;
import com.cn.szl.tupu.entity.Result;

import java.util.List;

public interface IPaperService {

    Result add(Paper knowledge);

    Result delete(int knowledgeId);

    Result update(int knowledgeId);

    List<Paper> getKnowledgeList(int page, int pageSize);

    Paper getById(int knowledgeId);

    List<Paper> getAll();

    List<Paper> listPaper(String label,int page, int pageSize);

    List<Paper> findByKeyword(String keyword);





}
