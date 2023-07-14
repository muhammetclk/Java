public class CustomerManager {
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
    this.baseLogger=baseLogger;
    }
    public void add(){

        System.out.println("Musteri ekledni.");
        this.baseLogger.log("Log mesaji");
    }

}
