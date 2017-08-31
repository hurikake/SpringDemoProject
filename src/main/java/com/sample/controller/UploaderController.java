package com.sample.controller;

import com.sample.model.FileInfoModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploaderController {

    @GetMapping(path = "/uploader",produces = "text/plain;charset=UTF-8")
    public String index(){
        return "uploader";
    }

    @RequestMapping(path = "/uploader/upload")
    public ResponseEntity<String> upload(MultipartFile file){
        FileInfoModel fileInfoModel = new FileInfoModel();
        HttpHeaders headers = new HttpHeaders();

        // TODO 作りかけ
        return new ResponseEntity<String>("hoge", HttpStatus.OK);
    }

}
