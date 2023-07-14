public class Main {

    public static void main(String[] args) {
	// bir oyun var ve burda 3 kullanici turu var erkek,kadin ve cocuk.
        //bunkarin puani hesaplanirken kadin erkek ayni sekilde cocuk ise farkli sekilde hesaplaniyor.
        //abstract class da abtract ozelliginden faydalanmak istiyorsa "abstract"  anahtar kelimesi class isminde olmali.
        //  ve method isminde kullanilmali.(kullanilmak zorunda deil normal metodda tanimlayabiliriz.)
        // Abstract ozelliginden faydalanmak istiyorsak kullanmaliyiz.
        //Abstract class Base class olarak tanimlanirsa bunu gizler.
        //yani abrtact class newlenemez.

        GameCalculator gameCalculator=new ManGameCalculator();//bu sekilde ManGameCalculator referansini tutabiliyoruz.
        gameCalculator.hesapla();
        //yeni bir class turu ekledigimizde abstract ile hesapla methoduni zorunlu kildik.inherit eden classlar hesapla
        //fonksiyonunu override etmek zorunda.
        //Burda Base classimiz tek basina bir sey ifade etmiyor referans tutucu ozelliginde.
        //Abstract class bu sekilde kurallar koymamizi sagliyor.

    }
}
