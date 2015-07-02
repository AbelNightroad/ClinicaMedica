package org.hucff.model.enums;

public enum Turno {
	M("Manh�"),T("Tarde"),N("Noite");
	
	private String descricao;
	
	Turno(String d) {
		descricao = d;
	}
	
	public String getTurno() {
		return descricao;
	}
}
