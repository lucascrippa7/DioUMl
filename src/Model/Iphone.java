package Model;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    private String musicaAtual;
    private String numeroAtual;

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        numeroAtual = numero;
        System.out.println("Ligando para: " + numeroAtual);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    // Métodos de NavegadorInternet
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

}
