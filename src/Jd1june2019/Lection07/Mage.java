package Jd1june2019.Lection07;

public class Mage extends Hero {
    int damage = 1400;

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " заклинанием наносит урон!!!");

        enemy.takeDamage(this.damage);
    }

    public Mage(String name) {
        super(name);


    }
}
