package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrganicCatTest {

    private OrganicCat underTest;

    @BeforeEach
    public void setup(){
        underTest = new OrganicCat("Tom", 0,0,0,0);}

    @Test
    void cleanCageShouldDecreaseWasteLevelBy10() {
        underTest = new OrganicCat("Tom", 0,0,0,50);
        underTest.cleanCage();
        int expectedWaste = 40;
        assertEquals(expectedWaste, underTest.getWasteLevel());
        }


    @Test
    void waterShouldDecreaseThirstLevelBy10() {
        underTest = new OrganicCat("Tom", 0,75,0,0);
        underTest.water();
        int expectedThirst = 65;
        assertEquals(expectedThirst,underTest.getThirstLevel());
    }

    @Test
    void playShouldDecreaseBoredomLevelBy10() {
        underTest = new OrganicCat("Tom", 0,0,42,0);
        underTest.play();
        int expectedBoredom = 32;
        assertEquals(expectedBoredom, underTest.getBoredomLevel());
    }

    @Test
    void feedShouldDecreaseHungerLevelBy10() {
        underTest = new OrganicCat("Tom", 100,0,0,0);
        underTest.feed();
        int expectedHunger = 90;
        assertEquals(expectedHunger, underTest.getHungerLevel());
    }

    @Test
    void tickShouldIncreaseEveryLevelBy5() {
        underTest = new OrganicCat("Tom", 80,80,80,80);
        underTest.tick();
        int expectedHunger = 85;
        int expectedThirst = 85;
        int expectedBoredom = 84;
        int expectedWaste = 85;
        assertEquals(expectedHunger, underTest.getHungerLevel());
        assertEquals(expectedThirst, underTest.getThirstLevel());
        assertEquals(expectedBoredom, underTest.getBoredomLevel());
        assertEquals(expectedWaste, underTest.getWasteLevel());
    }



    @Test
    void updateHealth() {
        underTest = new OrganicCat("Tom", 40,60,60,10);
        underTest.updateHealth();
        int expectedHealth = 100;
        assertEquals(expectedHealth, underTest.getHealth());
//        Health actually goes up by 16 given all these levels but 100 is the max health
    }
}