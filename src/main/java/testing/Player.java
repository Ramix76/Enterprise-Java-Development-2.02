package testing;

public abstract class Player {
    protected int health;
    protected int strength;
    protected int lives;
    protected final int originalHealth;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.originalHealth = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() { return health; }
    public int getStrength() { return strength; }
    public int getLives() { return lives; }

    public void setHealth(int health) { this.health = health; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setLives(int lives) { this.lives = lives; }

    public void decrementLive() {
        lives--;
        if (lives <= 0) {
            System.out.println("This character is dead");
        } else {
            health = originalHealth;
        }
    }

    public void attack(Player target) {
        target.health -= this.strength;
        target.checkHealth();
    }

    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}

