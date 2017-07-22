package com.sample.controller;

import com.sample.model.LoginModel;
import com.sample.service.SearchEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    SearchEmployee searchEmployee;

    @GetMapping
    public String login(LoginModel loginModel, ModelMap modelMap){
        return "login";
    }

    @PostMapping
    public String loginConfirm(@Validated LoginModel loginModel, final BindingResult result, ModelMap modelMap){

        if(result.hasErrors()){
            return  "login";
        }
        // Serviceによるエラーチェック

        return "list";
    }

}
