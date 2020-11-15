package cn.marchawake.springcloud.hystrix;

import cn.marchawake.springcloud.service.HelloService;
import feign.Feign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"cn.marchawake.springcloud.hystrix.service", "cn.marchawake.springcloud.service"})
@EnableCircuitBreaker
@RibbonClient(name = "service-provider", configuration = {com.netflix.loadbalancer.BestAvailableRule.class})
@Slf4j
public class HystrixApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(HystrixApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        ConfigurableEnvironment env = app.run(args).getEnvironment();

//        try {
//            System.out.println(Feign.configKey(HelloService.class, HelloService.class.getMethod("retry", Integer.class)));
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

        log.info("Hystrix 启动成功：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}


