package cn.marchawake.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloService{

    @Value("${server.port}")
    String port;

    @Override
    public String sayHello() {

        System.out.println("Hello this is the" + port);
        return "Hello this is the" + port;
    }
}
