package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class DuckRacer {
    private int id;
    private String name;
    private final Collection<Reward> rewards = new ArrayList<>();

    //ctor
    public DuckRacer (int id, String name){
        this.id = id;
        setName(name);
    }

    // business methods
    public void win(Reward reward){
        rewards.add(reward);
    }

    // accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Reward> getRewards(){
        return Collections.unmodifiableCollection(rewards);
    }

    // derived property
    public int getWins(){
        return rewards.size();
    }

    @Override
    public String toString(){
        return String.format("%s: id = %s; name = %s; wins = %s; rewards = %s",
                getClass().getSimpleName(), getId(), getName(), getWins(), getRewards());
    }
}