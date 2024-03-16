class Bil{
    String regnummer;
    int antpassajarer;
    Bil(String regnummer, int antpassajarer){
        this.regnummer = regnummer;
        this.antpassajarer = antpassajarer;

    }
    @Override
    public String toString() {
        return regnummer + ", " + antpassajarer;
    }
}