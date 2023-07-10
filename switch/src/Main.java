import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {
        //orencinin aldigi nota gore basarili olup olmadiginiz yazdiran program.

        char grade = 'E';

        switch (grade) {

            case 'A':
                System.out.println("Notu A ve ogrenci basarili");
                break;
            case 'B':
                System.out.println("Notu B ve Ogrenci kismen basarili");
                break;
            case 'C':
                System.out.println("Notu C ve Ogrenci kismen basarisiz");
                break;
            case 'D':
            case 'E':
                System.out.println("Notu D ve Ogrenci basarisiz");
                break;
            case 'F':
                System.out.println("Notu F ve ogrenci dersten kaldi");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
                break;
        }
    }
}
