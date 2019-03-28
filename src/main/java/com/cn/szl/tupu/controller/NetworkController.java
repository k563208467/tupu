package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.dao.KnowledgeDao;
import com.cn.szl.tupu.entity.Knowledge;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/11/17
 * \* Time: 17:07
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/network")
public class NetworkController {
    @Autowired
    IKnowledgeService iKnowledgeService;

    @RequestMapping("/list")
    public Result list(String label,int page,int pageSize){
        return null;
    }

    @RequestMapping("/create")
    public void create(){
    }
}
