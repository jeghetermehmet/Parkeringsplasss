public class Parkeringsplass<E> {
    E kjoeretoey;

    void settInn(E kjoeroetoey){
        this.kjoeretoey = kjoeroetoey;
    }
    E taUt(){
        E temp = this.kjoeretoey;
        this.kjoeretoey = null;
        return temp;
    }
    
}
