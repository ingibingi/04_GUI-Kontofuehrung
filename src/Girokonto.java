//Ingo Schlapschy
//2aAPC
//ITL-12
//Lehrgang: 1
public class Girokonto extends Konto {
    private final double standardMinKontostand = -1_000;

    public Girokonto(String kontoinhaber, String kontonummer, double minKontostand) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp(KontoType.GIRONKONTO);
        this.setMinKontostand(minKontostand);
    }

    public Girokonto(String kontoinhaber, String kontonummer) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp(KontoType.GIRONKONTO);
        this.setMinKontostand(standardMinKontostand);

    }
}
