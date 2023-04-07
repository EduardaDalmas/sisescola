package br.com.ienh.sisescola.app;

import java.time.LocalDate;
// import java.util.List;

import br.com.ienh.sisescola.dao.AlunoDAO;
import br.com.ienh.sisescola.dao.ContatoDAO;
import br.com.ienh.sisescola.dao.CursoDAO;
import br.com.ienh.sisescola.dao.DisciplinaDAO;
import br.com.ienh.sisescola.dao.ProfessorDAO;
import br.com.ienh.sisescola.dao.ResponsavelDAO;
import br.com.ienh.sisescola.dao.TurmaDAO;
import br.com.ienh.sisescola.entidades.Aluno;
import br.com.ienh.sisescola.entidades.Contato;
import br.com.ienh.sisescola.entidades.Curso;
import br.com.ienh.sisescola.entidades.Disciplina;
import br.com.ienh.sisescola.entidades.Professor;
import br.com.ienh.sisescola.entidades.Responsavel;
import br.com.ienh.sisescola.entidades.Turma;
// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.Persistence;
// import jakarta.persistence.Query;

public class App {
	public static void main(String[] args) {
		
		try {
			// AlunoDAO alunoDAO = new AlunoDAO();
			// Aluno aluno = new Aluno();
			// aluno.setNome("Eduarda");
			// aluno.setNumeroMatricula("2162735");
			// aluno.setCpf("04198579075");
			// aluno.setEndereco("Rua Amantino Petefi, 45");
			// aluno.setNascimento(LocalDate.of(2001, 5, 14));
			// alunoDAO.insert(aluno);

			// Aluno aluno = alunoDAO.findById(1);

			// ContatoDAO contatoDAO = new ContatoDAO();
			// Contato contato = new Contato();
			// contato.setAluno(aluno);
			// contato.setDescricao("999002828");
			// contato.setTipo("telefone");
			// contatoDAO.insert(contato);

			//ProfessorDAO professorDAO = new ProfessorDAO();
			// Professor professor = new Professor();
			// professor.setNome("Joao");
			// professorDAO.insert(professor);

			// Professor professor = professorDAO.findById(1);

			// TurmaDAO turmaDAO = new TurmaDAO();
			// Turma turma = new Turma();
			// turma.setSemestre("2");
			// turma.setProfessor(professor);
			// turmaDAO.insert(turma);

			// ResponsavelDAO responsavelDAO = new ResponsavelDAO();
			// Responsavel responsavel = new Responsavel();
			// responsavel.setNome("Maria de Lurdes");
			// responsavel.setEndereco("rua dos Andradas, 730");
			// responsavelDAO.insert(responsavel);

			// CursoDAO cursoDAO = new CursoDAO();
			// Curso curso = new Curso();
			// curso.setNome("Analise e Desenvolvimento de Sistemas");
			// curso.setCoordenador("Daniel Dalalana");
			// cursoDAO.insert(curso);

			DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
			Disciplina disciplina = new Disciplina();
			disciplina.setNome("Programação I");
			disciplina.setCodigo("789585");
			disciplinaDAO.insert(disciplina);
			
		} catch (Exception e) {
			System.out.println("Ops! Ocorreu um erro na conexão com o banco.");
			e.printStackTrace();

		}

	}
}
