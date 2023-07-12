public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }
    //camel casing metod ismi.
    public static void sayiBulmaca()
    {
        int[] sayilar = new int[]{1, 3, 5, 9, 0};
        int aranacak = 6;
        boolean kontrol = false;
        for (int ara : sayilar) {
            if (ara == aranacak) {
                kontrol = true;
            }
        }
        if (kontrol == true) {


            mesajVer("aranan sayi bulundu: "+aranacak);
        } else {

            mesajVer("aranan sayi bulunamadi: "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}
