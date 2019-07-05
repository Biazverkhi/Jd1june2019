package Jd1june2019.Lection07;

public class Hero {
    private String name;
    private int damage = 1000;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует!");
        enemy.takeDamage(this.damage);

    }
}
