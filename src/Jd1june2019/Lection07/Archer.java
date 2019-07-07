package Jd1june2019.Lection07;

public class Archer extends Hero {
    //private final int damage2 = 1300;   //Вопрос Юлию. Как красиво передать эти переменные от классов наслдеников, как я или чере объявление новых переменых
    @Override
    public void attackEnemy(Hero hero) {
        System.out.print(getName() + " выпускает стрелу в цель!!!");
        super.attackEnemy(hero);
    }
    public Archer(String name) {
        super(name, 5500, 600);
    }

}
