public class Hovedprogram {
    public static void main(String[] args) {
        Parkeringsplass<Bil> biler = new Parkeringsplass<>();
        Parkeringsplass<MotorSykkel> motorsykkel = new Parkeringsplass<>();
        Bil bil1 = new Bil ("11111", 2);
        MotorSykkel ms1 = new MotorSykkel("22222", 500);
        biler.settInn(bil1);
        motorsykkel.settInn(ms1);
        System.out.println(biler.taUt());
        System.out.println(motorsykkel.taUt());
    }
    
}
