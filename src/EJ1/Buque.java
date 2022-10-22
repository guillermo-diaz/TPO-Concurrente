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
            if(lugares.esta_lleno()){
                ir();
                lugares.descargar();
            }
        }
    }

    public void ir(){
        System.out.println("Buque cruzando...");
        Random r = new Random();
        try {
            sleep(r.nextInt(100));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void volver(){

    }

    

}
