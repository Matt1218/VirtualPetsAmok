package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoboticCatTest {

    private RoboticCat underTest;

    @BeforeEach
    public void setup() {
        underTest = new RoboticCat("Ana", 0, 0);
    }

    @Test
    void oilMethodShouldIncreaseOilLevelBy10() {
        underTest = new RoboticCat("Ana", 10, 0);
        underTest.oil();
        int expectedOilLevel = 20;
        assertEquals(expectedOilLevel, underTest.getOilLevel());

    }

    @Test
    void polishShouldIncreaseLusterLevelBy10() {
        underTest = new RoboticCat("Ana", 10, 15);
        underTest.polish();
        int expectedLusterLevel = 25;
        assertEquals(expectedLusterLevel, underTest.getLusterLevel());
    }

    @Test
    void tickShouldDecreaseOilAndLusterLevelsDownBy5() {
        underTest = new RoboticCat("Ana", 10, 10);
        underTest.tick();
        int expectedLusterLevel = 5;
        int expectedOilLevel = 5;
        assertEquals(expectedOilLevel, underTest.getOilLevel());
        assertEquals(expectedLusterLevel, underTest.getLusterLevel());
    }

    @Test
    void updateHealthShouldDecreaseHealthLevelBy20GivenTheseTwoValues() {
        underTest = new RoboticCat("Ana", 10, 10);
        underTest.updateHealth();
        int expectedHealth = 80;
        assertEquals(expectedHealth, underTest.getHealth());
    }
}