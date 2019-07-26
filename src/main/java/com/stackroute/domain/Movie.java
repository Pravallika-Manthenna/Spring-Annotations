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

    //autowire is used which creates beans
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
//implemenatation of bean name aware
  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("Application Context implemented");

  }
//implementation method of bean factory aware
  @Override
  public void setBeanName(String s) {
    System.out.println("Bean factory implemented");
  }
//implementation of application context aware
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("Bean Name implemented ");
  }
}

