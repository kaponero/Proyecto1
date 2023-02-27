public class Main {
    public static void main(String[] args) {

        int resultado = suma (5,10,18);
        System.out.println(resultado);

        coche MiCoche = new coche();
        MiCoche.incrementatr_puertas();
        System.out.println(MiCoche.puertas);
    }

// parte 1
    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}
// parte 2
class coche {
    public int puertas=0;

    public void incrementatr_puertas(){
        this.puertas++;
    }
}