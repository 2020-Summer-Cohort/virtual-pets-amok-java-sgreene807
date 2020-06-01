package pets_amok;

public class RoboticPets extends VirtualPet implements RoboticPetBehavior {

    private int oilLevel;

    public RoboticPets(String petName, String description) {
        super(petName, description);
    }

    public RoboticPets(int boredom, int health, int happiness, int oilLevel, String petName, String description) {
        super(boredom, health, happiness, petName, description);
        this.oilLevel = oilLevel;
    }

    @Override
    public void oilPet() {
        oilLevel++;
    }

    @Override
    public boolean isGoodHealth() {
        super.isGoodHealth();
        if (oilLevel == 0) {
            return false;
        }
        return true;
    }

    @Override
    public void tick() {
        super.tick();
        oilLevel--;
    }


    public int getOilLevel() {
        return oilLevel;
    }
}
