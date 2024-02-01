public class Obstacle {
    private int id;
    private int damage;
    private int healthy;
    private String name;
    private int price;
    private int orjinalHealth;

    public Obstacle(String name, int id, int damage, int healthy, int price, int orjinalHealth) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.healthy = healthy;
        this.price = price;
        this.orjinalHealth = healthy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        if (healthy<0){
            healthy=0;
        }
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
