package com.company;

public class Farmer extends Character{
    
    private boolean plowing;
    private boolean harvesting;
    
    public Farmer(String name) {
        
        super(name, 75, 100, 75, 10, 1,false,false);
        this.plowing = false;
        this.harvesting = false;
    }

    public void plowing() {
        System.out.println("Work, work, work...");
        setPlowing(true);
    }

    public void harvesting() {
        System.out.println("Hi-ho, hi-ho. It's off to the silo we go!");
        setHarvesting(true);
    }

    public boolean isPlowing() {
        return plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}
