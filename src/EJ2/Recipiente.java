package EJ2;

public class Recipiente {
    private int atomoO;
    private int atomoH;
    private int cant;
    //private int num;
    

    public Recipiente() {
        atomoH = 0;
        atomoO = 0;
        cant = 0;
        //num = 0;
    }

    public synchronized void seGeneroOxigeno() {
        System.out.println("Se genera atomo oxigeno");
        atomoO++;
    }

    public synchronized void seGeneroHidrogeno() {
        System.out.println("Se genera atomo hidrogeno");
        atomoH++;
    }

   public synchronized void seGeneroAgua() {
        while (atomoH <= 1 || atomoO == 0) { //mientras no se pueda generar agua
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
        System.out.println("\u001B[34m"+"SE GENERO AGUA");
        System.out.println("Atomos Hidrogenos restantes: "+atomoH);
        System.out.println("Atomos Oxigeno restantes: "+atomoO);
        System.out.print("\u001B[0m");
    }

    public synchronized boolean hayAtomosSuficientes() {
        return atomoO > 0 && atomoH > 1;
    }

    public synchronized void avisar() {
        notifyAll();
    }

    public synchronized void vaciarRecipiente(){
        if (cant == 3){
            System.out.println("Se vacia recipiente");
            cant = 0;
        }
    }

}
