public class Main {

    public static void main(String[] args) {
	// girdigimiz harfi kalin seslimi yoksa ince seslimi oldugunu bulalim.


        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Girilen kalin sesli harf");
                break;
            default:
                System.out.println("Girilen ince sesli harf");

        }


    }
}
