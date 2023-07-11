public class Main {

    public static void main(String[] args) {
        //asal sayimi ?
	    int number=2;
	    boolean kontrol=false;
	    for (int i=2;i<number;i++){
	        if(number%i==0){
	            kontrol=true;
	            break;
            }
        }

	    if(kontrol==true){
	        System.out.println(number+" asal degildir. ");
        }
	    else if(number<2) {
			System.out.println(number+" asal degildir. ");

        }
	    else {
			System.out.println(number+" Asaldir.");
		}
    }
}
