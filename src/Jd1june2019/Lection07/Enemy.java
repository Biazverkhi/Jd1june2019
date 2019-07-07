package Jd1june2019.Lection07;

public class Enemy extends Hero {
    @Override
    public void attackEnemy(Hero hero) {
        System.out.print(getName() + " пронзает хвостом и плюет кислотой");
        super.attackEnemy(hero);
    }

    public Enemy(String name) {
        super(name, 6000, 500);
    }
}