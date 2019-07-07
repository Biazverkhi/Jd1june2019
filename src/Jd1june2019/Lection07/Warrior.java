package Jd1june2019.Lection07;

public class Warrior extends Hero {
    private final int damage = 1200;

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " наносит удар мечом!!!");
        enemy.takeDamage(damage);
    }
    public Warrior(String name) {
        super(name);
    }

}
