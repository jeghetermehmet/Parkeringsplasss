public class MotorSykkel {
    String regnummer;
    int mtrstrls;
    MotorSykkel(String regnummer, int mtrstrls){
        this.regnummer = regnummer;
        this.mtrstrls = mtrstrls;

    }
    @Override
    public String toString() {                  
        return regnummer + ", " + mtrstrls;
    
}
}
