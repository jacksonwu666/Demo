package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.DemoService;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2023-02-21 11:26
 **/
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
