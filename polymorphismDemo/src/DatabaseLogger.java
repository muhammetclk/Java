public class DatabaseLogger extends BaseLogger {
    public void log(String message){ //BaseLogger daki ayni metodu buraya yazarak override ettik.Bu nesnede artik bu metod kullanilir.
        System.out.println("Logged to Database:"+message);

    }

}
