public class Testes {
    
    public static void main(String[] args) {
            Cliente Rodrigo = new Cliente();
            Rodrigo.setNome("Rodrigo");
            Rodrigo.setCPF("111.222.333-0x");
            Cliente Eduarda = new Cliente();
            Eduarda.setCPF("333.222.111-x0");
            Eduarda.setNome("Eduarda");
            
            Conta contaTesteTransferencia = new Conta(Rodrigo, 5, 3921);
            Conta contaTeste = new Conta(Eduarda, 2, 2167);

            System.out.println("\n\n--------------------------------------");
            System.out.println("Contas antes do depósito...");
            System.out.println(contaTeste);
            System.out.println("###########################");
            System.out.println(contaTesteTransferencia);
            System.out.println("--------------------------------------");
            
            contaTeste.depositar(500);
            contaTeste.transferir(100, contaTesteTransferencia);
            
            System.out.println("\n\n--------------------------------------");
            System.out.println("Contas após o depósito...");
            System.out.println(contaTeste);
            System.out.println("###########################");
            System.out.println(contaTesteTransferencia);
            System.out.println("--------------------------------------");
    }
}
