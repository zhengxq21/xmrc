package com.java.controller;

import com.java.domain.User;
import com.java.domain.UserInfo;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public User getUser(){
        User user = new User();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

    @RequestMapping(value = "/saveUserInfo")
    public void saveUserInfo(UserInfo userInfo,BindingResult result){
        if (result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list){
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
        }
    }


    @RequestMapping(value = "/saveUser")
    public void saveUser(@Valid User user, BindingResult result){
        if (result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error:list){
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
        }
    }
}
