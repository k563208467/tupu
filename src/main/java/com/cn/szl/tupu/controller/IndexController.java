package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.Knowledge;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}