public class Student<T> implements IDatabase<T> {
    @Override
    public boolean insert(T data) {
        System.out.println(data+" öğrencisi eklendi.");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data+" öğrencisi silindi.");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data+" öğrencisi güncellendi.");
        return true;
    }
}
