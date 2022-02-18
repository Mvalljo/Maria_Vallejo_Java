package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPGInheritanceAppTest {

    Constable constable;
    Farmer farmer;
    Warrior warrior;

    @Before
    public void setUp(){
        constable = new Constable("Gordon","Gotham");
        farmer = new Farmer("Joker");
        warrior =new Warrior("Batman");
    }

    @Test
    public void shouldReturnName() {
        assertEquals("Gordon",constable.getName());
        assertEquals("Joker",farmer.getName());
        assertEquals("Batman",warrior.getName());
    }

    @Test
    public void shouldReturnStartingStatsForConstable() {
        assertEquals(60,constable.getStrength());
        assertEquals(100,constable.getHealth());
        assertEquals(60,constable.getStamina());
        assertEquals(20,constable.getSpeed());
        assertEquals(5,constable.getAttackPower());
    }

    @Test
    public void shouldReturnStartingStatsForFarmer() {
        assertEquals(75,farmer.getStrength());
        assertEquals(100,farmer.getHealth());
        assertEquals(75,farmer.getStamina());
        assertEquals(10,farmer.getSpeed());
        assertEquals(1,farmer.getAttackPower());
    }

    @Test
    public void shouldReturnStartingStatsForWarrior() {
        assertEquals(75,warrior.getStrength());
        assertEquals(100,warrior.getHealth());
        assertEquals(100,warrior.getStamina());
        assertEquals(50,warrior.getSpeed());
        assertEquals(10,warrior.getAttackPower());
    }

    @Test
    public void shouldReturnRunningTrue() {
        constable.setRunning(true);
        farmer.setRunning(true);
        warrior.setRunning(true);

        assertTrue(constable.isRunning());
        assertTrue(farmer.isRunning());
        assertTrue(warrior.isRunning());
    }

    @Test
    public void shouldReturnRunningFalse() {
        assertFalse(constable.isRunning());
        assertFalse(farmer.isRunning());
        assertFalse(warrior.isRunning());
    }

    @Test
    public void shouldReturnArrestedTrue() {
        constable.setArrested(true);
        farmer.setArrested(true);
        warrior.setArrested(true);

        assertTrue(constable.isArrested());
        assertTrue(farmer.isArrested());
        assertTrue(warrior.isArrested());
    }

    @Test
    public void shouldReturnArrestedFalse() {
        assertFalse(constable.isArrested());
        assertFalse(farmer.isArrested());
        assertFalse(warrior.isArrested());
    }

    // Attack other Characters Test

    @Test
    public void shouldReturnAttackedCharactersName() {
        assertEquals("Joker",constable.attack(farmer));
        assertEquals("Gordon",farmer.attack(constable));
        assertEquals("Joker",warrior.attack(farmer));
    }

    @Test
    public void shouldReturnFarmersDecreasedHealthStatusBecauseOfAttackFromConstable() {
        constable.attack(farmer);

        assertEquals(95,farmer.getHealth());
    }

    @Test
    public void shouldReturnConstableDecreasedHealthStatusBecauseOfAttackFromFarmer() {
        farmer.attack(constable);

        assertEquals(99,constable.getHealth());
    }

    @Test
    public void shouldReturnFarmersDecreasedHealthStatusBecauseOfAttackFromWarrior() {
        warrior.attack(farmer);

        assertEquals(90,farmer.getHealth());
    }

     //Constable other properties and abilities

    @Test
    public void shouldReturnJurisdiction() {
        assertEquals("Gotham",constable.getJurisdiction());
    }

    @Test
    public void shouldReturnArrestedCharacterStatusTrue() {
        constable.arrest(farmer);
        assertTrue(farmer.isArrested());
    }

    //Farmer other properties

    @Test
    public void shouldReturnPlowingFalse() {
        assertFalse(farmer.isPlowing());
    }

    @Test
    public void shouldReturnPlowingTrue() {
        farmer.plowing();
        assertTrue(farmer.isPlowing());
    }

    @Test
    public void shouldReturnHarvestingFalse() {
        assertFalse(farmer.isHarvesting());
    }

    @Test
    public void shouldReturnHarvestingTrue() {
        farmer.harvesting();
        assertTrue(farmer.isHarvesting());
    }

    //Warrior other properties

    @Test
    public void shouldReturnShieldStrengthInitialStatus() {
        assertEquals(100,warrior.getShieldStrength());
    }
}