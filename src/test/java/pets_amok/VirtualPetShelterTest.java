package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VirtualPetShelterTest {

    private VirtualPetShelter underTest;

    @BeforeEach
    public void setup(){
        underTest = new VirtualPetShelter();
    }

    @Test
    public void VirtualPetShelterBeginsWithDefaultPets(){
        assertEquals(1,underTest.getOrganicPets().size());
        assertEquals(1,underTest.getRoboticPets().size());
    }

    @Test
    public void intakePetShouldAddOrganicCatToOrganicPetMap(){
    OrganicCat testCat = new OrganicCat("Lewis",0,0,0,0);

    underTest.intakePet(testCat);

    assertEquals(2,underTest.getOrganicPets().size());
    }

    @Test
    public void intakePetShouldAddOrganicDogToOrganicPetMap(){
        OrganicDog testDog = new OrganicDog("Tom",0,0,0,0);

        underTest.intakePet(testDog);

        assertEquals(2,underTest.getOrganicPets().size());
    }

    @Test
    public void intakePetShouldAddRoboticDogToRoboticPetMap(){
        RoboticDog testDog = new RoboticDog("Jim",0,0);

        underTest.intakePet(testDog);

        assertEquals(2,underTest.getRoboticPets().size());
    }


    @Test
    void findByNameShouldFindPetNamedBob() {
        VirtualPet actualPet = underTest.findByName("Bob");
        VirtualPet expectedPet = underTest.getOrganicPets().get("Bob");
        assertEquals(expectedPet,actualPet);
    }

    @Test
    void findByNameShouldFindPetNamedJeff() {
        VirtualPet actualPet = underTest.findByName("Jeff");
        VirtualPet expectedPet = underTest.getRoboticPets().get("Jeff");
        assertEquals(expectedPet,actualPet);
    }

    @Test
    void feedAllShouldDecreaseHungerLevelBy10ForAllOrganicPets() {
        underTest.feedAll();
        int expectedHunger = 40;
        assertEquals(expectedHunger, underTest.getOrganicPets().get("Bob").getHungerLevel());
    }

    @Test
    void waterAllShouldDecreaseThirstLevelBy10ForAllOrganicPets() {
        underTest.waterAll();
        int expectedThirst =20;
        assertEquals(expectedThirst, underTest.getOrganicPets().get("Bob").getThirstLevel());
    }

    @Test
    void playWithAllShouldDecreaseBoredomLevelBy10ForAllOrganicPets() {
        underTest.playWithAll();
        int expectedBoredom = 60;
        assertEquals(expectedBoredom, underTest.getOrganicPets().get("Bob").getBoredomLevel());
    }

    @Test
    void cleanAllCagesShouldDecreaseWasteLevelBy10ForAllOrganicPets() {
        underTest.cleanAllCages();
        int expectedWaste = 5;
        assertEquals(expectedWaste, underTest.getOrganicPets().get("Bob").getWasteLevel());
    }

    @Test
    void oilAllShouldIncreaseOilLevelForAllRoboticPetsBy10() {
        underTest.OilAll();
        int expectedOil = 80;
        assertEquals(expectedOil, underTest.getRoboticPets().get("Jeff").getOilLevel());
    }

    @Test
    void polishAllShouldIncreaseLusterLevelForAllRoboticPetsBy10() {
        underTest.polishAll();
        int expectedLuster = 100;
        assertEquals(expectedLuster, underTest.getRoboticPets().get("Jeff").getLusterLevel());
    }

    @Test
    void walkDogsShouldWalkAllDogsBothOrganicAndRobotic() {
        RoboticDog testRoboticDog = new RoboticDog("Oscar",60,70);
        underTest.intakePet(testRoboticDog);
        underTest.walkDogs();
        int expectedBoredom = 55;
        int expectedOilLevel = 47;
        int expectedLusterLevel = 59;
        assertEquals(expectedBoredom, underTest.getOrganicPets().get("Bob").getBoredomLevel());
        assertEquals(expectedOilLevel, underTest.getRoboticPets().get("Oscar").getOilLevel());
        assertEquals(expectedLusterLevel, underTest.getRoboticPets().get("Oscar").getLusterLevel());

    }

    @Test
    void tickAllShouldChangeCatThirstLevelAndOilLevelOnDog() {
        underTest.tickAll();
        int expectedThirst = 36;
        int expectedOilLevel = 65;
        assertEquals(expectedThirst,underTest.getOrganicPets().get("Bob").getThirstLevel());
        assertEquals(expectedOilLevel, underTest.getRoboticPets().get("Jeff").getOilLevel());
    }

    @Test
    void adoptPetShouldRemoveOrganicPetFromShelter(){
        underTest.adoptPet("Bob");
        assertEquals(0,underTest.getOrganicPets().size());
    }

    @Test
    void adoptPetShouldRemoveRoboticPetFromShelter(){
        underTest.adoptPet("Jeff");
        assertEquals(0,underTest.getRoboticPets().size());
    }
}