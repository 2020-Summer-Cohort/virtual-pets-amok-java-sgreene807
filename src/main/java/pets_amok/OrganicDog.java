package pets_amok;

public class OrganicDog extends OrganicPets {

    private int cageCleanliness;


    public OrganicDog(String petName, String description) {
        super(petName, description);
    }

    public OrganicDog(int boredom, int health, int happiness, int hunger, int thirst, int waste, int cageCleanliness, String petName, String description) {
        super(boredom, health, happiness, hunger, thirst, waste, petName, description);
        this.cageCleanliness = cageCleanliness;
    }

    public void walkDog() {
        happiness++;
        waste--;
        cageCleanliness++;
    }

    public void cleanCage() {
        cageCleanliness += 2;
    }

    @Override
    public void tick() {
        super.tick();
        cageCleanliness--;
    }

    @Override
    public boolean isGoodHealth() {
        super.isGoodHealth();
        if (cageCleanliness == 0) {
            return false;
        }

        return true;
    }


    public int getCageCleanliness() {
        return cageCleanliness;
    }
}
