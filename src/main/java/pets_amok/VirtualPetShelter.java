package pets_amok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, OrganicPet> organicPets = new HashMap<>();
    private Map<String, RoboticPet> roboticPets = new HashMap<>();

    public VirtualPetShelter() {
        OrganicDog defaultOrganicDog = new OrganicDog("Bob", 50, 30, 70, 15);
        organicPets.put("Bob", defaultOrganicDog);

        RoboticCat defaultRoboticCat = new RoboticCat("Jeff", 70, 90);
        roboticPets.put("Jeff", defaultRoboticCat);
    }

    public void adoptPet(String name) {
        organicPets.remove(name);
        roboticPets.remove(name);
    }


    public Map<String, OrganicPet> getOrganicPets() {
        return organicPets;
    }

    public Map<String, RoboticPet> getRoboticPets() {
        return roboticPets;
    }

    public VirtualPet findByName(String name) {
        VirtualPet foundPet = organicPets.get(name);
        if (foundPet == null) {
            foundPet = roboticPets.get(name);
        }
        return foundPet;
    }

    public void feedAll() {
        for (OrganicPet organicPet : organicPets.values()) {
            organicPet.feed();
        }
    }

    public void waterAll() {
        for (OrganicPet organicPet : organicPets.values()) {
            organicPet.water();
        }
    }

    public void playWithAll() {
        for (OrganicPet organicPet : organicPets.values()) {
            organicPet.play();
        }
    }

    public void cleanAllCages() {
        for (OrganicPet organicPet : organicPets.values()) {
            organicPet.cleanCage();
        }
    }

    public void OilAll() {
        for (RoboticPet roboticPet : roboticPets.values()) {
            roboticPet.oil();
        }
    }

    public void polishAll() {
        for (RoboticPet roboticPet : roboticPets.values()) {
            roboticPet.polish();
        }
    }

    public void walkDogs() {
        for (OrganicPet organicPet : organicPets.values()) {
            if (organicPet instanceof Walkable) {
                Walkable dog = (Walkable) organicPet;
                dog.walk();
            }
        }
        for (RoboticPet roboticPet : roboticPets.values()) {
            if (roboticPet instanceof Walkable) {
                Walkable dog = (Walkable) roboticPet;
                dog.walk();
            }
        }
    }

    public void tickAll() {

        for (OrganicPet organicPet : organicPets.values()) {
            if (organicPet instanceof Tickable) {
                Tickable dog = (Tickable) organicPet;
                dog.tick();
            }
        }
        for (RoboticPet roboticPet : roboticPets.values()) {
            if (roboticPet instanceof Tickable) {
                Tickable dog = (Tickable) roboticPet;
                dog.tick();
            }
        }
    }

    public void intakePet(VirtualPet newPet) {
        if (newPet instanceof OrganicPet) {
            organicPets.put(newPet.getName(), (OrganicPet) newPet);
        }
        if (newPet instanceof RoboticPet) {
            roboticPets.put(newPet.getName(), (RoboticPet) newPet);
        }
    }
}
