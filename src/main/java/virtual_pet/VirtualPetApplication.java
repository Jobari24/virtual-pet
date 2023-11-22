package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        // Interact with a VirtualPet object in this method
        VirtualPetTest pet = new VirtualPetTest(50, 50, 50, 50, 0, 50);

        Scanner scanner = new Scanner(System.in);
        String choice = "";

        // Choices
        while (!choice.equals("exit")) {
            choiceDisplay();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    pet.feed();
                    System.out.println("You Fed Whispurr.");
                    break;
                case "2":
                    pet.giveWater();
                    System.out.println("You gave Whispurr some water.");
                    break;
                case "3":
                    pet.takePetOut();
                    System.out.println("You take Whispurr out.");
                    break;
                case "4":
                    pet.playWithPet();
                    System.out.println("You Played with Whispurr.");
                    break;
                case "5":
                    pet.takeToDoctor();
                    System.out.println("You take Whispurr to the Doctors.");
                    break;
                case "6":
                    pet.putToSleep();
                    System.out.println("You put Whispurr to sleep.");
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            petStatus(pet);
            pet.tick();
        }
    }

    public static void petStatus(VirtualPetTest pet) {
        System.out.println("\nWhispurr the Cat");
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Thirst: " + pet.getThirst());
        System.out.println("Waste: " + pet.getWaste());
        System.out.println("Boredom: " + pet.getBoredom());
        System.out.println("Sickness: " + pet.getSickness());
        System.out.println("Sleepiness: " + pet.getSleepiness());
    }

    public static void choiceDisplay() {
        System.out.println("\n What would you like to do? \n");
        System.out.println("1. Feed Whispurr");
        System.out.println("2. Give Whispurr water");
        System.out.println("3. Take Whispurr out");
        System.out.println("4. Play with Whispurr");
        System.out.println("5. Take Whispurr to the Doctors ");
        System.out.println("6. Put Whispurr to sleep");
        System.out.println("0. Do nothing");
    }

}
