import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Por favor, digite o seu nome: ");
    String Nome_Cliente = scanner.nextLine();
    
    System.out.println("Por favor, digite o seu numero: ");
    int numero = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Por favor, digite sua agência: ");
    String agencia = scanner.nextLine();

    System.out.println("Por favor, digite seu saldo:  ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + 
    ", conta "+ numero + " e seu saldo " + saldo + "já está disponível para saque.");

    }
}
