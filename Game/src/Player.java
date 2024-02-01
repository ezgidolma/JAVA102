import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private  int healthy;
    private  int orijinalhealthy;
    private int money;
    private String name;
    private String characterName;
    private Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void selectChar(){
        GameChar[] list = {new Samurai(),new Archer(), new Knight()};
        System.out.println("Characters");
        System.out.println("----------------------------------------------");
        for(GameChar i : list) {
            System.out.println("Id : " +i.getId() +
                               "  \tCharacter : " + i.getName() +
                               "  \tDamage : "+ i.getDamage() +
                               "  \tHealthy : "+ i.getHealthy() +
                               "  \tMoney : " + i.getMoney());
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.print("Please enter a character : ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                System.out.print("Please enter available a character :");
                selectChar=input.nextInt();

        }

        /*
        System.out.println("Your Character : " + this.getCharacterName() +
                " \tDamage : " + this.getDamage() +
                " \tHealthy : "+ this.getHealthy() +
                " \tMoney : "+ this.getMoney());
                */

    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealthy());
        this.setOrijinalhealthy(gameChar.getHealthy());
        this.setMoney(gameChar.getMoney());
        this.setCharacterName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Your weapon : " + this.getInventory().getWeapon().getName()+
                "\t armor : " + this.getInventory().getArmor().getName()+
                "\t block : " +this.getInventory().getArmor().getBlock()+
                "\t damage : " + this.getTotalDamage() +
                "\t healthy : " + this.getHealthy() +
                "\t money : " + this.getMoney());
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrijinalhealthy() {
        return orijinalhealthy;
    }

    public void setOrijinalhealthy(int orijinalhealthy) {
        this.orijinalhealthy = orijinalhealthy;
    }
}
