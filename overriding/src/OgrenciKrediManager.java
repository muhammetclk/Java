public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar){

        return tutar*1.10;//ogrenci icin uygulanan faiz daha az ise metodu bu sekilde ayni isimde kullanarak override ettik.
    }
}
