public class Product {

    public Product(int id,String name,String description,double price,int stockAmount){
        this.id=id;
        this.name=name;
        this.stockAmount=stockAmount;
        this.description=description;
        this.price=price;
        System.out.println("Yapici metod calisti.");
    }
    public Product(){

    }


    //public classta attributeler default olarak public tir.Private cekip getter ve setter ozelliklerini kullanicaz.
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod; //kod kismi readonly olmali kullanici yazmamali.

    public int getId(){ //bu sekilde id yi okuyabilir ama id ye bir sey yazamaz.
        return id;
    }
    public void setId(int id){// set ile id degerine yazma islemini yapiyoruz.
        //id=id  bu sekil bir kullanim karisikliga yol actigi icin this anahar kelimesi kullaniliyor.
        //this bu classta tanimlanan ozellikleri ifade ediyor.
        //this.id=id; bu sekilde bir kullanim yapilabilir veya tanimlanan attributelerin basina _ eklenir.
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }


}
