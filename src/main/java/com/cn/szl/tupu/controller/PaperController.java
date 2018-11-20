package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.Paper;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

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
@RequestMapping("paper")
public class PaperController {

    @Autowired
    private IPaperService service;

    @RequestMapping("/list")
    public Result list(String label,int page,int pageSize){
        return Result.ok(service.listPaper(label,page,pageSize));
    }


    @GetMapping("/ajaxSearch")
    public String ajaxSearch(@RequestParam(value="key",required = false) String key, ModelMap model){
        ArrayList<Paper> list = (ArrayList<Paper>) service.findByKeyword(key);
//        for(Paper paper:list){
//
//        }
        System.out.println(list);
        model.addAttribute("key",key);
        model.addAttribute("papers",list);
//        model.setViewName("addTask");
        return "addTask";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam(value="key",required = false) String key, ModelAndView model){
        ArrayList<Paper> list = (ArrayList<Paper>) service.findByKeyword(key);
//        for(Paper paper:list){
//
//        }
        System.out.println(list);
        model.addObject("key",key);
        model.addObject("papers",list);
        model.setViewName("addTask");
        return model;
    }


}