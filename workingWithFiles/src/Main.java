import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //getFileInfo();
        readFile();

    }
    public static void createFile(){
        File file=new File("D:\\javademos\\files\\students.txt");//dosyalari verdigimiz bu yola eklicez.
        //Ayrica direk yola olusturacagimiz dosyanin adini uzantisiyla bilikte ekleyince olusuyor.
        try {
            if(file.createNewFile()){
                System.out.println("Dosya olusturuldu.");
            }
            else {
                System.out.println("Dosya zaten var.");
            }

        } catch (IOException e) {
            e.printStackTrace();//hatayi metin olarak ekrana yazioyr.
        }
    }
    public static void getFileInfo(){
        File file=new File("D:\\javademos\\files\\students.txt");
        if(file.exists()){//dosya varmi kontrol ediyor.
            System.out.println("Dosya adi: "+file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi ?: "+file.canWrite());
            System.out.println("Dosya okunabilir mi ?: "+file.canRead());
            System.out.println("Dosyanin boyutu : "+file.length());
        }
    }
    public static void readFile(){
        File file=new File("D:\\javademos\\files\\students.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){//satir satir okudugu icin baska yazi kaldimi kontrok ediyruzz.
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
