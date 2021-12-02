package pets_amok;

public class OrganicCat extends OrganicPet {


    public OrganicCat(String name, int hungerLevel, int thirstLevel, int boredomLevel, int wasteLevel) {
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
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 4;
        wasteLevel += 5;
        updateHappiness();
        updateHealth();
    }

    @Override
    protected void updateHealth() {
        if (thirstLevel > 70) {
            modifyHealth(-4);
        } else {
            modifyHealth(+2);
        }
        if (hungerLevel > 50) {
            modifyHealth(-5);
        } else {
            modifyHealth(+5);
        }
        if (boredomLevel > 70) {
            modifyHealth(-4);
        } else {
            modifyHealth(+4);
        }
        if (wasteLevel > 20) {
            modifyHealth(-10);
        } else {
            modifyHealth(+5);
        }
    }

    @Override
    public String getType() {
        return "Cat";
    }

}
