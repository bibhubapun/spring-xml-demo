package com.stackroute;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        System.out.println("Name: "+actor.getName()+" Gender:"+actor.getGender()+" age:"+actor.getAge());
    }
}
