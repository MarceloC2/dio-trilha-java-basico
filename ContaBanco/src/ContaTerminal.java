import java.util.Scanner;

/**
 * Exercício todo o conteúdo apresentado no módulo de Sintaxe codificando
 * Cenário:
 * 
 * 1 - Crie o projeto ContaBanco que receberá dados via terminal contendo as
 * características de conta em banco conforme atributos:
 * Atributo Tipo Exemplo
 * Numero Inteiro 1021
 * Agencia Texto 067-8
 * Cliente Texto MARIO ANDRADE
 * Saldo Decimal 237.48
 * 
 * 2 - Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a
 * codificação do nosso programa.
 * 3 - Permita que os dados sejam inseridos via terminal sendo que o usuário
 * receberá a mensagem de qual informação será solicitada.
 * 3 - Depois de todas as informações terem sido inseridas, o sistema deverá
 * exibir a seguinte mensagem:
 * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência
 * é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para
 * saque".
 * 
 * Os campos em [ ] devem ser alterados pelas informações que forem inseridas
 * pelos usuários.
 **/
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Declaração das variáveis fora dos blocos try
        String numeroAgencia;
        String nomeCliente;
        float saldoConta;

        // Exibir as mensagens para o usuário
        System.out.println("$$$$$ Bem Vindo ao Banco Banco! $$$$$");

        // Obter os valores digitados no terminal
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o Número da Agência: ");
            numeroAgencia = scanner.nextLine();

            System.out.print("Por favor, digite seu Nome: ");
            nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o Saldo da Sua Conta: ");
            saldoConta = scanner.nextFloat();
        }

        // Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + numeroAgencia + ", conta e saldo " + saldoConta + " já estão disponíveis para saque.");
    }
}