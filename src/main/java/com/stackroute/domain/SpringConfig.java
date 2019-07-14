package com.stackroute.domain;


import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan("com.stackroute.domain")
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {

}


