package EJ2;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class Generador extends Thread {

    private Recipiente reci;
    Random r = new Random();

    public Generador(Recipiente r) {
        reci = r;
    }

    public void run() {
        while (true) {
            int v = r.nextInt(2);

            //genera atomos aleatorios
            if (v == 0) {
                Thread h = new Hidrogeno(reci);
                h.start();
            } else {
                Thread h = new Oxigeno(reci);
                h.start();
            }

            
            if (reci.hayAtomosSuficientes()) {

                System.out.println("Se puede crear una molecula de agua");
                reci.avisar(); //avisa a los hilos que se puede crear agua
               
            }

            try {
                sleep(r.nextInt(1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
