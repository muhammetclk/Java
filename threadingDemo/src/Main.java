public class Main {

    public static void main(String[] args) {
	// threading ikiye ayrili single threading ve multi threading
        //single da birden fazla operasyon sirali sekilde icra edilir.Cunku bu operasyonlar birbirine baglidir
        //multi threading de operasyonlar birbirine bagli degildir ve birden fazla thread yapisi olusturarak
        //operasyonlari ayni anda calistirip sureden kazaniriz,.
        //thread yapisini anlamak icin burda koronmetre ornegi yapicaz.
        //bazi uygulamalarda birden fazla kronometre acilabilir bunun ornegi

        KronometreThread thread1=new KronometreThread("Kronometre1");
        KronometreThread thread2=new KronometreThread("Kronometre2");
        KronometreThread thread3=new KronometreThread("Kronometre3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
