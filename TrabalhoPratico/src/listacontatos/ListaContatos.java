package listacontatos;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Digite o comando desejado:
 * 1 - adicionar cliente na lista
 * 2 - remover cliente da lista
 * 3 - mostrar lista
 * 4 - sair
 */

public class ListaContatos {
	private ArrayList<String> lista = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("***LISTA DE CONTATOS*** \n");
		sb.append("Digite o comando desejado: \n");
		sb.append("1 - adicionar contato na lista  \n");
		sb.append("2 - remover contato da lista \n");
		sb.append("3 - mostrar lista de contatos \n");
		sb.append("4 - sair \n");
		System.out.println(sb.toString());	
		
		return scanner.nextLine();
	}
		
	public void iniciar() {
		String opcao = mostrarMenu();
		while (!opcao.equals("4")) {
			switch (opcao) {
			case "1":
				System.out.println("Digite o nome do contato para adicionar na lista: ");
				String item = scanner.nextLine();
				lista.add(item);
				System.out.println(lista);
				opcao = mostrarMenu();			
				break;
			case "2":
				System.out.println("Digite o indice do contato para remover da lista: ");
				int indice = Integer.valueOf(scanner.nextLine());
				lista.remove(indice);
				System.out.println(lista);
				opcao = mostrarMenu();					
				break;	
			case "3":
				System.out.println(lista);
				opcao = mostrarMenu();			
				break;
			default:
				System.out.println("Opção inválida.");
				opcao = mostrarMenu();
			}
		}
		scanner.close();
		System.out.println("Obrigada!");		
	}	
}