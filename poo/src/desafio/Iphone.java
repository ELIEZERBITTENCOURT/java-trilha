package desafio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // ReprodutorMusical
        meuIPhone.selecionarMusica("CAJU - Liniker");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // AparelhoTelefonico
        meuIPhone.ligar("999999-999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // NavegadorInternet
        meuIPhone.exibirPagina("www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
