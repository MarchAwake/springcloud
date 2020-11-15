//package cn.marchawake.springcloud.consumer;
//
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 全局配置
// * 可以配置在启动类中
// */
//@Configuration
//@RibbonClient(name = "service-provider", configuration = {CustomRule.class})
//public class RibbonConfiguration {
//
////    配置加载顺序：application.yml > application.properties > 类注解
////    com.netflix.loadbalancer.RandomRule.class 随机
////    com.netflix.loadbalancer.RoundRobinRule  轮询
//
//
//
//    // 使用随机负载均衡策略
////    @Bean
////    public IRule defaultLBStrategy() {
////
////        return new RandomRule();
////    }
//}
