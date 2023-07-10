public class Main {

    public static void main(String[] args) {
	// 3 sayi icinden en buyugu bulan program.

        int number1=24;
        int number2=249;
        int number3=38;
        int enBuyuk=number1;
        if(number2>enBuyuk){
            enBuyuk=number2;
        }
        if(number3>enBuyuk){
            enBuyuk=number3;
        }
        System.out.println("En buyuk sayi ="+enBuyuk);
    }
}
