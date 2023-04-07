package br.com.ienh.sisescola.app;
import java.time.LocalDate;
import java.util.List;
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
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {
	public static void main(String[] args) {
		
		try {
			// AlunoDAO alunoDAO = new AlunoDAO();
			// Aluno aluno = new Aluno();
			// aluno.setNome("Julia");
			// aluno.setNumeroMatricula("2163235");
			// aluno.setCpf("98533579075");
			// aluno.setEndereco("Rua 19 de novembro, 20");
			// aluno.setNascimento(LocalDate.of(1999, 7, 30));
			// alunoDAO.insert(aluno);

			// Aluno aluno = alunoDAO.findById(14);

			// ContatoDAO contatoDAO = new ContatoDAO();
			// Contato contato = new Contato();
			// contato.setAluno(aluno);
			// contato.setDescricao("998542828");
			// contato.setTipo("telefone");
			// contatoDAO.insert(contato);

			// ProfessorDAO professorDAO = new ProfessorDAO();
			// Professor professor = new Professor();
			// professor.setNome("Joao");
			// professorDAO.insert(professor);

			// Professor professor = professorDAO.findById(4);

			// TurmaDAO turmaDAO = new TurmaDAO();
			// Turma turma = new Turma();
			// turma.setSemestre("3");
			// turma.setProfessor(professor);
			// turmaDAO.insert(turma);

			// ResponsavelDAO responsavelDAO = new ResponsavelDAO();
			// Responsavel responsavel = new Responsavel();
			// responsavel.setNome("Rita de Cassia");
			// responsavel.setEndereco("rua Coronel Travasso, 30");
			// responsavelDAO.insert(responsavel);

			// CursoDAO cursoDAO = new CursoDAO();
			// Curso curso = new Curso();
			// curso.setNome("Analise e Desenvolvimento de Sistemas");
			// curso.setCoordenador("Daniel Dalalana");
			// cursoDAO.insert(curso);

			// DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
			// Disciplina disciplina = new Disciplina();
			// disciplina.setNome("Programação III");
			// disciplina.setCodigo("789885");
			// disciplinaDAO.insert(disciplina);

			// Intermediarias

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SisEscola");
	    	EntityManager entityManager = entityManagerFactory.createEntityManager();

			// aluno_turma
			// TurmaDAO turmaDAO = new TurmaDAO();
			// Turma turma = turmaDAO.findById(2);
			
			// AlunoDAO alunoDAO = new AlunoDAO();
			// Aluno aluno = alunoDAO.findById(14);
			// aluno.getTurmas().add(turma);

			// entityManager.getTransaction().begin();
			// entityManager.merge(aluno);
			// entityManager.getTransaction().commit();

			// aluno_responsavel
			// AlunoDAO alunoDAO = new AlunoDAO();
			// Aluno aluno = alunoDAO.findById(2);
			
			// ResponsavelDAO responsavelDAO = new ResponsavelDAO();
			// Responsavel responsavel = responsavelDAO.findById(3);
			// responsavel.getAlunos().add(aluno);

			// entityManager.getTransaction().begin();
			// entityManager.merge(responsavel);
			// entityManager.getTransaction().commit();

			// disciplina_turma
			// DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
			// Disciplina disciplina = disciplinaDAO.findById(1);
			
			// TurmaDAO turmaDAO = new TurmaDAO();
			// Turma turma = turmaDAO.findById(3);
			// turma.getDisciplinas().add(disciplina);

			// entityManager.getTransaction().begin();
			// entityManager.merge(turma);
			// entityManager.getTransaction().commit();

			// curso_disciplina
			CursoDAO cursoDAO = new CursoDAO();
			Curso curso = cursoDAO.findById(1);

			DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
			Disciplina disciplina = disciplinaDAO.findById(1);
			disciplina.getCursos().add(curso);

			entityManager.getTransaction().begin();
			entityManager.merge(disciplina);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("Ops! Ocorreu um erro na conexão com o banco.");
			e.printStackTrace();

		}

	}
}
