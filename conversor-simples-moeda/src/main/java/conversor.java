import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("BEM-VINDO AO CONVERSOR DE MOEDAS");
        System.out.println("---------------------------------");
        System.out.println("Escolha para qual moeda  você deseja converter:");
        System.out.println("1. USD  |  2. UYU  |  3. ARS  |  4. BTC");
        int opcao = leia.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Digite um valor em R$:");
        double valor = leia.nextDouble();

        switch (opcao){
            case 1:
                usd(valor);
            break;
            case 2:
                uyu(valor);
                break;
            case 3:
                ars(valor);
                break;
            case 4:
                btc(valor);
                break;
        }

    }

   static void usd(double valor){
        double resultado = valor*5;
        System.out.println("O VALOR EM DOLAR FICOU:");
        System.out.println("USD: " + resultado);
    }
    static void uyu(double valor){
        double resultado = valor*7.60;
        System.out.println("O VALOR EM PESOS URUGUAIOS FICOU:");
        System.out.println("UYU: " + resultado);
    }
    static void ars(double valor){
        double resultado = valor*160;
        System.out.println("O VALOR EM PESOS ARGENTINOS FICOU:");
        System.out.println("ARS: " + resultado);
    }
    static void btc(double valor){
        double resultado = valor/144000;
        String numeroFormatado = String.format("%.8f", resultado);
        System.out.println("O VALOR EM BTC FICOU:");
        System.out.println("BTC: " + numeroFormatado);
    }
}
