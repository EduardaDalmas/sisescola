package br.com.ienh.sisescola.app;

import java.time.LocalDate;
// import java.util.List;

import br.com.ienh.sisescola.dao.AlunoDAO;
import br.com.ienh.sisescola.dao.ContatoDAO;
import br.com.ienh.sisescola.dao.ProfessorDAO;
import br.com.ienh.sisescola.dao.TurmaDAO;
import br.com.ienh.sisescola.entidades.Aluno;
import br.com.ienh.sisescola.entidades.Contato;
import br.com.ienh.sisescola.entidades.Professor;
import br.com.ienh.sisescola.entidades.Turma;
// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.Persistence;
// import jakarta.persistence.Query;

public class App {
	public static void main(String[] args) {
		
		try {
			AlunoDAO alunoDAO = new AlunoDAO();
			Aluno aluno = new Aluno();
			aluno.setNome("Luna");
			aluno.setNumeroMatricula("2162185");
			aluno.setCpf("54789593545");
			aluno.setEndereco("Rua Osvaldo Cruz, 80");
			aluno.setNascimento(LocalDate.of(2001, 6, 28));
			alunoDAO.insert(aluno);

			ContatoDAO contatoDAO = new ContatoDAO();
			Contato contato = new Contato();
			contato.setAluno(aluno);
			contato.setDescricao("996869587");
			contato.setTipo("email");
			contatoDAO.insert(contato);

			ProfessorDAO professorDAO = new ProfessorDAO();
			Professor professor = new Professor();
			professor.setNome("Andre");
			professorDAO.insert(professor);

			TurmaDAO turmaDAO = new TurmaDAO();
			Turma turma = new Turma();
			turma.setSemestre("2");
			turma.setProfessor(professor);
			turmaDAO.insert(turma);
			
		} catch (Exception e) {
			System.out.println("Ops! Ocorreu um erro na conexão com o banco.");
			e.printStackTrace();

		}

	}
}
