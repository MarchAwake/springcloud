package cn.marchawake.springcloud.hystrix.service;

import cn.marchawake.springcloud.hystrix.service.impl.DemoteServiceImpl;
import cn.marchawake.springcloud.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 继承接口
 */
@FeignClient(name = "service-provider", fallback = DemoteServiceImpl.class)
public interface DemoteService extends HelloService{
}
