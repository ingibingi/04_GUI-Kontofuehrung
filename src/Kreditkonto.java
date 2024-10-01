public class Kreditkonto extends Konto{
    private final double betragKredit;
    public Kreditkonto(String kontoinhaber, String kontonummer, double betragKredit) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp(KontoType.KREDITKONTO);
        this.betragKredit = betragKredit;
        this.setKontostand(-betragKredit);
    }
}
