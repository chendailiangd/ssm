package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.UserService;
import com.vo.User;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello.do")
    public String find(int uid,ModelMap model)
    {
        int age=userService.findAge(uid);
        System.out.println(age);//���ʵ��ɹ����ڿ���̨���ӡ����23
        
        User user =userService.findByUid(uid);
        System.out.println(user.getUsername()+" "+user.getAge()+" "+user.getUid());
        
//        model.addAttribute("user",user);
        model.addAttribute(user);
        return "index";
    }
}