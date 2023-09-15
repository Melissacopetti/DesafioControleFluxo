import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int parametroUm;
		int parametroDois;

		try {
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = terminal.nextInt();

			System.out.println("Digite o segundo parâmetro");
			parametroDois = terminal.nextInt();

			terminal.close();

			contar(parametroUm, parametroDois);

		} catch (InputMismatchException e) {
			System.err.println("Os parâmetros devem ser números inteiros.");
		} catch (ParametrosInvalidosException e) {
			System.err.println(e.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		for (int x = parametroUm; x <= parametroDois; x++) {
			System.out.println("Imprimindo o número " + x);
		}
	}
}
