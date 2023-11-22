package virtual_pet;

import java.util.Random;

public class VirtualPetTest extends VirtualPet {

    public VirtualPetTest(int hunger, int thirst, int waste, int boredom, int sickness, int sleepiness) {
        super(hunger, thirst, waste, boredom, sickness, sleepiness);
    }

    public void feed() {
        int amount = new Random().nextInt(15) + 1;
        int updatedHunger = Math.min(getHunger() - amount, 100);
        setHunger(Math.max(updatedHunger, 0));
    }

    public void giveWater() {
        int amount = new Random().nextInt(15) + 1;
        int updatedThirst = Math.min(getThirst() - amount, 100);
        setThirst(Math.max(updatedThirst, 0));
    }

    public void takePetOut() {
        int amount = new Random().nextInt(15) + 1;
        int updatedWaste = Math.min(getWaste() - amount, 100);
        setWaste(Math.max(updatedWaste, 0));
    }

    public void playWithPet() {
        int amount = new Random().nextInt(15) + 1;
        int updatedBoredom = Math.min(getBoredom() - amount, 100);
        setBoredom(Math.max(updatedBoredom, 0));
    }

    public void takeToDoctor() {
        int amount = new Random().nextInt(15) + 1;
        int updatedSickness = Math.min(getSickness() - amount, 100);
        setSickness(Math.max(updatedSickness, 0));
    }

    public void putToSleep() {
        int amount = new Random().nextInt(15) + 1;
        int updatedSleepiness = Math.min(getSleepiness() - amount, 100);
        setSleepiness(Math.max(updatedSleepiness, 0));
    }

    public void tick() {
        int hungerIncrease = new Random().nextInt(5) + 1;
        int thirstIncrease = new Random().nextInt(5) + 1;
        int wasteIncrease = new Random().nextInt(10) + 1;
        int boredomIncrease = new Random().nextInt(10) + 1;
        int sleepinessIncrease = new Random().nextInt(10) + 1;
        int sicknessIncrease = new Random().nextInt(5) + 1;

        setHunger(getHunger() - hungerIncrease);
        setThirst(getThirst() - thirstIncrease);
        setWaste(getWaste() + wasteIncrease);
        setBoredom(getBoredom() + boredomIncrease);
        setSleepiness(getSleepiness() + sleepinessIncrease);
        setSickness(getSickness() + sicknessIncrease);
    }

}
