package principal;
import java.util.Scanner;
import dados.Moeda;
import requisicao.Req;

public class Principal {
    public static void main(String[] args){
        int opc;
        Scanner sc = new Scanner(System.in);
        Principal principal = new Principal();
        Req requisicao = new Req();
        Moeda usd = requisicao.obterCotacoes("USD");
        Moeda brl = requisicao.obterCotacoes("BRL");
        Moeda ars = requisicao.obterCotacoes("ARS");
        Moeda eur = requisicao.obterCotacoes("EUR");
        Moeda bob = requisicao.obterCotacoes("BOB");
        Moeda cop = requisicao.obterCotacoes("COP");

        principal.menu();
        opc = sc.nextInt();
        System.out.println("Digite quanto gostaria de converter: ");
        double valor = sc.nextDouble();
        System.out.println();

        switch (opc) {
            case 1:
                System.out.println(valor + " Dolares correspondem a " + usd.converterBRL(valor) + " Reais" );
                break;
            case 2:
                System.out.println(valor + " Pesos Colombianos correspondem a " + cop.converterEUR(valor) + " Euros" );
                break;
            case 3:
                System.out.println(valor + " Euros correspondem a " + eur.converterUSD(valor) + " Pesos Argentinos" );
                break;
            case 4:
                System.out.println(valor + " Reais correspondem a " + brl.converterEUR(valor) + " Euros" );
                break;
            case 5:
                System.out.println(valor + " Bolivianos correspondem a " + bob.converterCOP(valor) + " Pesos Chilenos" );
                break;
            case 6:
                System.out.println(valor + " Reais correspondem a " + brl.converterARS(valor) + " Pesos Argentinos" );
                break;
            case 7:
                System.out.println(valor + " Pesos Chileno correspondem a " + cop.converterUSD(valor) + " Dolares" );
                break;
            case 8:
                System.out.println(valor + " Pesos Argentinos correspondem a " + ars.converterBRL(valor) + " Reais" );
                break;
            default:
        }

    }

    public void menu(){
        System.out.println("Conversor de moeda");
        System.out.println();
        System.out.println("1 - Dólar Americano -> Real Brasileiro");
        System.out.println("2 - Peso Colombiano -> Euro");
        System.out.println("3 - Dólar Americano -> Peso Argentino");
        System.out.println("4 - Real Brasileiro -> Euro");
        System.out.println("5 - Boliviano boliviano -> Dólar Americano");
        System.out.println("6 - Real Brasileiro -> Peso Argentino");
        System.out.println("7 - Peso Chileno -> Dólar Americano");
        System.out.println("8 - Peso Argentino -> Real Brasileiro");
        System.out.println();
        System.out.println("Digite a opção número correspondente: ");
    }
}
