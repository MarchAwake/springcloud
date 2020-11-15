package cn.marchawake.springcloud;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置
 * 可以配置在启动类中
 */
//在配置类中加入 RibbonClient(name = "服务提供者名称", configuration = "com.netflix.loadbalancer.RandomRule") 注解
@Configuration
@RibbonClient(name = "EurekaClient", configuration = {CustomRule.class})
public class RibbonConfiguration {

    // 使用随机负载均衡策略
//    @Bean
//    public IRule defaultLBStrategy() {
//
//        return new RandomRule();
//    }
}
