package EJ2;

public class Main {
    public static void main(String[] args) {
        Recipiente reci = new Recipiente();
        Generador gen = new Generador(reci);
        gen.start();

        while (true){ //controla  si el recipiente se llena
           
            reci.vaciarRecipiente();
        }
    }
}
