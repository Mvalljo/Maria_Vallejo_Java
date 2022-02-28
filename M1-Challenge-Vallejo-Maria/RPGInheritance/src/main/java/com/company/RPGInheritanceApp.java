package com.company;

public class RPGInheritanceApp {

    public static void main(String[] args) {
        Constable constable = new Constable("Gordon","Gotham");
        Farmer farmer = new Farmer("Joker");
        Warrior warrior = new Warrior("Batman");

        System.out.println("Character stats");
        System.out.println("+----------------+--------+----------+--------+---------+-------+--------------+---------+----------+");
        System.out.println("| Character Type | Name   | Strength | Health | Stamina | Speed | Attack Power | Running | Arrested |");
        System.out.println("+----------------+--------+----------+--------+---------+-------+--------------+---------+----------+");
        System.out.println("| Constable      | "
                + constable.getName() + " | "
                + constable.getStrength() + "       | "
                + constable.getHealth() + "    | "
                + constable.getStamina() + "      | "
                + constable.getSpeed() + "    | "
                + constable.getAttackPower() + "            | "
                + constable.isRunning() + "   | "
                + constable.isArrested() + "    | "
        );
        System.out.println("+----------------+--------+----------+--------+---------+-------+--------------+---------+----------+");
        System.out.println("| Farmer         | "
                + farmer.getName() + "  | "
                + farmer.getStrength() + "       | "
                + farmer.getHealth() + "    | "
                + farmer.getStamina() + "      | "
                + farmer.getSpeed() + "    | "
                + farmer.getAttackPower() + "            | "
                + farmer.isRunning() + "   | "
                + farmer.isArrested() + "    | "
        );
        System.out.println("+----------------+--------+----------+--------+---------+-------+--------------+---------+----------+");
        System.out.println("| Warrior        | "
                + warrior.getName() + " | "
                + warrior.getStrength() + "       | "
                + warrior.getHealth() + "    | "
                + warrior.getStamina() + "     | "
                + warrior.getSpeed() + "    | "
                + warrior.getAttackPower() + "           | "
                + warrior.isRunning() + "   | "
                + warrior.isArrested() + "    | "
        );
        System.out.println("+----------------+--------+----------+--------+---------+-------+--------------+---------+----------+");

        System.out.println("-------------------------------------------------");
        System.out.println("Check if Constable can arrest another Character");
        System.out.println("--------------------------------------------------");
        System.out.println("Farmer " + farmer.getName() + " arrested status: " + farmer.isArrested());
        constable.arrest(farmer);
        System.out.println("Farmer " + farmer.getName() + " arrested status: " + farmer.isArrested());

        System.out.println("-------------------------------------------------");
        System.out.println("Check if Constable can attack another Character");
        System.out.println("-------------------------------------------------");
        System.out.println("Farmer " + farmer.getName() + " health status: " + farmer.getHealth());
        System.out.println("Constable " + constable.getName() + " attacked " + constable.attack(farmer));
        System.out.println("Farmer " + farmer.getName() + " health status: " + farmer.getHealth());

        System.out.println("-------------------------------------------------");
        System.out.println("Check the Constable jurisdiction");
        System.out.println("-------------------------------------------------");
        System.out.println("Constable " + constable.getName() + " Jurisdiction: " + constable.getJurisdiction());

        System.out.println("-------------------------------------------------");
        System.out.println("Check if the farmer can plow");
        System.out.println("-------------------------------------------------");
        System.out.println("Farmer plowing status: " + farmer.isPlowing());
        farmer.plowing();
        System.out.println("Farmer plowing status: " + farmer.isPlowing());

        System.out.println("-------------------------------------------------");
        System.out.println("Check if the farmer can harvest");
        System.out.println("-------------------------------------------------");
        System.out.println("Farmer harvesting status: " + farmer.isHarvesting());
        farmer.harvesting();
        System.out.println("Farmer harvesting status: " + farmer.isHarvesting());

        System.out.println("-------------------------------------------------");
        System.out.println("Check if the Farmer can attack another character");
        System.out.println("-------------------------------------------------");
        System.out.println("Constable " + constable.getName() + " health status: " + constable.getHealth());
        System.out.println("Farmer " + farmer.getName() + " attacked " + farmer.attack(constable));
        System.out.println("Constable " + constable.getName() + " health status: " + constable.getHealth());

        System.out.println("-------------------------------------------------");
        System.out.println("Check the warriors shield strength");
        System.out.println("-------------------------------------------------");
        System.out.println("Shield Strength: " + warrior.getShieldStrength());

        System.out.println("-------------------------------------------------");
        System.out.println("Check if the Warrior can attack another character");
        System.out.println("-------------------------------------------------");
        System.out.println("Farmer " + farmer.getName() + " health status: " + farmer.getHealth());
        System.out.println("Warrior " + warrior.getName() + " attacked " + warrior.attack(farmer));
        System.out.println("Farmer " + farmer.getName() + " health status: " + farmer.getHealth());

    }
}
