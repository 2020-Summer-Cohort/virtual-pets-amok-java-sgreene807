package pets_amok;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        RoboticPets roboDog1 = new RoboticPets(50, 50, 50, 50, "Cyclops", "Cute robo pug");
        OrganicDog orgDog1 = new OrganicDog(50, 50, 50, 50, 50, 50, 50, "Fido", "Playful puppy beagle");
        OrganicCat orgCat1 = new OrganicCat(50, 50, 50, 50, 50, 50, "Fluffy", "Sweet Siamese cat");
        shelter.addPet(roboDog1);
        shelter.addPet(orgDog1);
        shelter.addPet(orgCat1);

        System.out.println("Welcome to Sarah's Virtual Pet Shelter! Here are all the pets in the shelter:");
        printPattern();
        shelter.printAllPetsAndDescriptions();
        printPattern();
        shelter.printPetHealthStatus();
        printPattern();
        Scanner scanner = new Scanner(System.in);

        promptUser();

        while (shelter.isPetHealthy()) {
            int numberSelected = scanner.nextInt();
            if (numberSelected == 1) {
                shelter.feedPets();
                System.out.println("Thank you for feeding the pets!");
            } else if (numberSelected == 2) {
                shelter.waterPets();
                System.out.println("Thank you for giving the pets water!");
            } else if (numberSelected == 3) {
                System.out.println("Please select which pet you would like to play with.");
                System.out.println(shelter.getPets().keySet());
                scanner.nextLine();
                String petSelected = scanner.nextLine();
                shelter.playWithPet(petSelected);
            } else if (numberSelected == 4){
                System.out.println("Thank you for walking the dogs!");
                shelter.walkAllDogs();
            } else if (numberSelected == 5){
                shelter.cleanDogCages();
                System.out.println("Thank you for cleaning the cages!");
            } else if (numberSelected == 6){
                shelter.oilRoboPets();
                System.out.println("Thank you for oiling the pets!");
            }
            else if (numberSelected == 7) {
                shelter.printAllPetsAndDescriptions();
                System.out.println("Please select which pet you would like to adopt.");
                scanner.nextLine();
                String petAdopted = scanner.nextLine();
                shelter.removePet(petAdopted);
                System.out.println(petAdopted + " has been adopted.");
            } else if (numberSelected == 8) {
                System.out.println("Please enter the pet's name.");
                scanner.nextLine();
                String petToAdd = scanner.nextLine();
                System.out.println("We are excited to welcome " + petToAdd + " to the shelter. Please tell us more about " + petToAdd);
                String petToAddDescription = scanner.nextLine();
                shelter.addPet(new VirtualPet(petToAdd, petToAddDescription));
                System.out.println(petToAdd + " has now been admitted.");
            } else if (numberSelected == 9) {
                System.out.println("Thank you for visiting the shelter. We hope to see you again soon!");
                System.exit(0);
            } else {
                System.out.println("Invalid. Please enter a number 1 through 9.");
            }
            shelter.tick();
            printPattern();
            shelter.printPetHealthStatus();
            printPattern();
            promptUser();
        }
        System.out.println("You lose!");
    }

    public static void promptUser() {
        System.out.println("What do you want to do?");
        System.out.println("1. Feed the pets");
        System.out.println("2. Give the pets water");
        System.out.println("3. Play with a pet");
        System.out.println("4. Walk the dogs");
        System.out.println("5. Clean the dog cages");
        System.out.println("6. Oil the robo pets");
        System.out.println("7. Adopt a pet");
        System.out.println("8. Admit a pet");
        System.out.println("9. Exit");
    }

    public static void printPattern() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }




}


