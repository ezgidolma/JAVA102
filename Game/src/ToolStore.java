public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome To Store !");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1- Weapons");
            System.out.println("2- Armors");
            System.out.println("3- Go Out");
            System.out.print("What's your choice : ");
            int select = input.nextInt();
            while (select < 1 || select > 3){
                System.out.print("Invalid value , please enter again : ");
                select = input.nextInt();
            }
            switch (select){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("We Wait Again !");
                    showMenu=false;
                    break;
            }
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("***********************Weapons************************");
        System.out.println();
        System.out.println("0- Go Out !");
        for (Weapon i : Weapon.weapons()){
            System.out.println(i.getId() + " - " +i.getName()+ "\tDamage: "+ i.getDamage()+"\tPrice: "+i.getPrice());
        }
    }

    public  void buyWeapon(){
        System.out.print("Please choice a weapon :");
        int selecetWeapon = input.nextInt();
        while (selecetWeapon < 0 || selecetWeapon > Weapon.weapons().length){
            System.out.print("Invalid value , please enter again : ");
            selecetWeapon = input.nextInt();
        }
        if (selecetWeapon!=0){
        Weapon selectedWeapon = Weapon.getWeaponObjById(selecetWeapon);
        if (selectedWeapon!=null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficient balance !");
            } else {
                System.out.println(selectedWeapon.getName() + " is your weapon.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Your new balance : " + this.getPlayer().getMoney());
                System.out.println("Your before weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Your now weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }
    public void printArmor(){
        System.out.println("************************Armor*****************************");
        System.out.println();
        System.out.println("0 - Go Out !");
        for (Armor i : Armor.armors()){
            System.out.println(i.getId() + "- "+ i.getName() + " block : "+i.getBlock()+" price :" +i.getPrice());
        }
    }

    public void buyArmor(){
        System.out.print("Please choice a armor :");
        int selecetArmor = input.nextInt();
        while (selecetArmor < 0 || selecetArmor > Armor.armors().length){
            System.out.print("Invalid value , please enter again : ");
            selecetArmor = input.nextInt();
        }
        if (selecetArmor!=0){
            Armor selectedArmor = Armor.getArmorObjById(selecetArmor);
            if (selectedArmor!=null){
                if(selectedArmor.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Insufficient balance !");
                }
                else{
                    System.out.println(selectedArmor.getName() + " is your armor.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your new balance : " +this.getPlayer().getMoney());
                    System.out.println("Your before armor : "+this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your now armor : "+this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
}
