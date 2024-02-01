public class Nullable<T extends Integer>
{
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public  boolean isNull(){
        return this.value==null;
        }

        public  void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır. (null)");
        }
        else
            System.out.println(this.value);
        }
}
