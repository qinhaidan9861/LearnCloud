package com.qhd.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Qin
 * @date: 2023-02-16
 * @description:
 */
@Configuration
public class FeignConfig {
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
