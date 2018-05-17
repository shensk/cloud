package me.ssoo.Hystrix;

import me.ssoo.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
