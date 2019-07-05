package Jd1june2019.Lection07;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Wertual");
        Hero mage = new Mage("Маг");
        Hero warrior = new Warrior("Воин");
        Hero archer = new Archer("Лучник");
        Enemy enemy = new Enemy(5000);

        hero.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

        mage.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

        warrior.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

        archer.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
    }
}
