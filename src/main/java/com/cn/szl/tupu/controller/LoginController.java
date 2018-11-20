package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.User;
import com.cn.szl.tupu.servive.IUserService;
import com.cn.szl.tupu.servive.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private IUserService iUserService;


    /**
     * 登录校验
     */
    @PostMapping("/login")
    public String login(
            @RequestParam(value="username",required = false) String userName,
            @RequestParam(value = "pass",required = false) String password,
            Model model,
            HttpServletRequest request){
        if (iUserService.getByName(userName)!=null&&iUserService.getByName(userName).getPassword().equals(password)){
            model.addAttribute("msg", "登录成功!");
            request.getSession().setAttribute("loginName",userName);
            return ("redirect:/main");

        }else {
            model.addAttribute("msg", "登录名或密码错误!请重新输入!");
            return ("redirect:/index?error");
        }
    }

    /**
     * 注销登录
     */
    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }






}
