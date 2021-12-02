package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrganicDogTest {

    private OrganicDog underTest;

    @BeforeEach
    public void setup(){
        underTest = new OrganicDog("Bob", 0,0,0,0);
    }

    @Test
    void cleanCageMethodShouldBringWasteLevelDownBy10() {
        underTest = new OrganicDog("Bob", 0,0,0,30);
        underTest.cleanCage();
        assertEquals(20, underTest.getWasteLevel());
    }

    @Test
    void waterMethodShouldBringThirstLevelDownBy10() {
        underTest = new OrganicDog("Bob", 0,30,0,0);
        underTest.water();
        assertEquals(20, underTest.getThirstLevel());
    }

    @Test
    void playMethodShouldBringBoredomLevelDownBy10() {
        underTest = new OrganicDog("Bob", 0,0,50,0);
        underTest.play();
        assertEquals(40, underTest.getBoredomLevel());
    }

    @Test
    void feedMethodShouldBringDownHungerLevelBy10() {
        underTest = new OrganicDog("Bob", 100,0,0,0);
        underTest.feed();
        assertEquals(90, underTest.getHungerLevel());
    }

    @Test
    void tick() {
        underTest = new OrganicDog("Bob", 50,50,50,50);
        underTest.tick();
        assertEquals(56, underTest.getHungerLevel());
        assertEquals(56, underTest.getThirstLevel());
        assertEquals(55, underTest.getBoredomLevel());
        assertEquals(59, underTest.getWasteLevel());
        assertEquals(95, underTest.getHappiness());
        assertEquals(80, underTest.getHealth());
    }

    @Test
    void walkShouldDecreaseBoredomLevelBy15() {
        underTest = new OrganicDog("Bob", 0,0,50,0);
        underTest.walk();
        assertEquals(35, underTest.getBoredomLevel());
    }

    @Test
    void updateHealthShouldDecreaseBy20IfAll4LevelsAreAboveCertainNumber() {
        underTest = new OrganicDog("Bob", 100,51,53,70);
        underTest.updateHealth();
        assertEquals(80, underTest.getHealth());
    }
}