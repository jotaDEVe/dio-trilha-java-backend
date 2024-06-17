public interface InterfaceBanco {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta destinatario);

}
