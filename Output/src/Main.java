import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.Charset;


public class Main {
    public static void main(String[] args) throws Exception{

        String data = "Java Deneme Yazısı Son";

        FileWriter file =  new FileWriter("print.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(file);
        bufferedWriter.write(data);
        bufferedWriter.close();
        file.close();


        /**

        FileReader fileReader = new FileReader("print.txt",Charset.forName("UTF-8"));
        BufferedReader reader = new BufferedReader(fileReader);

        String data = reader.readLine();

        while (data != null){
            System.out.println(data);
            data = reader.readLine();
        }

        String data = "Deneme Yazısı";
        FileWriter writer = new FileWriter("print.txt");
        writer.write(data);
        writer.close();


        String data = "İİİÜÜWWÇÇÇÖaasÖ";

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
        writer.write(data);
        writer.close();

        FileInputStream fileInputStream = new FileInputStream("output.txt");
        InputStreamReader reader = new InputStreamReader(fileInputStream);

        int i = reader.read();
        while (i != -1){
            System.out.print((char) i);
            i= reader.read();
        }

        PrintStream printStream = new PrintStream("print.txt");
        printStream.print(1234 + "12" + 12.4);

        String data = "JAVA";
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] byteArray = data.getBytes();
        bufferedOutputStream.write(byteArray);
        bufferedOutputStream.close();
        fileOutputStream.close();

        Car c1= new Car("mercedes", "b1");
        FileOutputStream f1 = new FileOutputStream("arab.txt");
        FileInputStream f2=new FileInputStream("arab.txt");
        ObjectOutputStream o1 = new ObjectOutputStream(f1);
        o1.writeObject(c1);
        o1.close();

        ObjectInputStream obj1 = new ObjectInputStream(f2);
        Car newCar= (Car) obj1.readObject();
        System.out.println(newCar.getBrand());
        System.out.println(newCar.getModel());

        String data = "JAVA";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] array = data.getBytes();

        try {
            output.write(array);
            String nData = output.toString();
            System.out.println(nData);
        } catch (IIOException e){
            e.printStackTrace();
        }

        byte[] array1 = {21, 34, 5, 68, 88};
        byte[] array2 = {4,55,6,7};
        ByteArrayInputStream input1 = new ByteArrayInputStream(array1);
        System.out.println("Kullanılabilecek byte sayısı : "+input1.available());
        for (byte i: input1.readAllBytes()) {
            System.out.print(i + " ");
        }
        System.out.println();
        ByteArrayInputStream input2 = new ByteArrayInputStream(array2,2,2);
        System.out.println("Kullanılabilecek byte sayısı : "+input2.available());
        for (byte i: input2.readAllBytes()) {
            System.out.print(i + " ");
        }

        FileOutputStream output = new FileOutputStream("output.txt",true);
        String yazi = "yazi denemesi.";
        byte[] array = yazi.getBytes();
        output.write(array);

         **/
        /**
        FileInputStream inputStream = new FileInputStream("output.txt");
        System.out.println("Dosyanın içindekiler: ");
        int i = inputStream.read();
        System.out.print("Kullanılabilir bayt sayısı: ");
        System.out.println(inputStream.available());
        while (i != -1){
            System.out.print((char) i);
            i=inputStream.read();
        }
        System.out.println();
        System.out.print("Kullanılabilir bayt sayısı: ");
        System.out.println(inputStream.available());
        inputStream.close();
         **/
    }
}