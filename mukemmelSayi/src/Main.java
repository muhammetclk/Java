public class Main {

    public static void main(String[] args) {
	//kendisi disinda bolenlerinin toplami bolunen sayiya esit olunca mukemmel sayi oluyor.

        int number=6;
        int toplam=0;
        for (int i =1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
        }
        if(toplam==number){
            System.out.println(number+" mukemmel sayidir.");
        }
        else {
            System.out.println(number+" mukemmel sayi degildir.");
        }
    }
}
