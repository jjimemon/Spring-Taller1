package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.List;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de servicio de Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataPersonsManagementServiceI {

	/**
	 * Inserta una nueva persona.
	 * 
	 * @param newPerson
	 */
	public void insertNewPerson(final NttdataPersons newPerson);

	/**
	 * Actualiza una persona existente.
	 * 
	 * @param updatedperson
	 */
	public void updatePerson(final NttdataPersons updatedperson);

	/**
	 * Elimina una persona existente.
	 * 
	 * @param deletedPerson
	 */
	public void deletePerson(final NttdataPersons deletedPerson);

	/**
	 * Obtiene una persona mediante su ID.
	 * 
	 * @param IDPerson
	 */
	public NttdataPersons searchById(final Integer IDPerson);

	/**
	 * Obtiene una persona por su nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> searchByFullName(final String name, final String surname1, final String surname2);

	/**
	 * Obtiene todas las personas existentes.
	 * 
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> searchAll();

}
