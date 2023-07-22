import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
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
}
