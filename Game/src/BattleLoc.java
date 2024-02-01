import java.util.Random;

public abstract class BattleLoc extends Location{

    private Obstacle obstacle;
    private String award;

    private int maxObstacle;

    public BattleLoc(Player player, String name,Obstacle obstacle,String award ,int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int randomObstacle = this.randomObstacleNumber();
        System.out.println("Now you are here : "+this.getName());
        System.out.println("Be careful !" +" There are "+ randomObstacle+" "+this.getObstacle().getName()+" here !");
        System.out.print("War(1) or Run(2) : ");
        int selectCase = input.nextInt();
        if (selectCase==1){
            System.out.println("War !");
            if (combat(randomObstacle)){
                System.out.println("You beated all enemy in the "+this.getName());
                return true;
            }
        }
        if (this.getPlayer().getHealthy()<=0){
            System.out.println("You died !");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber){
        for (int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealthy(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealthy()>0 && this.getObstacle().getHealthy()>0){
                System.out.print("Fight(1) or Flight(2) : ");
                int selectCombat = input.nextInt();
                if (selectCombat==1){
                    System.out.println("You fighted ! ");
                    this.getObstacle().setHealthy(this.getObstacle().getHealthy()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealthy()>0){
                        System.out.println("İt fighted ! ");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage<0){
                            obstacleDamage=0;
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy()-obstacleDamage);
                        afterHit();
                    }
                }
                else {
                    return false;
                }
            }
            if (this.getObstacle().getHealthy()<this.getPlayer().getHealthy()){
                System.out.println("You beated the enemy !");
                System.out.println("You earn : "+this.getObstacle().getPrice());
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getPrice());
                System.out.println("Current money : "+this.getPlayer().getMoney());

            }
            else {
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println();
        System.out.println("Your health : "+this.getPlayer().getHealthy());
        System.out.println("Obstacle health : "+this.getObstacle().getHealthy());
        System.out.println();
    }

    public void  playerStats(){
        System.out.println();
        System.out.println("Player Values");
        System.out.println("---------------------------------------");
        System.out.println("Health : "+this.getPlayer().getHealthy());
        System.out.println("Weapon : "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor : "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block : "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Damage : "+this.getPlayer().getTotalDamage());
        System.out.println("Money : "+this.getPlayer().getMoney());

    }

    public void obstacleStats(int i){
        System.out.println();
        System.out.println(i+". "+this.getObstacle().getName()+" Values");
        System.out.println("-------------------------------------------");
        System.out.println("Health : "+this.getObstacle().getHealthy());
        System.out.println("Damage : "+this.getObstacle().getDamage());
        System.out.println("Award : "+this.getObstacle().getPrice());

    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return  r.nextInt(this.getMaxObstacle())+1;
    }
}
