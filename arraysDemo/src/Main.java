public class Main {

    public static void main(String[] args) {
	    String[] ogrenciler=new String[4];

	    ogrenciler[0]="Ali";
        ogrenciler[1]="veli";
        ogrenciler[2]="can";
        ogrenciler[3]="cem";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------");

        for (String ogrenci:ogrenciler) { //foreach ile ayni sey.
            System.out.println(ogrenci);
        }
    }
}
