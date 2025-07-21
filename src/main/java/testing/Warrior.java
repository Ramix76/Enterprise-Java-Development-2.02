package testing;

public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public int getForce() { return force; }

    public Elf convertToElf() {
        return new Elf(this.health, this.strength, this.lives, 10); // velocidad fija
    }
}

