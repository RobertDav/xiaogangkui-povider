package com.xiaogangkui.provider.impl;

import com.xiaogangkui.provider.service.DemoService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

/**
 * @author Created by luchunyu
 */
@Component
@Log4j
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        log.info("测试记录信息1"+name);
        return "hello "+name;
    }
}
