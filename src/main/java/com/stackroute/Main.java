package com.stackroute;
import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public  static  void main(String[] args) {
    //replacing beans.xml with config class
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    Movie movie = context.getBean("movieBean", Movie.class);
    movie.displayActor();
  }
}
