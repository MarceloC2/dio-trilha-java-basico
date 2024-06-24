package smartphone.ipod;

import java.util.Scanner;

public class ExecutarIpod implements Ipod {

    public void tocarMusica() {
        System.out.println("Tocar Música");
    }

    public void pausarMusica() {
        System.out.println("Pausar Música");
    }

    public void selecionarMusica() {
        String[] musicas = {
                "Bohemian Rhapsody - Queen",
                "Stairway to Heaven - Led Zeppelin",
                "Hotel California - Eagles",
                "Imagine - John Lennon",
                "Comfortably Numb - Pink Floyd",
                "Sweet Child o' Mine - Guns N' Roses",
                "Smells Like Teen Spirit - Nirvana",
                "Livin' on a Prayer - Bon Jovi",
                "Wish You Were Here - Pink Floyd",
                "Paint It Black - The Rolling Stones"
        };

        System.out.println("Top 10 Rock:");
        for (int i = 0; i < musicas.length; i++) {
            System.out.println((i + 1) + ". " + musicas[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        if (escolha >= 1 && escolha <= musicas.length) {
            System.out.println("Você escolheu: " + musicas[escolha - 1]);
        } else {
            System.out.println("Opção inválida. Escolha um número válido.");
        }
        scanner.close();
    }

}
