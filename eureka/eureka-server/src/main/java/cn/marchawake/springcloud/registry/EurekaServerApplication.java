package cn.marchawake.springcloud.registry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 服务注册中心启动类
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(EurekaServerApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        log.info("EnableEurekaServer 启动成功 \thttp://127.0.0.1:{} ", env.getProperty("server.port"));
    }
}
