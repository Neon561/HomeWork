public class Zombie extends Enemy {
    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive() && Math.random() < 0.5) { // 50% chance to resurrect
            setHealth(10);
            System.out.println("Зомби воскрес с 10 здоровья!");
        }
    }
}