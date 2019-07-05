package Jd1june2019.Lection07;

public class Archer extends Hero {
    int damage = 1300;

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " выпускает стрелу в цель!!!");
        enemy.takeDamage(this.damage);
    }

    public Archer(String name) {
        super(name);
    }


}
