package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
  public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    //autowired is used to create beans
@Autowired
    Actor actor;

  public Movie(Actor actor) {
    this.actor = actor;
  }

  public void setActor(Actor actor) {
      this.actor = actor;
    }
    public void displayActor()
    {
      actor.display();
    }

    //implemeting bean factory aware
  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("Bean Factory implemented");

  }

    //implementing bean name aware
  @Override
  public void setBeanName(String s) {
    System.out.println("Bean name implemented");
  }

    //implementing application context aware
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("Application context implemented ");
  }
}

