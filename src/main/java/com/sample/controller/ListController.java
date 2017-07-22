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
@RequestMapping("/list")
public class ListController {

    @Autowired
    SearchEmployee searchEmployee;

    @GetMapping
    public String listView(LoginModel loginModel, ModelMap modelMap){
        return "list";
    }
}
