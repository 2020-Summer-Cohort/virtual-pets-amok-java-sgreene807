package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    OrganicPets underTest = new OrganicPets(50, 50, 50, 50, 50, 50, "Fluffy", "Cat");

    @Test
    public void shouldFeedPet() {
        int preEatingHunger = underTest.getHunger();
        underTest.feed();
        int postEatingHunger = underTest.getHunger();
        assertEquals(2, preEatingHunger - postEatingHunger);

    }

    @Test
    public void wasteShouldIncreaseAfterFeeding() {
        int preEatingWaste = underTest.getWaste();
        underTest.feed();
        int postEatingWaste = underTest.getWaste();
        assertEquals(1, postEatingWaste - preEatingWaste);
    }

    @Test
    public void shouldWaterPet() {
        int preWaterThirst = underTest.getThirst();
        underTest.water();
        int postWaterThirst = underTest.getThirst();
        assertEquals(2, preWaterThirst - postWaterThirst);
    }

    @Test
    public void boredomShouldDecreaseAfterPlay() {
        int prePlayBoredom = underTest.getBoredom();
        underTest.play();
        int postPlayBoredom = underTest.getBoredom();
        assertEquals(2, prePlayBoredom - postPlayBoredom);
    }

    @Test
    public void hungerShouldIncreaseAfterPlay() {
        int prePlayHunger = underTest.getHunger();
        underTest.play();
        int postPlayHunger = underTest.getHunger();
        assertEquals(1, postPlayHunger - prePlayHunger);
    }

    @Test
    public void thirstShouldIncreaseAfterPlay() {
        int prePlayThirst = underTest.getThirst();
        underTest.play();
        int postPlayThirst = underTest.getThirst();
        assertEquals(1, postPlayThirst - prePlayThirst);
    }

    @Test
    public void shouldOilRoboPet() {
        RoboticPets underTest = new RoboticPets(50, 50, 50, 50, "Robodog", "Metal boxer");
        int preOilingLevel = underTest.getOilLevel();
        underTest.oilPet();
        int postOilingLevel = underTest.getOilLevel();
        assertEquals(1, postOilingLevel - preOilingLevel);
    }

    @Test
    public void cageCleanlinessShouldIncreaseBy2() {
        OrganicDog underTest = new OrganicDog(50, 50, 50, 50, 50, 50, 50, "Billy", "Lab");
        int preCleaningCageCleanliness = underTest.getCageCleanliness();
        underTest.cleanCage();
        int postCleaningCageCleanliness = underTest.getCageCleanliness();
        assertEquals(2, postCleaningCageCleanliness - preCleaningCageCleanliness);
    }

    @Test
    public void happinessShouldIncreaseAfterWalking(){
        OrganicDog underTest = new OrganicDog(50, 50, 50, 50, 50, 50, 50, "Billy", "Lab");
        int preWalkHappiness = underTest.getHappiness();
        underTest.walkDog();
        int postWalkHappiness = underTest.getHappiness();
        assertEquals(1, postWalkHappiness-preWalkHappiness);
    }

}


