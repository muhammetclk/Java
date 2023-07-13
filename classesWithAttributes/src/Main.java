public class Main {

    public static void main(String[] args) {
	    Product product=new Product();
	    product.setId(1);
	    product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(15000);
		product.setStockAmount(30);
	    ProductManager productManager=new ProductManager();
	    productManager.Add(product);
	    System.out.println(product.getKod());//kod icin set islemi yok fakat get islemi var.kod un readonly olmasini istedik.
    }
}
