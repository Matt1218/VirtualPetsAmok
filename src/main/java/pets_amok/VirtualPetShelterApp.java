package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        System.out.println("\nThanks for volunteering at Matt's Virtual Pet Shelter!\n");

        while (shouldContinue) {

            System.out.println("\nHere are all the Organic Pets in the Shelter: \n");

            System.out.println("| Name \t\t| Hunger \t| Thirst \t| Boredom \t| Waste\t| Type ");
            System.out.println("-------------------------------------------------");

            for (OrganicPet organicPet : virtualPetShelter.getOrganicPets().values()) {
                String name = organicPet.getName();
                String hunger = "" + organicPet.getHungerLevel();
                String thirst = "" + organicPet.getThirstLevel();
                String boredom = "" + organicPet.getBoredomLevel();
                String waste = "" + organicPet.getWasteLevel();
                String type = organicPet.getType();

                System.out.println("| " + name + "\t\t| " + hunger + "\t\t| " + thirst + "\t\t| " + boredom + "\t\t| " + waste + "\t\t| " + type);

            }

            System.out.println("\nHere are all the Robotic Pets in the Shelter: \n");
            System.out.println("| Name \t\t| Oil Level \t| Luster Level \t| Type");
            System.out.println("-------------------------------------------------");


            for (RoboticPet roboticPet : virtualPetShelter.getRoboticPets().values()) {
                String name = roboticPet.getName();
                String oil = "" + roboticPet.getOilLevel();
                String luster = "" + roboticPet.getLusterLevel();
                String type = roboticPet.getType();

                System.out.println("| " + name + "\t\t| " + oil + "\t\t| " + luster + "\t\t| " + type);
            }


            System.out.println("\nWhat would you like to do?\n");
            System.out.println("1. Feed the Organic pets");
            System.out.println("2. Water the Organic pets");
            System.out.println("3. Play with the pets");
            System.out.println("4. Walk all the dogs");
            System.out.println("5. Clean the cages");
            System.out.println("6. Oil the Robotic pets");
            System.out.println("7. Polish the Robotic pets");
            System.out.println("8. Adopt a pet");
            System.out.println("9. Admit a pet");
            System.out.println("10. Pass time");
            System.out.println("11. Quit");

            System.out.println("\nPlease enter a command\n");
            String userInput = scanner.nextLine();

            if ("1".equals(userInput)) {
                System.out.println("You are feeding all the organic pets");
                virtualPetShelter.feedAll();
                virtualPetShelter.tickAll();

            } else if ("2".equals(userInput)) {
                System.out.println("You are giving water to all the organic pets");
                virtualPetShelter.waterAll();
                virtualPetShelter.tickAll();

            } else if ("3".equals(userInput)) {
                System.out.println("You are playing with all the pets");
                virtualPetShelter.playWithAll();
                virtualPetShelter.tickAll();

            } else if ("4".equals(userInput)) {
                System.out.println("You are walking all the dogs");
                virtualPetShelter.walkDogs();
                virtualPetShelter.tickAll();

            } else if ("5".equals(userInput)) {
                System.out.println("Cleaning the cages...");
                virtualPetShelter.cleanAllCages();

            } else if ("6".equals(userInput)) {
                System.out.println("You are replenishing the oil for the robotic pets");
                virtualPetShelter.OilAll();
                virtualPetShelter.tickAll();

            } else if ("7".equals(userInput)) {
                System.out.println("You are polishing all the robotic pets");
                virtualPetShelter.polishAll();
                virtualPetShelter.tickAll();

            } else if ("8".equals(userInput)) {

                System.out.println("Which pet would you like to adopt?");
                System.out.println("Please enter their name");

                userInput = scanner.nextLine();
                virtualPetShelter.adoptPet(userInput);

            } else if ("9".equals(userInput)) {

                System.out.println("What is the pet's name?");
                userInput = scanner.nextLine();
                String petName = userInput;

                System.out.println("What type of pet would you like?");
                System.out.println("1. Organic Dog");
                System.out.println("2. Organic Cat");
                System.out.println("3. Robotic Dog");
                System.out.println("4. Robotic Cat");

                userInput = scanner.nextLine();
                String menuOption = userInput;
                VirtualPet petToAdmit = null;
                if ("1".equals(menuOption)) {
                    petToAdmit = new OrganicDog(petName, 10, 10, 0, 0);
                } else if ("2".equals(menuOption)) {
                    petToAdmit = new OrganicCat(petName, 5, 5, 0, 0);
                } else if ("3".equals(menuOption)) {
                    petToAdmit = new RoboticDog(petName, 75, 75);
                } else if ("4".equals(menuOption)) {
                    petToAdmit = new RoboticCat(petName, 75, 75);
                }

                if (petToAdmit != null) {
                    virtualPetShelter.intakePet(petToAdmit);
                } else {
                    System.out.println("Please choose 1, 2, 3, or 4");

                }

            } else if ("10".equals(userInput)) {
                System.out.println("Passing time...");
                virtualPetShelter.tickAll();

            } else if ("11".equals(userInput)) {
                System.out.println("Thanks for your time!");
                shouldContinue = false;
            }
        }
    }
}
