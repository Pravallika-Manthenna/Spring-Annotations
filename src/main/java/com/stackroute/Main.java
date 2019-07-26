package com.stackroute;



import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
  //replacing beans.xml with config class
public class Main {
  public  static  void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    Movie movie = context.getBean(Movie.class);
    movie.displayActor();
    Movie movie1 = context.getBean(Movie.class);
    movie1.displayActor();
    System.out.println(movie==movie1);

  }
}
