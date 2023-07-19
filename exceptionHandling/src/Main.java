public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            int[] sayilar=new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }
        catch (Exception exception){
            System.out.println("Hata Olustu");
            System.out.println(exception);
        }
        finally {//ister try isterse catch calissin finally hep calisiyor.
            System.out.println("Ben her turlu calisirim.");
        }

    }
}
