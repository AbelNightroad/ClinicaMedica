package org.hucff.model;

import org.hucff.persistence.EntidadeBase;

public class Residente implements EntidadeBase{
	private Integer id;
	private String nome;
	private String telFixo;
	private String telCelular;
	private String email;
	private String cnes;
	private Plano plano;
	private String anoEntrada;
	
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
