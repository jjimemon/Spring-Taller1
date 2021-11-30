package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.util.List;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de la entidad Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataPersonsDaoI {

	/**
	 * Inserta una persona en BBDD.
	 * 
	 * @param newPerson
	 */
	public void insert(NttdataPersons newPerson);

	/**
	 * Actualiza una persona de BBDD.
	 * 
	 * @param persons
	 */
	public void update(NttdataPersons persons);

	/**
	 * Elimina una persona en BBDD.
	 * 
	 * @param persons
	 */
	public void delete(NttdataPersons persons);

	/**
	 * Localiza una persona por ID en BBDD.
	 * 
	 * @param IDpersons
	 * @return NttdataPersons
	 */
	public NttdataPersons searchById(final Integer IDpersons);

	/**
	 * Búsqueda de todas las personas en BBDD.
	 * 
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> searchAll();

	/**
	 * Obtiene una persona por nombre completo.
	 * 
	 * @param name, surname1, surname2
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> searchByPersonFullName(final String name, final String surname1, final String surname2);

}
