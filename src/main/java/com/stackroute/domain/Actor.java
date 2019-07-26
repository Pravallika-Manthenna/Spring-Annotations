package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class Actor {
//using value annotation to get the value of the variable
  @Value("${actor.name}")
  String name;
  @Value("${actor.gender}")
  String gender;
  @Value("${actor.age}")
  int age;



  public void display(){
    System.out.println("actor details: "+ "\n" + name + "\n" + gender + "\n"  + age);
  }
}
