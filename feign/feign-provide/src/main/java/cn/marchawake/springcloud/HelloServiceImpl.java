package cn.marchawake.springcloud;

import cn.marchawake.springcloud.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Value("${server.port}")
    String port;

    @Override
    public String sayHello() {

        System.out.println("Hello this is the" + port);
        return "Hello this is the" + port;
    }

    @Override
    public String retry(Integer time) {

        while (--time >= 0) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        log.info("I am retrying, port: {}", port);
        return port;
    }

    @Override
    public String error() {
        throw new RuntimeException("I am a black sheep");
    }
}
