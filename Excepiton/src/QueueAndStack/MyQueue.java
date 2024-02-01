package QueueAndStack;

public class MyQueue {
    int[] arr;
    int capacity, fist, last, currentSize;

    MyQueue(int capacity){
        this.capacity=capacity;
        arr= new int[capacity];
        fist=0;
        last=-1;
        currentSize=0;
    }

    boolean isEmpty(){
        return currentSize==0;
    }

    boolean isFull(){
        return currentSize==capacity;
    }

    void enqueue(int element){
        if(isFull()){
            System.out.println("overflow...");
        }else {
            last++;
            arr[last]=element;
            currentSize++;
            System.out.println("ekleniyor "+ element);
        }
    }

    void dequeue(){
        if (isEmpty()){
            System.out.println("underflow...");
        }
        else{
            currentSize--;
            System.out.println("çıkarılıyor "+arr[fist++]);
        }
    }
}
