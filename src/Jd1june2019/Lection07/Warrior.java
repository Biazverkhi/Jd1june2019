package Jd1june2019.Lection07;

public class Warrior extends Hero {
    @Override
    public void attackEnemy(Hero hero) {
        System.out.print(getName() + " наносит удар мечом!!!");
        super.attackEnemy(hero);
    }
    public Warrior(String name) {
        super(name, 7000, 900);
    }

}
