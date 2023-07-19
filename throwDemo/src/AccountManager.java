public class AccountManager {
    private double balance;//hesapta tutulan para.
    public void depozit(double amount){//hesaba para yuklenir.
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws Exception {//hesaptan para cekilir.
        if(balance>=amount){
            balance=getBalance()-amount;
        }
        else {
            throw new Exception("Bakiye Yetersiz");//unhandle exception var sen bunu handle etmedin.bunu kim kullancakasa hata firlatilacagini karsi tarafa da bildrimek icin eklemeliyiz.
           //Bunun yerine  System.out.println("Para cekilemedi. Bakiye yetersiz");
        }

    }


    public double getBalance() {//hesaptaki parayi getirir.
        return balance;
    }
}
