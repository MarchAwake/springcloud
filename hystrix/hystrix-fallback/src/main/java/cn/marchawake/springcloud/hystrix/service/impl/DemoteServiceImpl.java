package cn.marchawake.springcloud.hystrix.service.impl;

import cn.marchawake.springcloud.hystrix.service.DemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Slf4j
public class DemoteServiceImpl implements DemoteService {


    @Override
    public String sayHello() {
        return new String("Hello I am Working");
    }

    @Override
    public String retry(Integer time) {
        return new String("You are late AGAIN!");
    }

    @Override
    public String error() {

        log.info("Demote: I'm not a black sheep any more");
        return new String("Demote: I'm not a black sheep any more");
    }
}
