package projetoAula10dez;

import java.util.Scanner;

public class classeAulaInterativa {

	public static void main(String[] args) {
		int ano = 0, idade = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano em que você nasceu...:");
		ano = entrada.nextInt();
		
		idade = 2020 - ano;
		
		
		if (idade >= 0 && idade <= 12) 
			System.out.printf("Você tem %d anos e ainda é uma criança.\n", idade);	
		else if (idade >= 13 && idade <= 17) 
			System.out.printf("Você tem %d anos e é adolescente.\n", idade);
		else if (idade >= 18 && idade <= 60) 
			System.out.printf("Você tem %d anos e é adulto!\n", idade);
		else if (idade > 60) 
			System.out.printf("Você tem %d anos e está na melhor idade.\n", idade);
		else 
			System.out.println("Você ainda nem nasceu.");
		
		if (idade >= 16) {
			System.out.printf("Você nasceu no ano de %d e com %d anos já pode votar.\n", ano, idade);
		
		if (idade >= 18)
			System.out.printf("Além disso você também poderá dirigir, pois tem %d anos.\n", idade);
			
	}
}
}
