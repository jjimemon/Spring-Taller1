package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPlant;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPlantDaoI;

/**
 * Proyecto Spring taller 1.
 *
 * Servicio de implementación de Plantas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Service
public class NttdataPlantManagementServiceImpl implements NttdataPlantManagementServiceI {

	@Autowired
	private NttdataPlantDaoI daoPlant;

	@Override
	@Transactional
	public void insertNewPlant(NttdataPlant newPlant) {
		// Verificación de nulidad e inexistencia.
		if (newPlant != null && newPlant.getIdPlant() == null) {

			// Insercción del nuevo planta.
			daoPlant.insert(newPlant);
		}

	}

	@Override
	@Transactional
	public void updateEdifice(NttdataPlant updatedPlant) {
		// Verificación de nulidad y existencia.
		if (updatedPlant != null && updatedPlant.getIdPlant() != null) {

			// Actualización de la planta.
			daoPlant.update(updatedPlant);
		}

	}

	@Override
	@Transactional
	public void deleteEdifice(NttdataPlant deletedPlant) {
		// Verificación de nulidad y existencia.
		if (deletedPlant != null && deletedPlant.getIdPlant() != null) {

			// Eliminación de la planta.
			daoPlant.delete(deletedPlant);
		}

	}

	@Override
	@Transactional
	public NttdataPlant searchById(Integer IDPlant) {
		// Resultado.
		NttdataPlant plant = null;

		// Verificación de nulidad.
		if (IDPlant != null) {

			// Obtención de la planta por ID.
			plant = daoPlant.searchById(IDPlant);
		}

		return plant;
	}

	@Override
	@Transactional
	public List<NttdataPlant> searchAll() {
		// Resultado.
		List<NttdataPlant> plantList = new ArrayList<NttdataPlant>();

		// Obtención de todas las plantas.
		plantList = daoPlant.searchAll();

		return plantList;
	}

}
