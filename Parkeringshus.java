public class Parkeringshus {
    static Parkeringsplass[] etasje1 = new Parkeringsplass[10];
    static Parkeringsplass[] etasje2 = new Parkeringsplass[10];
    public static void main(String[] args) {
        Bil bil1 = new Bil("AH842397", 5);
        Bil bil2 = new Bil("KJ193287", 8);
        Bil bil3 = new Bil("JD873495", 3);
        MotorSykkel motorsykkel1 = new MotorSykkel("IW43298", 345);
        MotorSykkel motorsykkel2 = new MotorSykkel("UK82748", 500);
        MotorSykkel motorsykkel3 = new MotorSykkel("OI82344", 245);

        etasje1[4] = new Parkeringsplass();
        etasje1[4].settInn(bil1);

        etasje2[4] = new Parkeringsplass();
        etasje2[4].settInn(bil2);

        etasje1[5] = new Parkeringsplass();
        etasje1[5].settInn(bil3);

        etasje2[8] = new Parkeringsplass();
        etasje2[8].settInn(motorsykkel1);

        etasje1[2] = new Parkeringsplass();
        etasje1[2].settInn(motorsykkel2);

        etasje2[5] = new Parkeringsplass();
        etasje2[5].settInn(motorsykkel3);

        for (int i = 0; i < 10; i++) {
            if (etasje1[i] != null) {
                etasje1[i].taUt();
                etasje1[i] = null;
            }
            if (etasje2[i] != null) {
                etasje2[i].taUt();
                etasje2[i] = null;
            }
        }
    }
}
    

