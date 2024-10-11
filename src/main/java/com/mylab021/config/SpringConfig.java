package com.mylab021.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mylab021.service", "com.mylab021.dao"})
public class SpringConfig {
}
