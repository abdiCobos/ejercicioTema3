public class Main {
    public static void main(String[] args) {

        var resultado = suma(10,10,10);


        System.out.println(resultado);
    }


        public static int suma (int a, int b, int c){

        return a + b + c;
    }


}

public class coche {


        int numPuertas;


        byte puertas = 4;

        public void sumarPuertas() {
        puertas += 1;

        System.out.println(puertas);

        coche coche1 = new Coche();

        coche1.numPuertas = 2;

        System.out.println(coche1.numPuertas);

       }


    }