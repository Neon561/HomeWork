public class Mage extends Hero {
    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + getName() + " атакует врага.");
        enemy.takeDamage(getDamage());
    }
}