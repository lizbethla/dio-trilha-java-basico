public class App {
    public static void main(String[] args) throws Exception {
        
        IPhone iPhone = new IPhone();

        System.out.println("Reproductor----------");
        iPhone.seleccionarMusica("abc");
        iPhone.tocar();
        iPhone.pausar();

        System.out.println("Telefone----------");
        iPhone.ligar("123456789");
        iPhone.iniciarCorreioVoz();
        iPhone.atender();

        System.out.println("Navegador----------");
        iPhone.exibirPagina("www.google.com");
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
    }
}
