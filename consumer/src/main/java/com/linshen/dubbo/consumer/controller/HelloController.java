package com.linshen.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.linshen.dubbo.baseinterface.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/7/10
 * @Description: TODO
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference(
            version = "${hello.service.version}",
            application = "${dubbo.application.id}",
//            url = "dubbo://localhost:12345"
            registry = "${dubbo.registry.id}"
    )
    private HelloService helloService;

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name){
        return helloService.sayHello(name);
    }

}
