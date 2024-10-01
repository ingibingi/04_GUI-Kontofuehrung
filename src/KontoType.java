//Ingo Schlapschy
//2aAPC
//ITL-12
//Lehrgang: 1
public enum KontoType {
    GIRONKONTO("Girokonto"),
    KREDITKONTO("Kreditkonto"),
    SPARKONTO("Sparkonto");

    private final String type;

    KontoType(String type) {
        this.type = type;
    }

    public String getType (){
        return this.type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
