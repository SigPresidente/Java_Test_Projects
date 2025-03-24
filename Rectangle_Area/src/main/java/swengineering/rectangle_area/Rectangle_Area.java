class Rettangolo {
    private double lenght; // lunghezza del rettangolo
    private double width; // larghezza del rettangolo
    
    //Costruttore senza parametri
    public Rettangolo() {
        lenght = 4;
        width = 2;
    }
    //Costruttore con lunghezza e larghezza fornite
    public Rettangolo(double lunghezza, double larghezza) {
        lenght = lunghezza;
        width = larghezza;
    }
    
    public double perimetro() {
        return 2*lenght + 2*width;
    }
    
    public double area() {
        return lenght*width;
    }
    
    //Main, ora definisco il vero e proprio programma:
    public class RectangleTest {
        public static void main(String args[]) {
        Rettangolo rettangolo1 = new Rettangolo();                                      //creo il primo rettangolo che ha parametri già definiti (primo modo)
        Rettangolo rettangolo2 = new Rettangolo(lunghezza:8, larghezza:9);                     //creo il secondo rettangolo passando i paramentri al costruttore
        System.out.println("Perimetro del rettangolo 1 = "+rettangolo1.perimetro());    //stampo il calcolo dei perimetri e aree dei due rettangoli rispettivamente
        System.out.println("Area del rettangolo 1 = "+rettangolo1.area());
        System.out.println("Perimetro del rettangolo 2 = "+rettangolo2.perimetro());
        System.out.println("Area del rettangolo 2 = "+rettangolo2.area());
    }
}
}