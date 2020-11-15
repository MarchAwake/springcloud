package cn.marchawake.springcloud.hystrix;

import cn.marchawake.springcloud.hystrix.service.DemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final DemoteService service;

    @Autowired
    public Controller(DemoteService service) {
        this.service = service;
    }


    @GetMapping("demote")
    public String demote() {

        return service.error();
    }

    @GetMapping("retry")
    public String retry(@RequestParam Integer timeout) {

        return service.retry(timeout);
    }

    @GetMapping("sayHello")
    public String sayHello () {

        return service.sayHello();
    }


}
