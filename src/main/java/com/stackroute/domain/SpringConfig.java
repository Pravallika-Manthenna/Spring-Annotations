package com.stackroute.domain;


import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//configuration annotation
//property source is used to get the values from the property file
@Configuration
@ComponentScan("com.stackroute.domain")
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {

}


