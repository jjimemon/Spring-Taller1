package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.List;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPlant;

public interface NttdataPlantManagementServiceI {

	/**
	 * Inserta una nueva planta.
	 * 
	 * @param newPlant
	 */
	public void insertNewPlant(final NttdataPlant newPlant);

	/**
	 * Actualiza una planta.
	 * 
	 * @param updatedPlant
	 */
	public void updateEdifice(final NttdataPlant updatedPlant);

	/**
	 * Elimina una planta existente.
	 * 
	 * @param deletedPlant
	 */
	public void deleteEdifice(final NttdataPlant deletedPlant);

	/**
	 * Obtiene una planta mediante su ID.
	 * 
	 * @param IDPlant
	 */
	public NttdataPlant searchById(final Integer IDPlant);

	/**
	 * Obtiene todas las plantas existentes.
	 * 
	 * @return List<NttdataPlant>
	 */
	public List<NttdataPlant> searchAll();
}
