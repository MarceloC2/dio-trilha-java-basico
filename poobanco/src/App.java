import bancozurc.agencia.clientes.Cliente;
import bancozurc.tiposconta.Conta;
import bancozurc.tiposconta.ContaCorrente;
import bancozurc.tiposconta.ContaPupanca;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do titular: ");
            String nomeTitular = scanner.nextLine();
            
            Cliente titular = new Cliente();
            titular.setNome(nomeTitular);
            
            Conta cc = new ContaCorrente(titular);
            Conta poupanca = new ContaPupanca(titular);
            
            int opcao;
            do {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Depositar na Conta Corrente");
                System.out.println("2. Depositar na Conta Poupança");
                System.out.println("3. Transferir Para Conta Poupança");
                System.out.println("4. Transferir Para Conta Corrente");
                System.out.println("5. Sacar Conta Corente");
                System.out.println("6. Imprimir extrato da conta corrente");
                System.out.println("7. Imprimir extrato da conta poupança");
                System.out.println("0. Sair");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite o valor para depósito na Conta Corrente: ");
                        double valorDeposito = scanner.nextDouble();
                        cc.depositar(valorDeposito);
                    }
                    case 2 -> {
                        System.out.print("Digite o valor para depósito na Poupança: ");
                        double valorDeposito = scanner.nextDouble();
                        poupanca.depositar(valorDeposito);
                    }
                    case 3 -> {
                        System.out.print("Digite o valor da transferência para Poupança: ");
                        double valorTransferencia = scanner.nextDouble();
                        cc.transferir(valorTransferencia, poupanca);
                    }
                    case 4 -> {
                        System.out.print("Digite o valor da transferência para Conta Corrente: ");
                        double valorTransferencia = scanner.nextDouble();
                        poupanca.transferir(valorTransferencia, cc);
                    }
                    case 5 -> {
                        System.out.print("Digite o valor para saque: ");
                        double valorSaque = scanner.nextDouble();
                        cc.sacar(valorSaque);
                    }
                    case 6 -> {
                        System.out.println("\nExtrato da conta corrente:");
                        cc.ImprimirExtrato();
                    }
                    case 7 -> {
                        System.out.println("\nExtrato da conta poupança:");
                        poupanca.ImprimirExtrato();
                    }
                    case 0 -> System.out.println("Encerrando o programa. Obrigado!");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        }
    }
}
