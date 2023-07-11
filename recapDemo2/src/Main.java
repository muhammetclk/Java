public class Main {

    public static void main(String[] args) {
        //dizi elemanlarini listeleyen,toplayan ve en buyuk degeri ekrana yazdiran program.

	    double[] myList={1.4,5.6,10.7,9.6};
        double total=0;
        double max=myList[0];
        for (Double number:myList) {
            if(number>max){
                max=number;
            }
            System.out.println(number);
            total+=number;
        }
        System.out.println("Total:"+total);
        System.out.println("Max:"+max);
    }
}
