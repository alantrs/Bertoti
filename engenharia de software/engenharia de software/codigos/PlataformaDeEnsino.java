import java.util.LinkedList;
import java.util.List;
import java.io.*;


public class PlataformaDeEnsino {
	
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<Professor> professores = new LinkedList<Professor>();
	private List<Disciplina> disciplinas = new LinkedList<Disciplina>();

	public void cadastrarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void cadastrarProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public List<Professor> getProfessor() {
		return professores;
	}
	public void cadastrarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}
}
