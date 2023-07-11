public class Main {

    public static void main(String[] args) {
        int[] sayilar=new int[]{1,3,5,9,0};
        int aranacak=6;

        for (int ara:sayilar) {
            if(ara==aranacak){
                System.out.println("aranan sayi bulundu.");
            }

        }
	}
}
