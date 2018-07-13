package com.linshen.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.linshen.dubbo.baseinterface.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/7/12
 * @Description: TODO
 */
@RestController
@RequestMapping("/time")
public class TimeController {
    @Reference(
            version = "${hello.service.version}",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}"
    )
    private TimeService timeService;

    @GetMapping
    public String sayHello(){
        return timeService.getTime();
    }
}
