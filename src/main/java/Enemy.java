public class Enemy implements Mortal {
    private int health;
    private int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println("Враг получил " + damage + " урона. Осталось здоровья: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero(Hero hero) {
        if (isAlive()) {
            System.out.println("Враг атакует героя " + hero.getName() + ".");
            hero.takeDamage(damage);
        }
    }
}