package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//configuration annotation
//property source is used to get the values from the property file
@Configuration
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {
//bean creating using annotation
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Actor actorBean()
    {
        return new Actor();
    }

    @Bean
    public Movie movieBean()
    {
        Movie movie = new Movie(actorBean());
        return movie;
    }

}


