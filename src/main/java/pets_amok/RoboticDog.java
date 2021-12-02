package pets_amok;

public class RoboticDog extends RoboticPet implements Walkable {
    public RoboticDog(String name, int oilLevel, int lusterLevel) {
        super(name, oilLevel, lusterLevel);
    }

    @Override
    public void oil() {
        oilLevel += 10;
        modifyHealth(+20);
    }

    @Override
    public void polish() {
        lusterLevel += 10;
        modifyHealth(+20);

    }

    @Override
    public void tick() {
        oilLevel -= 5;
        lusterLevel -= 5;
        if (oilLevel < 0) {
            oilLevel = 0;
        }
        if (lusterLevel < 0) {
            lusterLevel = 0;
        }
        updateHappiness();
        updateHealth();
    }

    @Override
    public void walk() {
        oilLevel -= 13;
        lusterLevel -= 11;
        if (oilLevel < 0) {
            oilLevel = 0;
        }
        if (lusterLevel < 0) {
            lusterLevel = 0;
        }
    }

    @Override
    public void updateHealth() {
        if (oilLevel < 60) {
            modifyHealth(-15);
        } else {
            modifyHealth(+5);
        }
        if (lusterLevel < 40) {
            modifyHealth(-10);
        } else {
            modifyHealth(+5);
        }

    }

    @Override
    public String getType() {
        return "Dog";
    }

}
