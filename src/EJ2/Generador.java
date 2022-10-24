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

            if (v == 0) {
                Thread h1 = new Oxigeno(reci);
                h1.start();
            } else {
                Thread h2 = new Hidrogeno(reci);
                h2.start();
            }

            //System.out.println("aaaaaaaaaaaaaaaaaa");
            if (reci.hayAtomosSuficientes()) {

                System.out.println("se puede crear una molecula de agua");
                reci.avisar();
               
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
