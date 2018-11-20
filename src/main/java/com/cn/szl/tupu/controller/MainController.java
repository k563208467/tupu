package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.Paper;
import com.cn.szl.tupu.servive.IPaperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {
    private IPaperService iPaperService;

    @RequestMapping("/main")
    public String main(){
        return "main";
    }


    @RequestMapping("/main/addTask")
    public String addTask(){
        return "addTask";
    }


    @RequestMapping("/main/post")
    public String post(){
        return "";
    }

    @RequestMapping("/main/addNew")
    public String addNew(){
        return "";
    }
}
