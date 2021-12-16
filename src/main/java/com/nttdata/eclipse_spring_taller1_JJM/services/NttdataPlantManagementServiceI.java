package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPlant;

@Repository
public interface NttdataPlantManagementServiceI {

	/**
	 * Inserta una nueva planta.
	 * 
	 * @param newPlant
	 */
	public void insertNewPlant(final NttdataPlant newPlant);

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
	public Optional<NttdataPlant> findById(final Integer IDPlant);

	/**
	 * Obtiene todas las plantas existentes.
	 * 
	 * @return List<NttdataPlant>
	 */
	public List<NttdataPlant> findAll();
}
