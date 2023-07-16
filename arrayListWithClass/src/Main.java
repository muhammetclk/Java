import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();//musteri arraylisti
        customers.add(new Customer(1,"Ali","Veli"));
        customers.add(new Customer(2,"Can","Veli"));
        customers.add(new Customer(3,"Cem","Veli"));
        customers.remove(new Customer(1,"Ali","Veli"));
        //remove ederken yine newledigimiz icin yeni bir referans numarasi olusur bu yuzden id si 1 olan silinmez.Yeni olusan silinir.
        //burda referans tiplerin onemini goruyroruz.
        //bu degeri Customer tipinde bir degiskene atayip arrayliste bu degiskeni ekleyip, silseydik ise silinirdi.Cunku newleme yapmmais olurduk.
        for (Customer customer:customers) {
            System.out.println(customer.Firstname);

        }
    }
}
