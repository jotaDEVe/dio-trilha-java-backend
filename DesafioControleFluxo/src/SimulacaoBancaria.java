import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            System.out.println("1. Depositar\n2. Sacar\n3. Consultar Saldo\n0. Encerrar");
            int opcao = scanner.nextInt();
                
            switch(opcao){
              case 1:
                System.out.println("Qual o valor a ser depositado?: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                break;
                
              case 2:
                System.out.println("Qual o valor a ser sacado?: ");
                double valorSaque = scanner.nextDouble();
                if(valorSaque <= saldo){
                    saldo -= valorSaque;
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                break;
                
              case 3:
                System.out.println("Saldo atual: " + saldo);
                break;
                
              case 0:
                System.out.println("Programa encerrado.");
                return; // Encerra o método main e, consequentemente, o programa
                
              default:
                System.out.println("Opção inválida. Tente novamente."); 
                break;
            }
               
        }

        
    }
}