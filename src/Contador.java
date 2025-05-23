import java.util.Scanner;


public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
		}
		
	}
	

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;
        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < contagem; i++) {
            System.err.printf("Imprimindo o número %s \n", i);
        }
    }
}
