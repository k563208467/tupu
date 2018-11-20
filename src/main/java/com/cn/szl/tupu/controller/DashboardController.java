package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.Knowledge;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/16
 * \* Time: 15:25
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
@RequestMapping("dashboard")
public class DashboardController {

    @Autowired
    private IKnowledgeService service;

    @RequestMapping("/add")
    public Result add(@Valid Knowledge knowledge, BindingResult results) {
        if (results.hasErrors())
            return Result.error(results.getFieldError().getDefaultMessage());
        return service.add(knowledge);
    }

    @RequestMapping("/getById")
    public Result getById(int knowledgeId) {
        return Result.ok(service.getById(knowledgeId));
    }

    @RequestMapping("/all")
    public Result all() {
        return Result.ok(service.getAll());
    }



}