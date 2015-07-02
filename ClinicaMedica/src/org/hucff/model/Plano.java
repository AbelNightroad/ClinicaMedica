package org.hucff.model;

import java.util.List;
import java.util.Map;

import org.hucff.model.enums.Mes;
import org.hucff.persistence.EntidadeBase;

public class Plano implements EntidadeBase{
	private Integer id;
	private String nome;
	private List<Dia> ambulatorio;
	private Dia plantão;
	private List<Dia> repouso;
	private Map<Mes, Local> agenda;
	
	@Override
	public Integer getId() {
		return id;
	}
	
}
