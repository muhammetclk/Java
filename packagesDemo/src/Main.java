//built-in  tanimli packages ler var demek.

//util=utulity=araclar javadaki araclar icinden Scanner paketini kullanicaz.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// kar�s�kl�g� onlemek �cn gruplama g�b� dusuneb�l�r�z.
        //.net dek� kutuphanlere kars�l�k gel�r.
        //scanner kullanicidan veri okumaya yariyor.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Isim giriniz: ");
        String  isim=scanner.nextLine();//String tipinde deger dondurur..
        System.out.println("isminiz: "+isim);
    }
}
