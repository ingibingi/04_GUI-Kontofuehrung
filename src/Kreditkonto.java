//Ingo Schlapschy
//2aAPC
//ITL-12
//Lehrgang: 1
public class Kreditkonto extends Konto{
    private final double betragKredit;
    public Kreditkonto(String kontoinhaber, String kontonummer, double betragKredit) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp(KontoType.KREDITKONTO);
        this.betragKredit = betragKredit;
        this.setKontostand(-betragKredit);
    }
}
