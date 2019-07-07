package Jd1june2019.Lection07;

public class Enemy implements Mortal {
    private int health;

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

}
