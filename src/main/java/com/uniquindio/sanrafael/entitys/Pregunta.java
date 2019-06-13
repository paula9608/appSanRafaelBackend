package com.uniquindio.sanrafael.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.uniquindio.sanrafael.enums.GradoEnum;
import com.uniquindio.sanrafael.enums.TipoEnum;

@Entity
@Table(name = "PREGUNTAS")
public class Pregunta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 255)
	private String nombre;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	private TipoEnum tipo;
	 
	
	@Column(name = "premio", length = 255)
	private Boolean premio;

	
	
	@ManyToOne(optional = false, targetEntity = Taller.class)
	@JoinColumn(name = "taller_id")
	private Taller taller;
	

	/**
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the tipo
	 */
	public TipoEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the premio
	 */
	public Boolean getPremio() {
		return premio;
	}

	/**
	 * @param premio the premio to set
	 */
	public void setPremio(Boolean premio) {
		this.premio = premio;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the taller
	 */
	public Taller getTaller() {
		return taller;
	}

	/**
	 * @param taller the taller to set
	 */
	public void setTaller(Taller taller) {
		this.taller = taller;
	}
	
	

}
