package Jd1june2019.Lection07;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Воин");
        Zombie zombie = new Zombie("Мертвяк");
        Mage mage = new Mage("Волшебник");
        warrior.attackEnemy(zombie);
        zombie.attackEnemy(warrior);
    }
}
