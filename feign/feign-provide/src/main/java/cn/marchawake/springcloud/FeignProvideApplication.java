package cn.marchawake.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignProvideApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(FeignProvideApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
