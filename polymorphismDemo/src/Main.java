public class Main {

    public static void main(String[] args) {
	// polymorphism=cok bicimlilik
        //referans tiplerin birbirinin(aralarinda inheritance varsa) refereansini tutmasiyla olan durum.

        //bu sekilde bir kullanima polymorphism deniyor.
//        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger()};
//        for (BaseLogger logger:loggers) {
//            logger.Log("Log mesaji");

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
