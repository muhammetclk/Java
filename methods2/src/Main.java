public class Main {

    public static void main(String[] args) {
	int result=topla(7,8);
	System.out.println("result: "+result);
	mesajVer();
    }
    public static int topla(int sayi1,int sayi2){

        return sayi1+sayi2;
    }
    public static void mesajVer(){
        System.out.println("Parametresiz ve deger dondurmeyen metod.");
    }
}
