public class Sparkonto extends Konto{
    public Sparkonto(String kontoinhaber, String kontonummer) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp("Sparkonto");
        this.setMinKontostand(0);
    }
}
