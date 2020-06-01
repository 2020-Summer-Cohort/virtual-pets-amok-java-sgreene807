package pets_amok;

public class VirtualPet {

    protected int boredom = 50;
    protected int health = 50;
    protected int happiness = 50;
    private String petName;
    private String petDescription;

    public VirtualPet(String petName, String description) {
        this.petName = petName;
        this.petDescription = description;
    }

    public VirtualPet(int boredom, int health, int happiness, String petName, String description) {
        this.boredom = boredom;
        this.health = health;
        this.happiness = happiness;
        this.petName = petName;
        this.petDescription = description;
    }

    public void play() {
        this.boredom -= 2;
        this.health++;
        this.happiness++;
    }

    public void tick() {
        this.boredom++;
        this.health--;
        this.happiness--;
    }


    public boolean isGoodHealth() {
        if (this.boredom == 100 || this.health == 0 || this.happiness == 0) {
            return false;
        }
        return true;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

}

