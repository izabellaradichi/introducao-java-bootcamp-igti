import java.util.ArrayList;

import entidades.Aluno;
import entidades.Diretor;
import entidades.Pessoa;
import entidades.Professor;

public class Controle {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Diretor> diretores = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void iniciar () {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jo?o Silva");
		aluno1.setCpf("12563240658");
		aluno1.setTelefone("(31)98988-9550");
		aluno1.setEndereco("Rua X");
		aluno1.setMatricula(123485);
		
		Aluno aluno2 = new Aluno("Maria Sousa", "05241585022", "(31)98955-5874", "Rua Y", 125478);
	
		alunos.add(aluno1);
		alunos.add(aluno2);
		
		Professor professor1 = new Professor();
		professor1.setNome("Henrique Souza");
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Antonio Pereira");
				
		pessoas.add(aluno1);
		pessoas.add(professor1);
		pessoas.add(diretor1);
	}
}
