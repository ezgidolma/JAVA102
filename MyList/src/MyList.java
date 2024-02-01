import javax.swing.plaf.IconUIResource;

public class MyList<T extends Integer> implements IMyList {

    int arr[] = new int[10];



    public MyList() {
       int arr[] = new int[10];
    }

    MyList(int capacity) {
        arr[0] = capacity;
    }


    @Override
    public int size() {
       return 0;
    }

    @Override
    public int getCapacity() {
        int counter = 0;
        for (int i : arr) {
            counter++;
        }
        return counter;
    }

    @Override
    public boolean add(int data) {
        for (int i:arr) {
            arr[i]=data;
        }
        return true;
    }


}
