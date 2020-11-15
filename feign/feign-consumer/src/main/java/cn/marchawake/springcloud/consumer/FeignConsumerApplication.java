package cn.marchawake.springcloud.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "cn.marchawake.springcloud")
@RibbonClient(name = "service-provider", configuration = {com.netflix.loadbalancer.BestAvailableRule.class})
public class FeignConsumerApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(FeignConsumerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
