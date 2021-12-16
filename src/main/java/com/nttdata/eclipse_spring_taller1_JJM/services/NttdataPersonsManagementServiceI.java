package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de servicio de Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public interface NttdataPersonsManagementServiceI {

	/**
	 * Inserta una nueva persona.
	 * 
	 * @param newPerson
	 */
	public void insertNewPerson(final NttdataPersons newPerson);

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
	public Optional<NttdataPersons> findById(final Integer IDPerson);

	/**
	 * Obtiene todas las personas existentes.
	 * 
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> findAll();

	/**
	 * Obtiene una persona por su nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @param edifice
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> searchByNameAndSurname1AndSurname2(final String name, final String surname1,
			final String surname2);

}
