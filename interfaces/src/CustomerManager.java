public class CustomerManager {
    //is kodlari yazilir.
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        customerDal.add();
    }
}
