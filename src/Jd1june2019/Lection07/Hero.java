package Jd1june2019.Lection07;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int damage;

    @Override
    public boolean isAlive() {

        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }    //   private final int damage;//Вопрос Юлию. Как красиво передать эти переменные от классов наслдеников

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;

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

    @Override
    public void takeDamage(int damage) {

        health -= damage;
    }

    public void attackEnemy(Hero hero) {

        hero.takeDamage(getDamage());
        if (hero.isAlive()) {
            System.out.println(" ---->  " + hero.getName() + " жив! у него еще есть здоровье: " + hero.getHealth());
        } else {
            System.out.println(hero.getName() + " погиб!" + hero.getHealth());
        }


    }
}
