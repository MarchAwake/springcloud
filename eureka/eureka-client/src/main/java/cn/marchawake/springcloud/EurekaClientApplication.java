package cn.marchawake.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaClientApplication.class);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        log.info("EurekaClientApplication 启动成功 \thttp://127.0.0.1:{}", env.getProperty("server.port"));
        log.info(env.getProperty("server.hostname"));
    }
}
