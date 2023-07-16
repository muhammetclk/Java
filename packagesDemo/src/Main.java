//built-in  tanimli packages ler var demek.

//util=utulity=araclar javadaki araclar icinden Scanner paketini kullanicaz.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// karýsýklýgý onlemek ýcn gruplama gýbý dusunebýlýrýz.
        //.net deký kutuphanlere karsýlýk gelýr.
        //scanner kullanicidan veri okumaya yariyor.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Isim giriniz: ");
        String  isim=scanner.nextLine();//String tipinde deger dondurur..
        System.out.println("isminiz: "+isim);
    }
}
