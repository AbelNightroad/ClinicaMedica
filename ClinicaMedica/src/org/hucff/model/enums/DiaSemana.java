package org.hucff.model.enums;

public enum DiaSemana {
	SEG("Segunda"), TER("Terça"), QUA("Quarta"), QUI("Quinta"), SEX("Sexta"),
	SAB1("Sábado 1"), SAB2("Sábado 2"), DOM1("Domingo 1"), DOM2("Domingo 2");

	private String nome;

	DiaSemana(String n) {
		nome = n;
	}

	public String getDia() {
		return nome;
	}
}
