public class Main {

    public static void main(String[] args) {
        String mesaj="Bugun hava cok guzel.";

        System.out.println(mesaj);
       /* System.out.println("Karakter sayisi:"+mesaj.length());
        System.out.println("5. eleman:"+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin !"));

        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));

        char[] karakterler=new char[4];
        mesaj.getChars(0,4,karakterler,0); //mesaj degiskeninin 0. indeksinden basla 4 e kadar git.karakterler char dizisine 0. indeksten itibaren at.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a")); //ilk bulunan karakterin indeksi.

        System.out.println(mesaj.lastIndexOf("a")); //aramaya sagdan sola dogru yapar.buldugunda soldan saga dogru sayar.*/

       String yeniMesaj= mesaj.replace(" ","-");
       System.out.println(yeniMesaj);

       System.out.println(mesaj.substring(4,9));

        for (String kelime:mesaj.split(" ")) {System.out.println(kelime); //bosluklari dikkate alarak keser.

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());//basta sonda bosluk falan olursa onlari keser.
        }
    }
}
