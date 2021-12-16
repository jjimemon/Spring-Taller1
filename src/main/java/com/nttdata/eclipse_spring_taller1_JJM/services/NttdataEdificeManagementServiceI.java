package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.List;

import org.springframework.stereotype.Repository;

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
@Repository
public interface NttdataEdificeManagementServiceI {

	/**
	 * Inserta un nuevo edificio.
	 * 
	 * @param newEdifice
	 */
	public void insertNewEdifice(final NttdataEdifice newEdifice);

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
	public NttdataEdifice findByIdEdifice(final Integer IDEdifice);

	/**
	 * Obtiene todos los edificios existentes.
	 * 
	 * @return List<NttdataEdifice>
	 */
	public List<NttdataEdifice> findAll();

	public List<NttdataPersons> searchAllPeopleEdifice(final NttdataEdifice edifice);
}
