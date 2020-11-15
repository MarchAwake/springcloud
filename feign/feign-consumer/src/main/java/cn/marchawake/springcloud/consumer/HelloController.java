package cn.marchawake.springcloud.consumer;

import cn.marchawake.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{


    private final HelloService service;

    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("sayHello")
    public String sayHello() {

       return service.sayHello();
    }

    @GetMapping("retry")
    public String retry(@RequestParam(name = "time") Integer time) {

        return service.retry(time);
    }
}
