package Jd1june2019.Lection07;

public class Mage extends Hero {
    // private final int damage = 1400;
    @Override
    public void attackEnemy(Hero hero) {
        System.out.print(getName() + " заклинанием наносит урон!!!");
        super.attackEnemy(hero);
    }
    public Mage(String name) {
        super(name, 5000, 1250);
    }

}
