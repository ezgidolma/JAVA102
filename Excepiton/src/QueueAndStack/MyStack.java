package QueueAndStack;

public class MyStack {
    int capacity;
    int topOfStack;
    int[] stack;

    MyStack(int capacity){
        this.capacity=capacity;
        stack= new int[capacity];
        topOfStack=-1;
    }

    void push(int element){
        if (topOfStack==capacity-1)
        {
            System.out.println("overflow...");
        }else
        {
            topOfStack++;
            stack[topOfStack]=element;
            System.out.println(element + "ekleniyor.");
        }
    }

    int pop(){
        if (topOfStack<0){
            System.out.println("underflow...");
            return 0;
        }else
        {
            int element = stack[topOfStack];
            topOfStack--;
            System.out.println(element);
            return  element;

        }
    }
}
