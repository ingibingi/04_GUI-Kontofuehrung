public class Kreditkonto extends Konto{
    public Kreditkonto(String kontoinhaber, String kontonummer, double betragKredit) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp("Girokonto");
        this.setKontostand(-betragKredit);
    }
}
