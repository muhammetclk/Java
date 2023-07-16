//built-in  tanimli packages ler var demek.

//util=utulity=araclar javadaki araclar icinden Scanner paketini kullanicaz.
import matematik.DortIslem;
import matematik.Logaritma;
//import matematik.*  ile paketin iccerisindeki herseyi kullaniriz.

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

        //kendi packages imizi yazdik ve Dortilem yazip tiklayinca otomatik olarak yukarda import etti.
        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(2,3));
        Logaritma logaritma=new Logaritma();

    }
}
