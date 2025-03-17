package NavegadorNaInternet;

public class NavegadorNaInternet implements Safari{

    public void exibirPagina(String url){
        System.out.println("Iniciando navegação para a " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba ao navegador.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando o site atual...");
    }
}
