package com.company;

public class Constable extends Character{
    
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5,false,false);
        this.jurisdiction = jurisdiction;
    }

    public void arrest(Character enemy) {
        enemy.setArrested(true);
        System.out.println("Hey "+enemy.getName()+"! Halt! You're under arrest.");
    }


    public String getJurisdiction() {
        
        return jurisdiction;
    }

}
