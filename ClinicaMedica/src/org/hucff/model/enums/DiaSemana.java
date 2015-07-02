package org.hucff.model.enums;

public enum DiaSemana {
	SEG("Segunda"), TER("Ter�a"), QUA("Quarta"), QUI("Quinta"), SEX("Sexta"),
	SAB1("S�bado 1"), SAB2("S�bado 2"), DOM1("Domingo 1"), DOM2("Domingo 2");

	private String nome;

	DiaSemana(String n) {
		nome = n;
	}

	public String getDia() {
		return nome;
	}
}
