package springcloud;

import cn.marchawake.springcloud.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{


    private final HelloService service;

    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("/sayHello")
    public String sayHello() {

       return service.sayHello();
    }
}
