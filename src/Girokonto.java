public class Girokonto extends Konto {

    public Girokonto(String kontoinhaber, String kontonummer, double minKontostand) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp("Girokonto");
        this.setMinKontostand(minKontostand);
    }
}
