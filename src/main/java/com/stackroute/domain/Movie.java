package com.stackroute.domain;

import org.springframework.stereotype.Component;
//component annotation is used 
@Component
  public class Movie {


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

  }

