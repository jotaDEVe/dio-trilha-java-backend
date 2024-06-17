public class Conta implements InterfaceBanco {

   //Atributos
   private int agencia;

   private int conta;

   private double saldo = 0;

   private Cliente cliente;

   //Getters
   public int getAgencia(){
       return agencia;
   }
   public int getConta(){
       return conta;
   }
   public double getSaldo(){
       return saldo;
   }
   public Cliente getCliente(){
        return cliente;
}

   //Setters
   public void setAgencia(int novoValor){
       agencia = novoValor;
   }
   public void setConta(int novoValor){
       conta = novoValor;
   }
   public void setSaldo(double novoValor){
       saldo = novoValor;
   }

   //Constructor
   public Conta(Cliente cliente, int agencia, int conta){
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
        
        
    }


    //Metodos
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void transferir(double valor, Conta destinatario) {
        saldo -= valor;
        destinatario.saldo += valor;
    }
    @Override
    public String toString() {
        return "Conta [" + cliente +
         ", conta = " + conta +
          ", saldo = " + saldo +
           ", agência = " + agencia + "]";
    }
    

}
