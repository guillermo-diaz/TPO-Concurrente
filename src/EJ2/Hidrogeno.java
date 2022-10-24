package EJ2;

public class Hidrogeno extends Thread{
    private Recipiente r;

    public Hidrogeno (Recipiente r){
        this.r = r;
        r.seGeneroHidrogeno();

    }
    @Override
    public void run() {
        r.seGeneroAgua();
    }
}
