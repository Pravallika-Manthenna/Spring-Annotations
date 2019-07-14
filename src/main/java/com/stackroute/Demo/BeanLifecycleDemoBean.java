package com.stackroute.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


  public void customInit(){
    System.out.println("custom is initiated");

  }

  public void customDestroy(){
    System.out.println("custom is destroyed");
  }

  @Override
  public void afterPropertiesSet() throws Exception {

    System.out.println("after properties set implemented");

  }

  @Override
  public void destroy() throws Exception {
    System.out.println("destroy is implemented");

  }
}
