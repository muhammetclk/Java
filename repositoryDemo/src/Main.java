public class Main {

    public static void main(String[] args) {
	// repositry deseni veritabani islemleri icin kullanilir.Ekleme ,silme,guncelleme,select gibi
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validate(customer);
    }
}
