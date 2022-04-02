package exercicio01;

public class exercicio04 {

    public static void main(String[] args) {

        //variaveis
        double hp, lp, ha, la, area;

        hp = 5;
        lp = 10;
        ha = 2.5;
        la = 7.5;

        // calcula a area
        area = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + area);     
    }
}