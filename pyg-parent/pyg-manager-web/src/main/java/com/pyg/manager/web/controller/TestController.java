package com.pyg.manager.web.controller;

import com.pyg.pojo.Address;
import com.pyg.sellergoods.api.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lf
 * @Title: TestController
 * @Description: TODO
 * @date 2018/7/31 11:05
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("dubbo")
    public String dubboTest() {
        return testService.say();
    }

    @RequestMapping("say")
    public String say() {
        return "hello";
    }

    @RequestMapping("db")
    public Address findById(Long id) {
        return testService.findById(id);
    }
}
