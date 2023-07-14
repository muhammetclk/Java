public class Main {

    public static void main(String[] args) {
	// bir veriyi sql server,oracle veya mssql e kaydedicez.Musteri hangisini isterde ona kaydedicek.
        CustomerManager customerManager=new CustomerManager(new OracleDatabaseManager());
        customerManager.getCustomers();
    }
}
