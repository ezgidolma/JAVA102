public class Counter implements Runnable{
    public String name;

    public boolean isRun=true;

    public Counter(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        int i = 0;
        while (isRun) {
             {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.name + " : " + i++);
            }
        }
    }

    public void stop(){
        this.isRun =false;
    }
}
