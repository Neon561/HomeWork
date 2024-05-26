public abstract class Hero {
    private String name;
    private int damage;
    private int health;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
    }
}