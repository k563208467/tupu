package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.Paper;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.servive.IPaperService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

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
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    private IPaperService iPaperService;

    @RequestMapping("/list")
    public Result list(String label,int page,int pageSize){
        return Result.ok(iPaperService.listPaper(label,page,pageSize));
    }

    @ResponseBody
    @GetMapping("/ajaxSearch")
    public ModelMap ajaxSearch(@RequestParam(value="key",required = false) String key, ModelMap model){
        ArrayList<Paper> list = (ArrayList<Paper>) iPaperService.findByKeyword(key);
//        for(Paper paper:list){
//
//        }
        model.addAttribute("key",key);
        model.addAttribute("papers",list);
//        model.setViewName("addTask");
//        return "addTask";
        return model;
    }



    @GetMapping("/search")
    public ModelAndView search(@RequestParam(value="key",required = false) String key, ModelAndView model,@RequestParam(defaultValue = "1",required = false)Integer pageNum, @RequestParam(defaultValue = "10",required = false)Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Paper> papers = iPaperService.findByKeyword(key);
        PageInfo pageInfo = new PageInfo<Paper>(papers,10);
        System.out.println(pageInfo);
        model.addObject("key",key);
//        model.addObject("papers",papers);
        model.addObject("pageInfo",pageInfo);
//        System.out.println(pageInfo);
        //获得当前页
        model.addObject("pageNum", pageInfo.getPageNum());
        //获得一页显示的条数
        model.addObject("pageSize", pageInfo.getPageSize());
        //是否是第一页
        model.addObject("isFirstPage", pageInfo.isIsFirstPage());
        //获得总页数
        model.addObject("totalPages", pageInfo.getPages());
        //是否是最后一页
        model.addObject("isLastPage", pageInfo.isIsLastPage());
        model.setViewName("paper/ajaxSearch");
        return model;
    }

    @GetMapping("/details")
    public ModelAndView showDetails(@RequestParam(value="id",required = false) int id,ModelAndView model){
        Paper paper = iPaperService.getById(id);
        model.addObject("title",paper.getTitle());
        model.addObject("author",paper.getAuthor());
        model.addObject("date",paper.getDate());
        model.addObject("keywords",paper.getKeywords());
        model.addObject("summary",paper.getSummary());
        model.addObject("school",paper.getSchool());
        model.addObject("degree",paper.getDegree());
        model.addObject("major",paper.getMajor());
        model.addObject("tutor",paper.getTutor());
        model.addObject("url",paper.getUrl());
        model.setViewName("post");
        return model;
    }

    @GetMapping("/network")
    public ModelAndView network(ModelAndView modelAndView){
        modelAndView.setViewName("network");
        return modelAndView;
    }

}