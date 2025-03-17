package AparelhoTelefonico;

public class AparelhoTelefonico implements Telefone {

    public void ligar(String numeroTelefonico){
        System.out.println("Discando para o número de telefonico: " + numeroTelefonico);
    }

    public void atender(){
        System.out.println("Atendento à ligação recebida...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz...");
    }
}
