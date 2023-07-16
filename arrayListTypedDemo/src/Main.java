import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //arraylisti tip guvenli kullanma
        //generics bir yapi.
        ArrayList<String> sehirler=new ArrayList<String>();

        sehirler.add("Istanbul");
        sehirler.add("Ankara");
        sehirler.add("Izmir");
        sehirler.add("Aydin");
        sehirler.remove("Istanbul");//bu sekildede silme yapabiliriz.
        Collections.sort(sehirler);//donguye girmeden once sehirleri siraladik.
        for (String sehir:sehirler) {
            System.out.println(sehir);
        }

    }
}
