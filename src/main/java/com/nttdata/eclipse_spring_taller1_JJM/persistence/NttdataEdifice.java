package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Proyecto Spring taller 1.
 *
 * Clase de la entidad edificio.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Entity
@Table(name = "EDIFICE")
public class NttdataEdifice implements Serializable {

	/**
	 * Version
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * ID del edificio [PK].
	 */
	private Integer idEdifice;
	/*
	 * Nombre del edificio.
	 */

	private String name;

	/*
	 * Lista de plantas del edificio.
	 */
	private List<NttdataPlant> plantList;

	/*
	 * Lista de personas del edificio.
	 */
	private List<NttdataPersons> personList;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdEdifice() {
		return idEdifice;
	}

	public void setIdEdifice(Integer idEdifice) {
		this.idEdifice = idEdifice;
	}

	@Column(name = "NOMBRE", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "edifice")
	public List<NttdataPlant> getPlantList() {
		return plantList;
	}

	public void setPlantList(List<NttdataPlant> plantList) {
		this.plantList = plantList;
	}

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "edifice")
	public List<NttdataPersons> getPersonList() {
		return personList;
	}

	public void setPersonList(List<NttdataPersons> personList) {
		this.personList = personList;
	}

	@Override
	public String toString() {
		return "NttdataEdifice [idEdifice=" + idEdifice + ", name=" + name + "]";
	}

}
