public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100, 10);
        Hero warrior = new Warrior("Славный вояка", 50, 5);
        Hero archer = new Archer("Зоркий глаз", 45, 6);
        Hero mage = new Mage("Инвокер", 40, 7);

        System.out.println("Бой начался!");

        warrior.attackEnemy(enemy);
        enemy.attackHero(warrior);

        archer.attackEnemy(enemy);
        enemy.attackHero(archer);

        mage.attackEnemy(enemy);
        enemy.attackHero(mage);
    }
}