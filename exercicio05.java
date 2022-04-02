package exercicio01;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        double V, R, A;

        System.out.print("Valor do Raio:");
        R = new Scanner(System.in).nextDouble();
        System.out.print("Valor da Altura");
        A = new Scanner(System.in).nextDouble();

        V = 3.14159 * R * R * A;
        System.out.println("O volume da lata de óleo é de " + V + " m³");
    }

}