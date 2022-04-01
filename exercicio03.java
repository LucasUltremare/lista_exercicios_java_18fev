package exercicio01;

//Scanner 
import java.util.Scanner;

public class exercicio03 {

        public static void main(final String[] args) {

            //variaveis
            double n1, n2, n3, n4, media;

            //Utilização do Scanner
            System.out.print("Salario 1: ");
            n1 = new Scanner(System.in).nextDouble();
            System.out.print("Salario 2: ");
            n2 = new Scanner(System.in).nextDouble();
            System.out.print("Salario 3: ");
            n3 = new Scanner(System.in).nextDouble();
            System.out.print("Salario 4: ");
            n4 = new Scanner(System.in).nextDouble();
    
            //calcula a media
            media = (n1 + n2 + n3 + n4) / 4;
            
            //print final
            System.out.println("A média salarial da empresa é de R$ " + media);
        }

}