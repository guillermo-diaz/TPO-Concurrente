package EJ2;

public class Oxigeno extends Thread{
    private Recipiente r;
    
    public Oxigeno (Recipiente r){
        this.r = r;
        r.seGeneroOxigeno();

    }
    @Override
    public void run() {
        r.seGeneroAgua();
    }
}
