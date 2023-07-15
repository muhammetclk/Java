public class Main {

    public static void main(String[] args) {
        //metodlari static olarak tanimladigimizda bir kere olusuyor ve her kullanici ayni seyi kullaniyor.Class ismiyle direk
        //static olarak tanimlanan metodlara ulasiyoruz fakat bu metodu kullanmadigimizda program kapanana kadar bellekten atilmiyor.
        //nesneyi newleyip kullandigimizda ise bu instance i kullanmadigimizda bellekten atiliyor.O yuzde static cok fazla kullanilmaz.
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.id=1;
        product.name="Laptop";
        product.price=15000;
        manager.add(product);

        //javada ana class static olamiyor.
        //C# da oluyordu ve static tanimlanan classin icindekilerde static tanimlanmak zorundaydi.
        //javada ise class icinde baska bir class tanimlayarak static olarak gosterebiliyoruz.buna inner class deniyor.

        //inner class kullanimi
        //DatabaseHelper.connection.createConnection();
        //DatabaseHelper.crud.delete();
    }
}
