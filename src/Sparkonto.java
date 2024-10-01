public class Sparkonto extends Konto{
    public Sparkonto(String kontoinhaber, String kontonummer) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp(KontoType.SPARKONTO);
        this.setMinKontostand(0);
    }
}
