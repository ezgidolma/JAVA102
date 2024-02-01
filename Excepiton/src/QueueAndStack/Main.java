package QueueAndStack;

import java.io.FileReader;
import java.util.*;

public class Main {
    public static void isDesiredRange(int x) throws RangeException {
        if(x>=1 && x<=10){
            System.out.println("İstenilen aralıkta seçilmiş bir sayıdır.");
        }
        else{
            throw  new RangeException("Hatalı bir aralıkta sayı seçtiniz.");
        }
    }

    public static void main(String[] args) throws Exception {

        LinkedHashSet<String> lst = new LinkedHashSet<>();
        lst.add("Bir");
        lst.add("İki");
        lst.add("Dört");
        lst.add("Dört");

        Iterator<String> ıtr = lst.iterator();
        while (ıtr.hasNext())
        {
            System.out.println(ıtr.next());
        }















       /** HashSet<String> hSet =  new HashSet<>();
        hSet.add("Ezgi");
        hSet.add("Esen");
        hSet.add("Eylül");
        hSet.add("Eylül");
        hSet.add(null);

        Iterator<String> ıtr = hSet.iterator();
        while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }

        **/




        //Scanner input = new Scanner(System.in);
        //System.out.print("Bir sayı giriniz : ");
        //int number = input.nextInt();
        //isDesiredRange(number);

        /**QueueAndStack.MyQueue queue= new QueueAndStack.MyQueue(5);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(52);
        queue.enqueue(15);
        queue.enqueue(85);
        queue.enqueue(85);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue()**/

        /**Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        stack.push(5);
        stack.push(7);

        stack.add(2,12);
        System.out.println(stack.empty());
        System.out.println(stack.capacity());
        System.out.println(stack.firstElement());
        System.out.println(stack);**/

        /**Queue<String> queue= new LinkedList<String>();
        queue.add("Ezgi");
        queue.add("Eylül");
        queue.add("Esen");

        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
         **/
    }
}