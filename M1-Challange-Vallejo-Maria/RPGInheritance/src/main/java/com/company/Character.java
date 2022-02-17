package com.company;

public class Character {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;

    public Character(
            String name, 
            int strength, 
            int health, 
            int stamina, 
            int speed, 
            int attackPower,
            boolean running,
            boolean arrested
    ) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        this.arrested = arrested;
    }

    public void run() {
        System.out.println("I AM RUNNING");
    }

    public void attack(Character enemy) {
        enemy.decreaseHealth(this.attackPower);
    }

    public void heal(int amount) {
        this.health += amount;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void increaseStamina(int amount) {
        this.stamina += amount;
    }

    public void decreaseStamina(int amount) {
        this.stamina -= amount;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
