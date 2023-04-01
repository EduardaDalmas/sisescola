package br.com.ienh.sisescola.dao;

import br.com.ienh.sisescola.entidades.Curso;

public class CursoDAO extends DAOGenerics<Curso, Integer> {

    public CursoDAO() throws Exception {
		super(Curso.class);
	}
}
