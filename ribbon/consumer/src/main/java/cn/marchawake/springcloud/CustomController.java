package cn.marchawake.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class CustomController {

    private final RestTemplate template;

    @Autowired
    public CustomController(RestTemplate template) {
        this.template = template;
    }

    @GetMapping("/sayHello")
    public String sayHello() {

        return template.getForObject("http://EurekaClient/provider/sayHello", String.class);
    }
}
