package projetoAula10dez;

import java.util.Scanner;

public class classeAulaInterativa {

	public static void main(String[] args) {
		int ano = 0, idade = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano em que voc� nasceu...:");
		ano = entrada.nextInt();
		
		idade = 2020 - ano;
		
		
		if (idade >= 0 && idade <= 12) 
			System.out.printf("Voc� tem %d anos e ainda � uma crian�a.\n", idade);	
		else if (idade >= 13 && idade <= 17) 
			System.out.printf("Voc� tem %d anos e � adolescente.\n", idade);
		else if (idade >= 18 && idade <= 60) 
			System.out.printf("Voc� tem %d anos e � adulto!\n", idade);
		else if (idade > 60) 
			System.out.printf("Voc� tem %d anos e est� na melhor idade.\n", idade);
		else 
			System.out.println("Voc� ainda nem nasceu.");
		
		if (idade >= 16) {
			System.out.printf("Voc� nasceu no ano de %d e com %d anos j� pode votar.\n", ano, idade);
		
		if (idade >= 18)
			System.out.printf("Al�m disso voc� tamb�m poder� dirigir, pois tem %d anos.\n", idade);
			
	}
}
}
