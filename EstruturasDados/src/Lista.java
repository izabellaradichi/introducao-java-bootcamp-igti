import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		
		//adicionar elementos na lista
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Palio");
		
		//adiciona elemento no indice informado
		carros.add(1, "Sandero");
		
		//verifica a existencia do elemento no array
		if (carros.contains("Gol")) {
			System.out.println("Existe o elemento Gol no array");
		} else {
			System.out.println("Não existe o elemento Gol no array");
		}
		
		//altera o elemento 
		carros.set(2, "Fusca"); 
		
		carros.add("Gol"); 
		
		//retorna o indice da primeira ocorrencia do elemento
		int primeiraPosicaoGol = carros.indexOf("Gol"); 
		System.out.println(primeiraPosicaoGol);
		
		//retorna o indice da última ocorrencia do elemento
		int ultimaPosicaoGol = carros.lastIndexOf("Gol");
		System.out.println(ultimaPosicaoGol);
		
		//retorna -1 quando elemento nao existe
		int ultimaPosicaoCorolla = carros.indexOf("Corolla");
		System.out.println(ultimaPosicaoCorolla);
		
		//retorna o tamanho do array
		for (int i = 0; i < carros.size(); i++) {
			//retorna o elemento do indice solicitada
			System.out.println(carros.get(i));
		}
		
		//remove o elemento do indice informado
		carros.remove(0);
		carros.remove(1);
		
		System.out.println("Após a remoção: ");
		for (int i = 0; i < carros.size(); i++) {
			System.out.println(carros.get(i));
		}
		
		//remove todos os elementos do array
		carros.clear(); 
		
		System.out.println(carros);
		
	}
}
