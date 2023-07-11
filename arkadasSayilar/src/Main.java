public class Main {

    public static void main(String[] args) {
	// kendileri haric pozitif bolenleri toplami karsilikli olarak birbirine esit olan sayilara arkadas sayi deniyor.
    //220-284    220 nin bolenleri toplami 284 iken 284 un bolenleri toplami 220 oluyor.

        int sayi1=220;
        int sayi2=284;
        int sayi1Toplam=0;
        int sayi2Toplam=0;

        for(int i =1;i<sayi1;i++){
            if(sayi1%i==0){
                sayi1Toplam+=i;
            }
        }
        for(int j =1;j<sayi2;j++){
            if(sayi2%j==0){
                sayi2Toplam+=j;
            }
        }
       
        if(sayi1Toplam==sayi2 && sayi2Toplam==sayi1){
            System.out.println(sayi1+" ve"+sayi2+" arkadas sayilardir");
        }
        else {
            System.out.println(sayi1+" ve "+sayi2+" arkadas sayi degildir.");
        }

    }
}
