package Jd1june2019.Lection07;

public class Warrior extends Hero {
    int damage = 1200;

    @Override

    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " наносит удар мечом!!!");
        enemy.takeDamage(this.damage);

    }

    public Warrior(String name) {
        super(name);
    }
}
