public class ProductManager {
    public void add(Product product){
        //ProductValidator productValidator=new ProductValidator();
        //isValid metodunu statice cektim ve Class ismiyle direk kullandim instance olusturmama gerek kalmadi.
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }
        else {
            System.out.println("Urun bilgileri gecersiz.");
        }

    }
}
