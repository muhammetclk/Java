public class Main {

    public static void main(String[] args) {
	    Product product=new Product();
	    product.id=1;
	    product.name="Laptop";
	    product.description="Asus Laptop";
	    product.price=15000;
	    product.stockAmount=30;
	    System.out.println(product.name);

	    ProductManager productManager=new ProductManager();
	    productManager.Add(product);
    }
}
