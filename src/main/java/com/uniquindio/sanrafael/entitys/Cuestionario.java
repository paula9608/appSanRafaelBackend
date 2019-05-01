/**
 * 
 */
package com.uniquindio.sanrafael.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author user
 *
 */
@Entity
@Table(name = "CUESTIONARIOS")
public class Cuestionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOMBRE", length = 255)
	private String nombre;
	
	@Column(name = "DESCRIPCION", length = 1000)
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Materia materia;
	/**
	 * 
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
	 * **/
}
