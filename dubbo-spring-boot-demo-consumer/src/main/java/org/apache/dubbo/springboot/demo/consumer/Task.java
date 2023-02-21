package org.apache.dubbo.springboot.demo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2023-02-21 11:35
 **/
@Component
public class Task implements CommandLineRunner {

    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        String result = demoService.sayHello("word");
        System.out.println("Receive =====> result" + result);

        new Thread(()->{
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive result ======> " + demoService.sayHello("world"));
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
