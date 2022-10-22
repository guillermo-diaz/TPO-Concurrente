package EJ1;

public class Auto extends Thread {
    Lugar lugares;

    public Auto(Lugar l, String n){
        super(n);
        lugares = l;

    }

    @Override
    public void run() {
        lugares.subir();
    }
}
