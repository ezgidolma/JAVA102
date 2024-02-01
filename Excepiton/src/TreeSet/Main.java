package TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        students.add(new Student("Ezgi",40));
        students.add(new Student("Esen",70));
        students.add(new Student("Eylül",90));
        students.add(new Student("Cemre",40));

        for (Student stu:students){
            System.out.println(stu.getName());
        }
    }
}
