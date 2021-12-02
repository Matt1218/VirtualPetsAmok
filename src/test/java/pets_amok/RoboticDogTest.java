package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoboticDogTest {

    private RoboticDog underTest;

    @BeforeEach
    public void setup() {
        underTest = new RoboticDog("Dilbert", 20, 20);
    }

    @Test
    void oilShouldIncreaseOilLevelBy10() {
        underTest = new RoboticDog("Dilbert", 20, 20);
        underTest.oil();
        int expectedOilLevel = 30;
        assertEquals(expectedOilLevel, underTest.getOilLevel());
    }

    @Test
    void polishShouldIncreaseLusterLevelBy10() {
        underTest = new RoboticDog("Dilbert", 20, 20);
        underTest.polish();
        int expectedLusterLevel = 30;
        assertEquals(expectedLusterLevel, underTest.getLusterLevel());
    }

    @Test
    void tickShouldDecreaseOilAndLusterLevelsEachBy5() {
        underTest = new RoboticDog("Dilbert", 20, 20);
        underTest.tick();
        int expectedOilLevel = 15;
        int expectedLusterLevel = 15;
        assertEquals(expectedOilLevel, underTest.getOilLevel());
        assertEquals(expectedLusterLevel, underTest.getLusterLevel());
    }

    @Test
    void walk() {
        underTest = new RoboticDog("Dilbert", 20, 20);
        underTest.walk();
        int expectedOilLevel = 7;
        int expectedLusterLevel = 9;
        assertEquals(expectedOilLevel, underTest.getOilLevel());
        assertEquals(expectedLusterLevel, underTest.getLusterLevel());
    }

    @Test
    void updateHealth() {
        underTest = new RoboticDog("Dilbert", 10, 10);
        underTest.updateHealth();
        int expectedHealth = 75;
        assertEquals(expectedHealth, underTest.getHealth());
    }


}