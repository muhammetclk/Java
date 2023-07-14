public abstract class GameCalculator {
    public abstract void hesapla();//bunda ise GameCalculator i kim inherit  ediyorsa hesapla yi icermek zorunda fakat hesaplayi override etmek zorunda.

    public final void gameOver(){ //burda GameCalculator i kim kullaniyorsa gameOver i override edemez(final var) hepsi bunu kullanmak zorunda.
        System.out.println("Oyun bitti");
    }
}
