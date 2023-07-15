public class ProductValidator {
    //product validator bir urunu eklerken veya guncellerken kurallara uygun olup olmadigini kontrol eder.

    public ProductValidator(){//bu kisim newlenmedigi takdirde calismaz.(ProductManager classinda static kismini newlemden kullanmistik)
        System.out.println("Yapici blok calisti.");
    }
    static {
        System.out.println("static anahtar kelimesiyle tanimlanan ve newlenmeden calisan yapici metod.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    //javada ana class static olamiyor.
    //C# da oluyordu ve static tanimlanan classin icindekilerde static tanimlanmak zorundaydi.
    //javada ise class icinde baska bir class tanimlayarak static olarak gosterebiliyoruz.buna inner class deniyor.
    public static class BaskaBirClass{
        static void sil(){

        }

    }
}
