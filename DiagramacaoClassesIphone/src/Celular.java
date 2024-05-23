public class Celular implements Audio, Telefone, Pesquisa {
    public static void main(String[] args) {

        
        String numero = "11123456789";

        ReprodutorMusical.selecionarMusica();
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        Navegador.adicionarNovaAba();
        Navegador.atualizarPagina();
        Navegador.exibirPagina();
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();
        AparelhoTelefonico.ligar(numero);
        
    }
}
