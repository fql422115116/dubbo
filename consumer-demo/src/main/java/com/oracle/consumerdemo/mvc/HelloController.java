package com.oracle.consumerdemo.mvc;

import com.alibaba.dubbo.config.annotation.Reference;
import com.oracle.providerdemo.dao.ProviderInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Reference
    ProviderInterface providerInterface;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
       return providerInterface.sayHello("james");

    }
}
