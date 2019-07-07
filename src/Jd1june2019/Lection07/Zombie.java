package Jd1june2019.Lection07;

public class Zombie extends Enemy {
    @Override
    public void attackEnemy(Hero hero) {
        System.out.print(getName() + " кусает за руку");
        super.attackEnemy(hero);
    }

    public Zombie(String name) {
        super(name, 4500, 550);
    }
}
