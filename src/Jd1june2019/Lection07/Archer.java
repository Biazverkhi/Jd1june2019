package Jd1june2019.Lection07;

public class Archer extends Hero {
    private final int damage = 1300;   //Вопрос Юлию. Как красиво передать эти переменные от классов наслдеников


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " выпускает стрелу в цель!!!");
        enemy.takeDamage(damage);
    }
    public Archer(String name) {
        super(name);
    }

    public void star() {
    }


}
