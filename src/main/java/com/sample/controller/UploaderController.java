package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploaderController {

    @GetMapping(path = "/uploader",produces = "text/plain;charset=UTF-8")
    public String index(){
        return "uploader";
    }

}
