package com.ankki.cfcmms.controller;

import com.ankki.cfcmms.model.DataBoard;
import com.ankki.cfcmms.service.DataBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/1/18.
 */
@RestController
@RequestMapping("/user")
public class HelloController {

    @Resource
    private DataBoardService dataBoardService;

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(){
        log.info("test HelloController!!!");
        return "hello";
    }

    @RequestMapping("/test")
    public List<DataBoard> test(String name){
        List<DataBoard> list = dataBoardService.queryDataboard(name);
        log.info("test service!!!");
        return list;
    }
}
