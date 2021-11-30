package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataEdifice;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataEdificeDaoI;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;

/**
 * Proyecto Spring taller 1.
 *
 * Servicio de implementación de Edificios.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Service
public class NttdataEdificeManagementServiceImpl implements NttdataEdificeManagementServiceI {

	@Autowired
	private NttdataEdificeDaoI daoEdifice;

	@Override
	@Transactional
	public void insertNewEdifice(NttdataEdifice newEdifice) {
		// Verificación de nulidad e inexistencia.
		if (newEdifice != null && newEdifice.getIdEdifice() == null) {

			// Insercción del nuevo edificio.
			daoEdifice.insert(newEdifice);
		}

	}

	@Override
	@Transactional
	public void updateEdifice(NttdataEdifice updatedEdifice) {
		// Verificación de nulidad y existencia.
		if (updatedEdifice != null && updatedEdifice.getIdEdifice() != null) {

			// Actualización del nuevo edificio.
			daoEdifice.update(updatedEdifice);
		}

	}

	@Override
	@Transactional
	public void deleteEdifice(NttdataEdifice deletedEdifice) {
		// Verificación de nulidad y existencia.
		if (deletedEdifice != null && deletedEdifice.getIdEdifice() != null) {

			// Eliminación del nuevo edificio.
			daoEdifice.delete(deletedEdifice);
		}
	}

	@Override
	@Transactional
	public NttdataEdifice searchById(Integer IDEdifice) {
		// Resultado.
		NttdataEdifice edifice = null;

		// Verificación de nulidad.
		if (IDEdifice != null) {

			// Obtención del edificio por ID.
			edifice = daoEdifice.searchById(IDEdifice);
		}

		return edifice;
	}

	@Override
	@Transactional
	public List<NttdataEdifice> searchAll() {
		// Resultado.
		List<NttdataEdifice> edificeList = new ArrayList<NttdataEdifice>();

		// Obtención del edificio.
		edificeList = daoEdifice.searchAll();

		return edificeList;
	}

	@Override
	public List<NttdataPersons> searchByFullName(String name, String surname1, String surname2,
			NttdataEdifice edifice) {
		// Resultado.
		List<NttdataPersons> personsList = new ArrayList<NttdataPersons>();

		// Verificación de nulidad.
		if (StringUtils.hasText(name) && StringUtils.hasText(surname1) && StringUtils.hasText(surname2)) {

			// Obtención de la persona por nombre completo.
			personsList = daoEdifice.searchByPersonFullName(name, surname1, surname2, edifice);
		}

		return personsList;
	}

	@Override
	public List<NttdataPersons> searchAllPeopleEdifice(NttdataEdifice edifice) {
		// Resultado.
		List<NttdataPersons> personsList = new ArrayList<NttdataPersons>();

		// Obtención de las personas del edificio en concreto.
		personsList = daoEdifice.searchAllPeopleEdifice(edifice);

		return personsList;
	}

}
