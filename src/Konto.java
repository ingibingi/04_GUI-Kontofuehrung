public abstract class Konto {
    //Variablen
    private String kontotyp;
    private String kontoinhaber;
    private String kontonummer;
    private double kontostand;
    private double minKontostand;
    double zins;
    private String historie;

    //Konstruktoren
    public Konto (String kontoinhaber, String kontonummer){
        this.kontoinhaber = kontoinhaber;
        this.kontonummer = kontonummer;
    }

    //Hauptmethoden
    public void einzahlen(double betrag){
        this.eingangKonto(betrag);
        System.out.println(betrag+"€ eingezahlt");
        printKontostand();
    }

    public void auszahlen(double betrag){
        if(this.istBetragVerfuegbar(betrag)){
            this.ausgangKonto(betrag);
            System.out.println(betrag+"€ ausgezahlt");
        }else{
            System.out.println("Auszahlung nicht möglich");
        }
        this.printKontostand();
    }

    public void ueberweisen(Konto empfaenger, double betrag){
        if(istBetragVerfuegbar(betrag)){
            this.ausgangKonto(betrag);
            empfaenger.eingangKonto(betrag);
        }else{
            System.out.println("Überweisung nicht möglich.");
        }
        this.printKontostand();
    }

    //////////////////////////////////
    //Hilfsmethoden
    public double abhebbarerBetrag(){
        return this.getMinKontostand()-this.getKontostand();
    }

    public boolean istBetragVerfuegbar(double betrag){
        return (this.abhebbarerBetrag()>=betrag);
    }

    public void eingangKonto(double betrag){
        this.kontostand += betrag;
    }

    public void ausgangKonto(double betrag){ this.kontostand -= betrag; }

    public void printKontostand(){
        System.out.println("Aktueller Kontostand: "+this.getKontostand()+"€");
    }

    public void writeHistory(String eintrag) {
        this.historie += java.time.LocalDateTime.now()+" "+eintrag+"\n"; }


    //////////////////////////////////
    //Getter

    public double getKontostand() {
        return kontostand;
    }
    public String getKontoinhaber() {
        return kontoinhaber;
    }
    public String getKontonummer() {
        return kontonummer;
    }
    public String getKontotyp() {
        return kontotyp;
    }
    public double getZins() {
        return zins;
    }
    public double getMinKontostand() {
        return minKontostand;
    }

    //////////////////////////////////
    //Setter

    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void setKontotyp(String kontotyp) {
        this.kontotyp = kontotyp;
    }

    public void setZins(double zins) {
        this.zins = zins;
    }

    public void setMinKontostand(double minKontostand) {
        this.minKontostand = minKontostand;
    }
}
