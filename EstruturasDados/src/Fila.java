import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//adicionando elementos na fila
		fila.add("Pessoa 1");
		fila.add("Pessoa 2");
		fila.add("Pessoa 3");
		fila.add("Pessoa 4");
		fila.add("Pessoa 5");
		
		System.out.println(fila);
		
		//removendo elemento da fila
		System.out.println("Elemento removido: " + fila.remove());
		
		System.out.println(fila);
		
		//verificar primeiro elemento da fila sem remover
		System.out.println("Elemento verificado: " + fila.peek());
		
		System.out.println(fila);
		
		//procurar elemento na fila
		System.out.println(fila.contains("Pessoa 7"));
		
		//retornar tamanho da fila
		System.out.println("Tamanho: " + fila.size());
		
		//remove todos os elementos
		//fila.clear();
		
		//System.out.println(fila);
		
		//System.out.println("Limpeza da fila feita com sucesso.");
		
		//verificar se a fila est? vazia ou n?o
		System.out.println("Fila est? vazia? " + fila.isEmpty());
		
	
	}
}
