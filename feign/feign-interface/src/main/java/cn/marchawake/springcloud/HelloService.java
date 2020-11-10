package cn.marchawake.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FeignProvide")
public interface HelloService {

    @GetMapping("/sayHello")
    String sayHello();
}
