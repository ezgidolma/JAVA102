public class OrderPlace implements Runnable{
    private int placeNo;
    private final Object LOCK = new Object();

    public OrderPlace() {
        this.placeNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (LOCK) {
            this.placeNo++;
            System.out.println(Thread.currentThread().getName() + "  Place No : " + this.placeNo);
        }
    }

    public int getPlaceNo() {
        return placeNo;
    }

    public void setPlaceNo(int placeNo) {
        this.placeNo = placeNo;
    }
}
