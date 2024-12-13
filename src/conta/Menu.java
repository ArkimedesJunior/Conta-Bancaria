package conta;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;

		// Instanciamento | Instancia da Classe ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(1, 34, 1, "Francisco", 500.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(1200.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// ContaPoupanca
		ContaPoupanca cc2 = new ContaPoupanca(2, 123, 2, "Maria", 100000.0f, 15);
		cc2.visualizar();
		cc2.sacar(1000.0f);
		cc2.visualizar();
		cc2.depositar(5000.0f);
		cc2.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);

			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("          BANCO DO BRAZIL com Z                 ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("        1 - Criar conta                         ");
			System.out.println("        2 - Listar totas as Contas              ");
			System.out.println("        3 - Buscar Conta por Numeros            ");
			System.out.println("        4 - Atualizar Dados da Conta            ");
			System.out.println("        5 - Apagar Conta                        ");
			System.out.println("        6 - Sacar                               ");
			System.out.println("        7 - Depositar                           ");
			System.out.println("        8 - Tranferir Valores entre Contas      ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("Encontre com a opção desejada                   ");
			System.out.println("                                                " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta \n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Deposito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferencia entre Contas\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Invalida!\n" + Cores.TEXT_RESET);
				break;

			}
		}
	}
}
	

	

	


