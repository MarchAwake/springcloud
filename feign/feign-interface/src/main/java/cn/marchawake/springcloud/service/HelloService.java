package cn.marchawake.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-provider")
public interface HelloService {

    @GetMapping("sayHello")
    String sayHello();

    @GetMapping("retry")
    String retry(@RequestParam(name = "time") Integer time);

    @GetMapping("error")
    String error();
}
