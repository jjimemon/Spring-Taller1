package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.util.List;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de la entidad Edifice.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataEdificeDaoI {
	/**
	 * Inserta un edificio en BBDD.
	 * 
	 * @param newEdifice
	 */
	public void insert(NttdataEdifice newEdifice);

	/**
	 * Actualiza un edificio de BBDD.
	 * 
	 * @param edifice
	 */
	public void update(NttdataEdifice edifice);

	/**
	 * Elimina un edificio en BBDD.
	 * 
	 * @param edifice
	 */
	public void delete(NttdataEdifice edifice);

	/**
	 * Localiza un edificio por ID en BBDD.
	 * 
	 * @param edifice
	 * @return NttdataEdifice
	 */
	public NttdataEdifice searchById(final Integer IDedifice);

	/**
	 * Búsqueda de todos los edificios en BBDD.
	 * 
	 * @return List<NttdataEdifice>
	 */
	public List<NttdataEdifice> searchAll();

	public List<NttdataPersons> searchByPersonFullName(final String name, final String surname1, final String surname2,
			final NttdataEdifice edifice);

	public List<NttdataPersons> searchAllPeopleEdifice(final NttdataEdifice edifice);
}
