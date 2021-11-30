package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Proyecto Spring taller 1.
 *
 * Clase de la entidad Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Entity
@Table(name = "PERSONS")
public class NttdataPersons implements Serializable {

	/**
	 * Version
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * ID de la persona [PK].
	 */
	private Integer idPersons;
	/*
	 * Dni de la persona [Unique].
	 */
	private String DNI;
	/*
	 * Nombre de la persona.
	 */
	private String name;
	/*
	 * Primer apellido de la persona.
	 */
	private String surname1;
	/*
	 * Segundo apellido de la persona.
	 */
	private String surname2;

	/*
	 * Edificio al que pertenece
	 */
	private NttdataEdifice edifice;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPersons() {
		return idPersons;
	}

	public void setIdPersons(Integer idPersons) {
		this.idPersons = idPersons;
	}

	@Column(name = "DNI", nullable = false, unique = true)
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SURNAME1", nullable = false)
	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}

	@Column(name = "SURNAME2", nullable = false)
	public String getSurname2() {
		return surname2;
	}

	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_Edifice")
	public NttdataEdifice getEdifice() {
		return edifice;
	}

	public void setEdifice(NttdataEdifice pEdifice) {
		edifice = pEdifice;
	}

	@Override
	public String toString() {
		return "NttdataPersons [idPersons=" + idPersons + ", DNI=" + DNI + ", name=" + name + ", surname1=" + surname1
				+ ", surname2=" + surname2 + ", edifice=" + edifice + "]";
	}

}
