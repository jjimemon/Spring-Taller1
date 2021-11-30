package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.List;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataEdifice;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de servicio de edificios.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataEdificeManagementServiceI {

	/**
	 * Inserta un nuevo edificio.
	 * 
	 * @param newEdifice
	 */
	public void insertNewEdifice(final NttdataEdifice newEdifice);

	/**
	 * Actualiza un edificio.
	 * 
	 * @param updatedEdifice
	 */
	public void updateEdifice(final NttdataEdifice updatedEdifice);

	/**
	 * Elimina un edificio existente.
	 * 
	 * @param deletedEdifice
	 */
	public void deleteEdifice(final NttdataEdifice deletedEdifice);

	/**
	 * Obtiene un edificio mediante su ID.
	 * 
	 * @param IDEdifice
	 */
	public NttdataEdifice searchById(final Integer IDEdifice);

	/**
	 * Obtiene todos los edificios existentes.
	 * 
	 * @return List<NttdataEdifice>
	 */
	public List<NttdataEdifice> searchAll();

	/**
	 * Obtiene una persona por su nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @param edifice
	 * @return List<NttdataPersons>
	 */
	public List<NttdataPersons> searchByFullName(final String name, final String surname1, final String surname2,
			final NttdataEdifice edifice);

	public List<NttdataPersons> searchAllPeopleEdifice(final NttdataEdifice edifice);
}
