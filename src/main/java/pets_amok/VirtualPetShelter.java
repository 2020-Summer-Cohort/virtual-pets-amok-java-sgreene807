package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public Map<String, VirtualPet> getPets() {
        return pets;
    }


    public Collection<VirtualPet> retrieveAllPets() {
        return pets.values();
    }

    public VirtualPet retrievePet(String petName) {
        return pets.get(petName);
    }

    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getPetName(), petToAdd);
    }

    public void removePet(String petName) {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            String name = pet.getKey();
            if (name.equalsIgnoreCase(petName)) {
                pets.remove(name);
            }
        }
    }

    public void feedPets() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicPets) {
                ((OrganicPets) petEntryInMap.getValue()).feed();
            }
        }

    }

    public void waterPets() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicPets) {
                ((OrganicPets) petEntryInMap.getValue()).water();
            }
        }

    }

    public void walkAllDogs() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicDog) {
                ((OrganicDog) petEntryInMap.getValue()).walkDog();
            }
        }

    }

    public void oilRoboPets() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof RoboticPets) {
                ((RoboticPets) petEntryInMap.getValue()).oilPet();
            }
        }

    }

    public void cleanDogCages() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicDog) {
                ((OrganicDog) petEntryInMap.getValue()).cleanCage();
            }
        }
    }

    public void playWithPet(String petName) {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            VirtualPet currentPet = pet.getValue();
            String petKey = pet.getKey();
            if (petKey.equalsIgnoreCase(petName)) {
                currentPet.play();
                System.out.println("Thank you for playing with " + petKey);
            }
        }
    }

    public void tick() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicDog) {
                ((OrganicDog) petEntryInMap.getValue()).tick();
            } else if (petEntryInMap.getValue() instanceof OrganicPets) {
                ((OrganicPets) petEntryInMap.getValue()).tick();
            } else if (petEntryInMap.getValue() instanceof RoboticPets) {
                ((RoboticPets) petEntryInMap.getValue()).tick();
            } else {
                VirtualPet petObject = petEntryInMap.getValue();
                petObject.tick();
            }
        }

    }

    public void getAllPetDescriptions() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            System.out.println(pet.getValue().getPetDescription());
        }
    }

    public void printAllPetsAndDescriptions() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            String petName = pet.getKey();
            String petDescription = pet.getValue().getPetDescription();
            System.out.println(petName + " - " + petDescription);
        }
    }

    public boolean isPetHealthy() {
        boolean isGoodHealth = true;
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicDog) {
                return ((OrganicDog) petEntryInMap.getValue()).isGoodHealth();
            } else if (petEntryInMap.getValue() instanceof OrganicPets) {
                return ((OrganicPets) petEntryInMap.getValue()).isGoodHealth();
            } else if (petEntryInMap.getValue() instanceof RoboticPets) {
                return ((RoboticPets) petEntryInMap.getValue()).isGoodHealth();
            }
        }
        return isGoodHealth;
    }

    public void printPetHealthStatus() {
        for (Map.Entry<String, VirtualPet> petEntryInMap : pets.entrySet()) {
            if (petEntryInMap.getValue() instanceof OrganicDog) {
                String petName = petEntryInMap.getKey();
                int petHunger = ((OrganicDog) petEntryInMap.getValue()).getHunger();
                int petThirst = ((OrganicDog) petEntryInMap.getValue()).getThirst();
                int petBoredom = petEntryInMap.getValue().getBoredom();
                int petWaste = ((OrganicDog) petEntryInMap.getValue()).getWaste();
                int petHealth = petEntryInMap.getValue().getHealth();
                int petHappiness = petEntryInMap.getValue().getHappiness();
                int petCleanliness = ((OrganicDog) petEntryInMap.getValue()).getCageCleanliness();
                System.out.println(petName + " - Hunger: " + petHunger + " Thirst: " + petThirst + " Boredom: " + petBoredom
                        + " Waste: " + petWaste + " Health: " + petHealth + " Happiness: " + petHappiness + " Cage Cleanliness: " + petCleanliness);

            } else if (petEntryInMap.getValue() instanceof RoboticPets) {
                String petName = petEntryInMap.getKey();
                int petBoredom = petEntryInMap.getValue().getBoredom();
                int petHealth = petEntryInMap.getValue().getHealth();
                int petHappiness = petEntryInMap.getValue().getHappiness();
                int petOil = ((RoboticPets) petEntryInMap.getValue()).getOilLevel();
                System.out.println(petName + " - Boredom: " + petBoredom + " Health: " + petHealth + " Happiness: " + petHappiness + " Oil level: " + petOil);

            } else if (petEntryInMap.getValue() instanceof OrganicPets) {
                String petName = petEntryInMap.getKey();
                int petHunger = ((OrganicPets) petEntryInMap.getValue()).getHunger();
                int petThirst = ((OrganicPets) petEntryInMap.getValue()).getThirst();
                int petBoredom = petEntryInMap.getValue().getBoredom();
                int petWaste = ((OrganicPets) petEntryInMap.getValue()).getWaste();
                int petHealth = petEntryInMap.getValue().getHealth();
                int petHappiness = petEntryInMap.getValue().getHappiness();
                System.out.println(petName + " - Hunger: " + petHunger + " Thirst: " + petThirst + " Boredom: " + petBoredom
                        + " Waste: " + petWaste + " Health: " + petHealth + " Happiness: " + petHappiness);
            } else {

                String petName = petEntryInMap.getKey();
                int petBoredom = petEntryInMap.getValue().getBoredom();
                int petHealth = petEntryInMap.getValue().getHealth();
                int petHappiness = petEntryInMap.getValue().getHappiness();
                System.out.println(petName + " - Boredom: " + petBoredom + " Health: " + petHealth + " Happiness: " + petHappiness);

            }

        }
    }

}


