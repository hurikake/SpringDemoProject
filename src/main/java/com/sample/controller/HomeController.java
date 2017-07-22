package com.sample.controller;

import com.sample.entity.Employee;
import com.sample.service.SearchEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SearchEmployee searchEmployee;

    @RequestMapping(value = "/")
    public String home(){

        Employee employee = searchEmployee.searchEmployee(1);
        return "home";
    }
}
