public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Славный вояка", 50, 5);
        Hero archer = new Archer("Зоркий глаз", 45, 6);
        Hero mage = new Mage("Инвокер", 40, 7);

        Enemy zombie = new Zombie(30, 5);

        battle(warrior, zombie);
        battle(archer, zombie);
        battle(mage, zombie);
    }

    public static void battle(Hero hero, Enemy enemy) {
        System.out.println(hero.getName() + " vs " + enemy.getClass().getSimpleName());
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " победил!");
        } else {
            System.out.println(enemy.getClass().getSimpleName() + " победил!");
        }
    }
}