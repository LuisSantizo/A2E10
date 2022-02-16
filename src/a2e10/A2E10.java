import java.util.Scanner;

public class A2E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definir variablesa
        int Numero;
        int contador = 0;
        int Multiplos = 0;
        int NumerosRango = 0;

        //hacer un ciclo que se denga hasta que complete la funcion
        do {
            System.out.println("Ingrese un numero");
            Numero = sc.nextInt();
            contador = contador + Numero;
            //ver si algun numero es multiplod de6
            if (Numero % 6 == 0) {
                Multiplos = Multiplos + 1;
            }
            //ver si algun numero esta en el rango de 1 a 10
            if (0 < Numero & Numero <= 10) {
                NumerosRango = NumerosRango + Numero;
            }

        } while (contador < 1000);
        System.out.println("La sumatoria es de: " + contador);
        System.out.println("la cantidad de numeros multiplos de 6 es de: " + Multiplos);
        System.out.println("la suma de numeros entre 1 y 10 es de: " + NumerosRango);
    }

}
