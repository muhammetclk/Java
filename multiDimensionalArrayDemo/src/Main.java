public class Main {

    public static void main(String[] args) {
        //3 bolge ve 3 sehirden olusan  bir cok boyutlu dizi tasarla.

        String[][] cities = new String[3][3];

        cities[0][0] = "istanbul";
        cities[0][1] = "Yalova";
        cities[0][2] = "Bursa";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Eskisehir";
        cities[2][0] = "Adana";
        cities[2][1] = "Mersin";
        cities[2][2] = "Hatay";

        for (int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println("Cities:"+cities[i][j]);
            }
            System.out.println("----------------");
        }
    }
}
