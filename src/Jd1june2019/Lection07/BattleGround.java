package Jd1june2019.Lection07;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Воин");
        Enemy enemy = new Enemy(5000);
        warrior.attackEnemy(enemy);
        if (enemy.isAlive()) {
            System.out.println("Враг жив! у врага еще есть здороввье: " + enemy.getHealth());
        }
    }
}
