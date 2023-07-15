public class Main {

    public static void main(String[] args) {
        //bir class birden fazla interfac i implemente edebilir.
        //interface i implemente ederken bir classi da extend edebilir.
	    // interface lerde abstract gibi newlenemez.
        //ICustomerDal iCustomerDal=new ICustomerDal();

       // ICustomerDal customerDal=new MySqlCustomerDal();// interface onu implemente eden class in referansini tutuyor.Polymorphism
       //customerDal.add();

        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
