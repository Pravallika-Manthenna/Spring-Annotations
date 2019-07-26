package com.stackroute.domain;


import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//configuration annotation
//property source is used to get the values from the property file

@Configuration
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {
//bean creating using annotation
    @Bean
    public Actor actorBean()
    {

        return new Actor();
    }

    @Bean
    @Scope("prototype")
    public Movie movieBean()
    {
        Movie movie = new Movie(actorBean());
        return movie;
    }

}


