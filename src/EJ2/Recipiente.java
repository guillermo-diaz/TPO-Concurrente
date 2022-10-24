package EJ2;

public class Recipiente {
    private int atomoO;
    private int atomoH;
    private int cant;
    private int num;

    public Recipiente() {
        atomoH = 0;
        atomoO = 0;
        cant = 0;
        num = 0;
    }

    public synchronized void seGeneroOxigeno() {
        System.out.println("SE genera atomo oxigeno");
        atomoO++;
    }

    public synchronized void seGeneroHidrogeno() {
        System.out.println("SE genera atomo hidrogeno");
        atomoH++;
    }

   public synchronized void seGeneroAgua() {
        while (atomoH <= 1 || atomoO == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ;
        }
        atomoH--;
        atomoH--;
        atomoO--;
        cant++;
        System.out.println("Se genero agua");
    }

    public synchronized boolean hayAtomosSuficientes() {
        boolean haySuficientes = false;
        if (atomoO > 0 && atomoH > 1) {
            haySuficientes = true;
            /*atomoH--;
            atomoH--;
            atomoO--;*/
        }
        return haySuficientes;
    }

    public synchronized void avisar() {
        notifyAll();
    }

    public synchronized void vaciarRecipiente(){
        if (cant == 3){
            System.out.println("SE vacia recipiente");
            cant = 0;
            num++;
            if(num == 2){
                System.out.println("atomoO " +atomoO);
                System.out.println("atomoH "+atomoH);
            }
        }
    }

}
