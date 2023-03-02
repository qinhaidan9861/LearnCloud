package com.qhd.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author: Qin
 * @date: 2023-02-15
 * @description:
 */
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
