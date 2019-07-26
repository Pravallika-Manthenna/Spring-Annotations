package com.stackroute;



import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//replacing xml file with config file
public class Main {
  public  static  void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    Movie movie = context.getBean(Movie.class);
    movie.displayActor();


  }
}
