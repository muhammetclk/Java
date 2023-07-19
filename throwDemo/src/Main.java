public class Main {

    //biz niye hata firlatiyoruz cunku bunu kullanicak  kullanici hatanin turune gore dogru aksiyon alsin diye.
    public static void main(String[] args)  {
        //throw ile bilincli olarak hata firlatiyoruz.
        //bir paket yazdik ve biz veya baska birisi bu paketi kullanicak
        //belli bir duruma gore hata firlatiriz ve baska kullanicida ayni durumu yaparak bu hatayi alsin diye throw kullaniriz
        //ve o kullanicida hataya gore aksiyon alsin.

        AccountManager manager=new AccountManager();
        System.out.println("Hesap: "+manager.getBalance());
        manager.depozit(100);
        System.out.println("Hesap: "+manager.getBalance());
        try{
            manager.withdraw(90);
        }
        catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: "+manager.getBalance());
        try {
            manager.withdraw(20);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap: "+manager.getBalance());
    }
}
