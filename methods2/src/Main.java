public class Main {

    public static void main(String[] args) {
	int result=topla(7,8);
	System.out.println("result: "+result);
	mesajVer();

	int result2=topla2(1,2,3,4,5);
	System.out.println("result2: "+result2);

    }
    public static int topla(int sayi1,int sayi2){

        return sayi1+sayi2;
    }
    public static void mesajVer(){
        System.out.println("Parametresiz ve deger dondurmeyen metod.");
    }

    //variable arguments c# daki params ile ayni sey uc nokta ile yapiliyor.
    public static int topla2(int ...sayilar){
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;

        }
        return toplam;
    }
}
