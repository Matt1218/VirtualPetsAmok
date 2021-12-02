package pets_amok;

public class RoboticCat extends RoboticPet {
    public RoboticCat(String name, int oilLevel, int lusterLevel) {
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
    }

    @Override
    public void updateHealth() {
        if (oilLevel < 50) {
            modifyHealth(-10);
        } else {
            modifyHealth(+5);
        }
        if (lusterLevel < 75) {
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
