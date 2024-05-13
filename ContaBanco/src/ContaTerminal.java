import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    // Criando Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    //conta=int; agencia=txt; nome=string; saldo=double

    System.out.println("Por favor, digite o número da sua conta: "); 
    int conta = scanner.nextInt();

    System.out.println("Por favor, digite sue agencia: "); 
    String agencia = scanner.next();

    System.out.println("Por favor, digite seu nome: "); 
    String nome = scanner.next();
    
    System.out.println("Por favor, digite seu saldo: "); 
    Double saldo = scanner.nextDouble();
    
    System.out.println("====== Seu Banco ======");
    System.out.println("Olá " + nome +" , obrigado por criar uma conta em nosso banco, sua agência é" + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
    
}
