import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        OrderPlace orderPlace = new OrderPlace();

        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int i = 0 ; i < 5 ; i++){
            pool.execute(orderPlace);

        }
        pool.shutdown();


        /**
        Counter counter1 = new Counter("Counter-1");

        Thread t1 = new Thread(counter1);

        t1.start();
        Thread.sleep(5000);
        counter1.stop();
         **/

    }
}