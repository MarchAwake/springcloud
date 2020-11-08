package cn.marchawake.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provider")
@Slf4j
public class CustomController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHello")
    public String sayHello() {
        return "This is " + port;
    }

    @PostMapping("/sayHello")
    public Friend sayHelloByPost(@RequestBody Friend friend) {

        log.info("You are :{}", friend.getName());
        friend.setPort(port);
        return friend;
    }
}
