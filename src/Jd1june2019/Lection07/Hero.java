package Jd1june2019.Lection07;

public abstract class Hero {
    private String name;
    private int health;
    //   private final int damage;//Вопрос Юлию. Как красиво передать эти переменные от классов наслдеников

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract void attackEnemy(Enemy enemy);
}
