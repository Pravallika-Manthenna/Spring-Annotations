package com.stackroute.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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

