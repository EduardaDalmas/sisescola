package br.com.ienh.sisescola.dao;

import br.com.ienh.sisescola.entidades.Professor;

public class ProfessorDAO extends DAOGenerics<Professor, Integer>  {
    
    public ProfessorDAO() throws Exception {
		super(Professor.class);
	}

}
