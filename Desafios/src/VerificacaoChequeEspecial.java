import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble(); //2500
        double saque = scanner.nextDouble();// 2750
        double limiteChequeEspecial = 500;
        double saldoCheque = saldo + limiteChequeEspecial;

        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");

        } else if (saque > saldo && saque < saldoCheque) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            
        } else System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        
        scanner.close();
    }
}