public class Main {
    public static void main(String[] args) {

        int resultado = suma (5,10,18);
        System.out.println(resultado);

        coche auto = new coche();
        auto.incrementatr_puertas();
        auto.incrementatr_puertas();
        System.out.println(auto.puertas);
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