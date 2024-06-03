import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
          

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: " + saldo);
                    
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    double sacar = scanner.nextDouble();
                    if (sacar > saldo) {System.out.println("Saldo insuficiente.");
                    
                    }
                    else saldo = saldo - sacar; {System.out.println("Saldo atual: " + saldo);};
                      
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}