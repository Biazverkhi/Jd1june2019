package Jd1june2019.Lection07;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }    //   private final int damage;//Вопрос Юлию. Как красиво передать эти переменные от классов наслдеников

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attackEnemy(Hero hero) {
        hero.takeDamage(getDamage());
        if (hero.isAlive()) {
            System.out.println(" ---->  " + hero.getName() + " жив!  Его жизнь: " + hero.getHealth());
        } else {
            System.out.println(hero.getName() + " погиб!");
        }


    }
}
