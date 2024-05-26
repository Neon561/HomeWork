public class Archer extends Hero {
    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + getName() + " атакует врага.");
        enemy.takeDamage(getDamage());
    }
}