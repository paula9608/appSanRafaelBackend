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

@Entity
@Table(name = "TALLERES")
public class Taller implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TITULO", length = 255)
	private String titulo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "grado")
	private GradoEnum grado;
	
	
	@Column(name = "DESCRIPCION", length = 1000)
	private String descripcion;
	
	@ManyToOne(optional = false, targetEntity = Materia.class)
	@JoinColumn(name = "materia_id")
	private Materia materia;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	/**
	 * @return the curso
	 */
	public GradoEnum getGrado() {
		return grado;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setGrado(GradoEnum grado) {
		this.grado = grado;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
