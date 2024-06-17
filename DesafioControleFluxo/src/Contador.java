import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		// O programa começa pedindo ao usuário para inserir dois parâmetros (números
		// inteiros) através do console. Os parâmetros são armazenados nas variáveis
		// parametroUm e parametroDois
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro:");
			int parametroUm = 0;
			try {
				parametroUm = Integer.parseInt(terminal.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Erro: Insira um número válido para o primeiro parâmetro.");
				return;
			}

			System.out.println("Digite o segundo parâmetro:");
			int parametroDois = 0;
			try {
				parametroDois = Integer.parseInt(terminal.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Erro: Insira um número válido para o segundo parâmetro.");
				return;
			}

			// chamando o método contendo a lógica de contagem
			// Após obter os parâmetros, o programa chama o método contar(parametroUm,
			// parametroDois)
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		// Esse método é responsável por imprimir os números no intervalo entre
		// parametroUm e parametroDois
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		// realizar o for para imprimir os números com base na variável contagem
		// loop for para imprimir os números de parametroUm até parametroDois
		for (int i = parametroUm; i <= parametroDois; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}