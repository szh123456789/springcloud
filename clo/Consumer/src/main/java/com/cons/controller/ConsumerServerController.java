package com.cons.controller;

import com.cons.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Consumer")
public class ConsumerServerController {

    @Autowired
    public ConsumerService consumerService;

    @RequestMapping("/gotoAlgorithmServer")
    public String gotoAlgorithmServer(){
        return consumerService.gotoAlgorithmServer();
    }
}