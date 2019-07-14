package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Actor {

  @Value("${actor.name}")
  String name;
  @Value("${actor.gender}")
  String gender;
  @Value("${actor.age}")
  int age;

  public Actor(){}

  public void display(){
    System.out.println("actor details: "+ "\n" + name + "\n" + gender + "\n"  + age);
  }
}
