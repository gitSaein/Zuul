package com.saeinlee.zuul.configuration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "service-group-1", configuration = LoadBalancerConfiguration.class)
public class RibbonClientConfig {

}