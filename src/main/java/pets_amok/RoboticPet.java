package pets_amok;

public abstract class RoboticPet extends VirtualPet implements Tickable {

    protected int oilLevel;
    protected int lusterLevel;

    public int getOilLevel() {
        return oilLevel;
    }

    public int getLusterLevel() {
        return lusterLevel;
    }


    public RoboticPet(String name, int oilLevel, int lusterLevel) {
        super(name);
        this.oilLevel = oilLevel;
        this.lusterLevel = lusterLevel;
    }


    public abstract void oil();

    public abstract void polish();


}
