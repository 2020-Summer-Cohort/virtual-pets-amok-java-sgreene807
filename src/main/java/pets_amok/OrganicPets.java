package pets_amok;

public class OrganicPets extends VirtualPet implements OrganicPetBehavior {

    protected int hunger;
    protected int thirst;
    protected int waste;

    public OrganicPets(String petName, String description) {
        super(petName, description);
    }

    public OrganicPets(int boredom, int health, int happiness, int hunger, int thirst, int waste, String petName, String description) {
        super(boredom, health, happiness, petName, description);
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }

    @Override
    public void feed() {
        this.hunger -= 2;
        this.waste++;
    }


    @Override
    public void water() {
        this.thirst -= 2;

    }

    @Override
    public void play() {
        super.play();
        this.hunger++;
        this.thirst++;
    }

    @Override
    public void tick() {
        super.tick();
        this.hunger++;
        this.thirst++;
        this.waste++;
    }

    @Override
    public boolean isGoodHealth() {
        if (this.boredom == 100 || this.health == 0 || this.happiness == 0 || this.hunger == 100 || this.thirst == 100 || this.waste == 100) {
            return false;
        }
        return true;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

}
