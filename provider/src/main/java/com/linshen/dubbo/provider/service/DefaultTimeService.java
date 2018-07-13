package com.linshen.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.linshen.dubbo.baseinterface.service.TimeService;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/7/12
 * @Description: TODO
 */
@Service(
        version = "${hello.service.version}",
        application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultTimeService implements TimeService {
    @Override
    public String getTime() {

        return TimeZone.getDefault().getDisplayName()+new SimpleDateFormat("Y年M月d日H时m分s秒").format(System.currentTimeMillis());
    }
}
