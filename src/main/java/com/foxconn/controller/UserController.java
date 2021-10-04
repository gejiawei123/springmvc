package com.foxconn.controller;

import com.foxconn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private static List<User> list;
    public UserController(){
        super();
     list=new ArrayList<>();
    }
    @PostMapping("/register")
    public String register(
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            @RequestParam("realname")String realname
    ){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRealname(realname);
        list.add(user);
        return "login.jsp";
    }
    @RequestMapping("/login")
    public String login(
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            Model model
    ){
       /* User user=new User();
        user.setUsername(username);
        user.setPassword(password);*/
        for(User user:list){
            if(user.getUsername().equals(username)&&
            user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome.jsp";
            }
        }
        return "login.jsp";
    }
}
