package Output;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File file = new File("metin.txt");
        try {
            if (file.createNewFile()){
                System.out.println(file.getName() + "dosyası eklendi.");
            }else {
                System.out.println(file.getName() + "dosyası zaten mevcut.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
