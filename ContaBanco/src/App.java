import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    // Instanciando uma nova Conta e um Scanner:
    ContaTerminal conta = new ContaTerminal();
    Scanner scanner = new Scanner(System.in);

    // Entrada dos valores da conta:
    System.out.println("Seja bem-vindo(a)!\nInsira o número da conta: ");
    conta.numero = scanner.nextInt();

    System.out.println("Agora insira o número da agência: ");
    conta.agencia = scanner.next();

    System.out.println("Qual o saldo da conta?: ");
    conta.saldo = scanner.nextDouble();
    // o proximo scanner consome a linha em branco permitindo a leitura da linha do cliente
    scanner.nextLine();

    System.out.println("Digite o nome e sobrenome do cliente: ");
    conta.nome_cliente = scanner.nextLine();

    // Método para fechar o scanner
    scanner.close();



    // Imprimindo os valores:
    System.out.println("\nOlá " + conta.nome_cliente +
    ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +
    ", conta " + conta.numero +
    " e seu saldo " + conta.saldo +
    " já está disponível para saque");
}
}
