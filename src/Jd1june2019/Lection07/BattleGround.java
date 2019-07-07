package Jd1june2019.Lection07;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Воин");
        Enemy enemy = new Enemy("Чужой");
        warrior.attackEnemy(enemy);
        enemy.attackEnemy(warrior);

    }
}
