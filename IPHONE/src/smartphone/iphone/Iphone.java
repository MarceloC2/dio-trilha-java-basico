package smartphone.iphone;

import smartphone.internet.NavegadorInternet;
import smartphone.internet.SafariNavegador;
import smartphone.ipod.ExecutarIpod;
import smartphone.ipod.Ipod;
import smartphone.telefone.AparelhoTelefonico;
import smartphone.telefone.ChamadasTelefonicas;

public class Iphone {
    public static void main(String[] args) {
        // Configuração do navegador
        SafariNavegador safari = new SafariNavegador();
        NavegadorInternet navegador = safari;
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();

        // Reprodução de música
        ExecutarIpod ipodPlayer = new ExecutarIpod();
        Ipod ipod = ipodPlayer;
        ipod.selecionarMusica();
        ipod.tocarMusica();
        ipod.pausarMusica();

        // Gerenciamento de chamadas telefônicas
        ChamadasTelefonicas chamadas = new ChamadasTelefonicas();
        AparelhoTelefonico aparelho = chamadas;
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

    }
}
