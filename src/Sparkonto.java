//Ingo Schlapschy
//2aAPC
//ITL-12
//Lehrgang: 1
public class Sparkonto extends Konto{
    public Sparkonto(String kontoinhaber, String kontonummer) {
        super(kontoinhaber, kontonummer);
        this.setKontotyp(KontoType.SPARKONTO);
        this.setMinKontostand(0);
    }
}
