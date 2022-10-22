package EJ1;

public class Lugar {
    private final int TAM = 10;
    private int espacio_ocupado;

    public Lugar(){
        espacio_ocupado = 0;
    }

    public synchronized boolean esta_lleno(){
        return espacio_ocupado == TAM;
    }

    public synchronized void subir(){
        while (espacio_ocupado == TAM){
            try {
                System.out.println(Thread.currentThread().getName()+" espera");
                this.wait();
             } catch (InterruptedException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
        }
        System.out.println(Thread.currentThread().getName()+" subio al barco");
        espacio_ocupado++;
    }


    public synchronized void descargar(){
        System.out.println("Buque ha descargado");
        espacio_ocupado = 0;
        this.notifyAll();
    }
}
