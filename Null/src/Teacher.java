public class Teacher<T> implements IDatabase<T> {
    @Override
    public boolean insert(T data) {
        System.out.println(data+" öğretmeni eklendi.");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data+" öğretmeni silindi.");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data+" öğretmeni güncellendi.");
        return true;
    }
}
