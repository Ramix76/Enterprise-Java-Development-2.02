package testing;

public class Wizard extends Player {
    private String spell;

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public String getSpell() { return spell; }

    public Elf convertToElf() {
        return new Elf(this.health, this.strength, this.lives, 8); // velocidad fija
    }
}

