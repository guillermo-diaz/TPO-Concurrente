package EJ2;

public class Main {
    public static void main(String[] args) {
        Recipiente r = new Recipiente();
        Generador gen = new Generador(r);
        gen.start();

        while (true){
            r.vaciarRecipiente();
        }
    }
}
