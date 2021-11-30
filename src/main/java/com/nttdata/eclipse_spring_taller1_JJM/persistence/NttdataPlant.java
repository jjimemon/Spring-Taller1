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
 * Clase de la entidad planta.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Entity
@Table(name = "PLANT")
public class NttdataPlant implements Serializable {

	/**
	 * Version
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * ID de la planta.
	 */

	private Integer idPlant;

	/*
	 * Número de la planta
	 */
	private Integer numPlant;

	/*
	 * Edificio en la cual está.
	 */
	private NttdataEdifice edifice;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPlant() {
		return idPlant;
	}

	public void setIdPlant(Integer idPlant) {
		this.idPlant = idPlant;
	}

	@Column(name = "NUMBER", nullable = false)
	public Integer getNumPlant() {
		return numPlant;
	}

	public void setNumPlant(Integer numPlant) {
		this.numPlant = numPlant;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_edifice")
	public NttdataEdifice getEdifice() {
		return edifice;
	}

	public void setEdifice(NttdataEdifice edifice) {
		this.edifice = edifice;
	}

	@Override
	public String toString() {
		return "NttdataPlant [idPlant=" + idPlant + ", numPlant=" + numPlant + ", edifice=" + edifice + "]";
	}

}
