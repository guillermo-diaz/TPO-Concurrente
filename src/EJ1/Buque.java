package EJ1;

import java.util.Random;

public class Buque extends Thread{
    private final Lugar lugares;

    public Buque(Lugar l){
        lugares = l;
    }

    @Override
    public void run() {
        while (true){
            if(lugares.esta_lleno()){ //solo sale si está lleno
                ir();
                lugares.descargar();
                volver();
                lugares.avisar_llegada();;
            }
        }
    }

    public void ir(){
        System.out.println("Buque cruzando...");
        Random r = new Random();
        try {
            sleep(r.nextInt(1000));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void volver(){
        System.out.println("Buque volviendo...");
        Random r = new Random();
        try {
            sleep(r.nextInt(1000));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    

}
