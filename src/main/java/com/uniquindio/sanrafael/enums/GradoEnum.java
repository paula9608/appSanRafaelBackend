package com.uniquindio.sanrafael.enums;

public enum GradoEnum {
	GRADO_PREESCOLAR("preescolar"),
	GRADO_PRIMERO("primero"),
	GRADO_SEGUNDO("segundo"),
	GRADO_TERCERO("tercero"),
	GRADO_CUARTO("cuarto"),
	GRADO_QUINTO("quinto");
	
	String valor;

	private GradoEnum(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

}
