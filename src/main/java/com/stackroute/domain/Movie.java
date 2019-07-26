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

//component annotation
@Component
  public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    // autowired is used for creaing beans
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
//implementing bean factory aware method
  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("Application Context implemented");

  }
//implementing bean name aware method
  @Override
  public void setBeanName(String s) {
    System.out.println("Bean factory implemented");
  }
//implementing  application context aware method
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("Bean Name implemented ");
  }
}

