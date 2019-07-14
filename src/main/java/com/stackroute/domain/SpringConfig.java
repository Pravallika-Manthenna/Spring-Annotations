package com.stackroute.domain;


import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {

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


