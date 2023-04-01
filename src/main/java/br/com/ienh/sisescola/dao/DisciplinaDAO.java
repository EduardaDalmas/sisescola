package br.com.ienh.sisescola.dao;

import br.com.ienh.sisescola.entidades.Disciplina;

public class DisciplinaDAO extends DAOGenerics<Disciplina, Integer>  {

    public DisciplinaDAO() throws Exception {
		super(Disciplina.class);
	}
    
}
