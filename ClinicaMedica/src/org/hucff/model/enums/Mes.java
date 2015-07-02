package org.hucff.model.enums;

public enum Mes {
	JAN("Janeiro"), FEV("Fevereiro"), MAR("Março"), ABR("Abril"),
	MAI("Maio"), JUN("Junho"), JUL("Julho"), AGO("Agosto"),
	SET("Setembro"), OUT("Outubro"), NOV("Novembro"), DEZ("Dezembro");
	
	private String nome;
	
	Mes(String n) {
		nome = n;
	}
	
	public String getMes() {
		return nome;
	}
}
