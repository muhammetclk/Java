import java.util.ArrayList;//arraylist kullanmak icin import etmemiz gerek.

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar=new ArrayList();
        System.out.println(sayilar.size());//eleman sayisi
        sayilar.add(1);
        sayilar.add(10);
        System.out.println(sayilar.size());
        sayilar.add("Ankara");//object turunde oldugu icin her turden ekleyebiliriz.
        System.out.println(sayilar.size());

        System.out.println(sayilar.get(2));//elemani getir.
        sayilar.set(0,"Yeni deger yazilir.");
        System.out.println(sayilar.get(0));
        sayilar.remove(0);//0.indeksteki eleman silindi ve 0.indekse 1. indekteki eleman gecti.

        System.out.println(sayilar.get(0));
        System.out.println("-------------------------------");
        //sayilar.clear();komple diziyi temizler.
        for (Object deger:sayilar) {
            System.out.println(deger);
        }
    }
}
