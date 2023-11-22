package virtual_pet;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    private int sleepiness;

    public VirtualPet(int hunger, int thirst, int waste, int boredom, int sickness, int sleepiness) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
        this.sleepiness = sleepiness;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getWaste() {
        return this.waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getSickness() {
        return this.sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getSleepiness() {
        return this.sleepiness;
    }

    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

}