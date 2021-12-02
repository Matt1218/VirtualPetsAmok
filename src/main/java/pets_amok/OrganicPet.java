package pets_amok;

public abstract class OrganicPet extends VirtualPet implements Tickable {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;
    protected int wasteLevel;


    public OrganicPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int wasteLevel) {
        super(name);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.wasteLevel = wasteLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getWasteLevel() {
        return wasteLevel;
    }


    public abstract void cleanCage();

    public abstract void water();

    public abstract void play();

    public abstract void feed();
}
