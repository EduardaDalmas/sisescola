package br.com.ienh.sisescola.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="turma")
public class Turma {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String semestre;
	@ManyToOne(cascade=(CascadeType.ALL))
	@JoinColumn(name="professor_id")
	private Professor professor;
	@ManyToMany
	@JoinTable(name="aluno_turma", 
			   joinColumns = @JoinColumn(name="turma_id"), 
			   inverseJoinColumns = @JoinColumn(name="aluno_id"))

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
		
	private List<Aluno> alunos;
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Turma() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}
