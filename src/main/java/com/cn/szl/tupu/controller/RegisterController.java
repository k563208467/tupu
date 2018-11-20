package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.User;
import com.cn.szl.tupu.servive.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/registered")
    public String registered(){
        return "registered";
    }


    @RequestMapping(value = "/registered/saveUser",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(
            @RequestParam(value = "username",required=false) String userName,
            @RequestParam(value = "pass",required=false) String password,
            @RequestParam("repass") String rePassword,
            @RequestParam("telephone") String telephone,
            @RequestParam("email") String email
    ){
        try {
            User user = new User();
            if (password.equals(rePassword)){
                String role = "user";
                user.setUserName(userName);
                user.setPassword(password);
                user.setTelephone(telephone);
                user.setEmail(email);
                user.setRole(role);
                iUserService.add(user);

                System.out.println("保存数据成功");
            }else {
                return "两次输入的密码不符合，请重试";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
