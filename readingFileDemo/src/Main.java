import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //dosya okumaya yonelik bir checked calismasi yapacagiz.
        //once dosyayi bellege alip ordan okuma yapmamizi saglayan class BufferedReader.
        //FileReader yapicaz ve src klaorune olusturdugumuz sayilar.txt yolunu veriyoruz.
        //fakat java bu tarz islmeleri handle etmemizi istiyor.Bu islemi baskasi kullanacaksada  try blogu icinde calistirmamizi istiyor.
        //Once FileReader uzerine gelip handle ettik.Uzerine gelip add exception to method signuture dedik.
        //ikinci yolda FileReader uzerine gelip surround with try/catch diyerek bu blok icine almasini saglamak.

        BufferedReader reader = null;//ilk once try da yapmistik fakat finally de ulasamadigimiz icin disarda tanimladik.
        int total = 0;

        //readerlarda dosyadan okuma islemi satir satir olur.
        try {
            //yoluna direk sayilar.txt yazinca bulamadi ve filenotfoundexception firlatti.
            reader = new BufferedReader(new FileReader("D:\\javademos\\readingFileDemo\\src\\sayilar.txt"));

            String line = null;//null olarak atiyoruz.dosyada veri olmayabilir.
            while ((line = reader.readLine()) != null) {//reader.readline ile okunacak veri varsa true degeri doner.
                total+=Integer.valueOf(line);
            }
            System.out.println("Total: "+total);
        } catch (FileNotFoundException e) {//dosyayi bulamazsa hatasi
            e.printStackTrace();
        } finally {//olusturdugumuz readeri kaptmamiz lazim ama try blogunun icinde oldugunda ulasamiyoruz.
            //bu yuzden try icinde tanimlamizaz disarda tanimlicaz.
            reader.close();// Dosyayi try da  okuyamazsa kapatilacak dosya olmayabilir buda hata verir. o yuzden ilk denedigimizde yaptigimiz add exception to method signuture
            //islemini yapmaliyiz. Oda yukari throw IOException firtlatir.
            //veya finally icindeki islemi try catch icindede tanimlayabiliriz.
        }


    }
}
