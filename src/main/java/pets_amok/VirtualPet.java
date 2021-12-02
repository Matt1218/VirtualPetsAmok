package pets_amok;

public abstract class VirtualPet {

    public static final int MIN_VITAL_STAT = 0;
    public static final int MAX_VITAL_STAT = 100;

    protected int happiness;
    protected int health;
    protected String name;


    public int getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public VirtualPet(String name) {
        this.name = name;
        this.happiness = MAX_VITAL_STAT;
        this.health = MAX_VITAL_STAT;
    }

    protected abstract void updateHealth();

    protected void updateHappiness() {
        if (health < 30) {
            modifyHappiness(-20);
        } else if (health < 50) {
            modifyHappiness(-10);
        } else if (health < 70) {
            //happiness stays the same
        } else {
            modifyHappiness(-5);
        }
    }

    protected void modifyHealth(int amount) {
        health += amount;
        if (health < MIN_VITAL_STAT) {
            health = MIN_VITAL_STAT;
        }
        if (health > MAX_VITAL_STAT) {
            health = MAX_VITAL_STAT;
        }
    }

    protected void modifyHappiness(int amount) {
        happiness += amount;
        if (happiness < MIN_VITAL_STAT) {
            happiness = MIN_VITAL_STAT;
        }
        if (happiness > MAX_VITAL_STAT) {
            happiness = MAX_VITAL_STAT;
        }
    }

    public abstract String getType();


}
