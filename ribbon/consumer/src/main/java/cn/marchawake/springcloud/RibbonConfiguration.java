package cn.marchawake.springcloud;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置
 * 可以配置在启动类中
 */
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
