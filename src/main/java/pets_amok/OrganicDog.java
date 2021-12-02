package pets_amok;

public class OrganicDog extends OrganicPet implements Walkable {


    public OrganicDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int wasteLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, wasteLevel);
    }

    @Override
    public void cleanCage() {
        wasteLevel -= 10;
        if (wasteLevel < 0) {
            wasteLevel = 0;
        }
    }

    @Override
    public void water() {
        thirstLevel -= 10;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
    }

    @Override
    public void play() {
        boredomLevel -= 10;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
    }

    @Override
    public void feed() {
        hungerLevel -= 10;
        thirstLevel += 5;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    @Override
    public void tick() {
        hungerLevel += 6;
        thirstLevel += 6;
        boredomLevel += 5;
        wasteLevel += 9;
        updateHappiness();
        updateHealth();
    }

    @Override
    public void walk() {
        boredomLevel -= 15;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        hungerLevel += 10;
        thirstLevel += 10;
    }

    @Override
    protected void updateHealth() {
        if (thirstLevel > 50) {
            modifyHealth(-5);
        } else {
            modifyHealth(+5);
        }
        if (hungerLevel > 50) {
            modifyHealth(-5);
        } else {
            modifyHealth(+5);
        }
        if (boredomLevel > 50) {
            modifyHealth(-5);
        } else {
            modifyHealth(+5);
        }
        if (wasteLevel > 30) {
            modifyHealth(-5);
        } else {
            modifyHealth(+5);
        }
    }

    @Override
    public String getType() {
        return "Dog";
    }

}
