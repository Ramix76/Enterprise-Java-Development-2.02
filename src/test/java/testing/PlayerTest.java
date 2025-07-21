package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testAttackReducesHealth() {
        Warrior w = new Warrior(100, 20, 3, 5);
        Elf e = new Elf(100, 10, 2, 15);

        w.attack(e);
        assertEquals(80, e.getHealth());
    }

    @Test
    public void testDecrementLifeOnDeath() {
        Wizard wiz = new Wizard(10, 10, 1, "Fireball");
        Warrior enemy = new Warrior(100, 15, 2, 5);

        enemy.attack(wiz); // 10 damage → 0 health
        assertEquals(0, wiz.getLives());
    }

    @Test
    public void testConvertToElfFromWarrior() {
        Warrior w = new Warrior(120, 15, 2, 8);
        Elf elf = w.convertToElf();

        assertEquals(120, elf.getHealth());
        assertEquals(15, elf.getStrength());
        assertEquals(2, elf.getLives());
    }

    @Test
    public void testConvertToElfFromWizard() {
        Wizard z = new Wizard(80, 20, 1, "Fire");
        Elf elf = z.convertToElf();

        assertEquals(80, elf.getHealth());
        assertEquals(20, elf.getStrength());
        assertEquals(1, elf.getLives());
    }
}
