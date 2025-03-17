package ReprodutorMusical;

public class ReprodutorMusical implements Ipod {

    public void tocar(){
        System.out.println("Tocando a música...");
    }

    public void pausar(){
        System.out.println("Pausando a música...");
    }

    public void selecionarMusica(String nomeMusica){
        System.out.println("Selecionada a música: " + nomeMusica);
    }
}
