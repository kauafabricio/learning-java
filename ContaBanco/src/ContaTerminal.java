import java.util.Scanner;

// simple creation of a terminal bank for learning purposes

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo(a) ao Banco Terminal!");

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite seu nome (não utilize caracteres especiais): ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Olá, " + nomeCliente + "!" + " Obrigado por criar uma conta em nosso banco, sua agência é \'" + agencia + "\', conta \'" + numero + "\' e seu saldo " + saldo + " já está disponível para saque.");
    }
}
