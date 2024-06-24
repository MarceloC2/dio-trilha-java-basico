package smartphone.telefone;

public class ChamadasTelefonicas implements AparelhoTelefonico {

    public void ligar() {
        System.out.println("Realizando Ligação");
    }

    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

}