package EJ1;

public class Main {
    public static void main(String[] args) {
        Lugar lugar = new Lugar();
        Buque buque = new Buque(lugar);
        Auto[] autos = new Auto[30];
        crear_autos(autos, lugar);
        activar_hilos(autos);
        buque.start();

    }

    public static void crear_autos(Auto[] arr, Lugar l){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Auto(l, "Auto #"+i);
        }
    }
    public static void activar_hilos(Thread[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].start();
        }
    }
}
