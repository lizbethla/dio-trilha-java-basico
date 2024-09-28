public class IPhone implements Reproductor, Navegador, Telefone {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir Pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void seleccionarMusica(String musica) {
        System.out.println("Seleccionar " + musica);
    }

}
