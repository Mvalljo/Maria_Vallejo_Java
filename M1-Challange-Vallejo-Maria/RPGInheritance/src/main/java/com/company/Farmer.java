package com.company;

public class Farmer extends Character{
    
    private boolean plowing;
    private boolean harvesting;
    
    public Farmer(String name) {
        
        super(name, 75, 100, 75, 10, 1,false,false);
        this.plowing = false;
        this.harvesting = false;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }
}
