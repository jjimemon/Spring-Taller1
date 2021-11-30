package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersonsDaoI;

/**
 * Proyecto Spring taller 1.
 *
 * Servicio de implementación de Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Service
public class NttdataPersonsManagementServiceImpl implements NttdataPersonsManagementServiceI {

	@Autowired
	private NttdataPersonsDaoI daoPerson;

	@Override
	@Transactional
	public void insertNewPerson(NttdataPersons newPerson) {
		// Verificación de nulidad e inexistencia.
		if (newPerson != null && newPerson.getIdPersons() == null) {

			// Insercción de una nueva persona.
			daoPerson.insert(newPerson);
		}

	}

	@Override
	@Transactional
	public void updatePerson(NttdataPersons updatedperson) {
		// Verificación de nulidad y existencia.
		if (updatedperson != null && updatedperson.getIdPersons() != null) {

			// Actualización de la persona.
			daoPerson.update(updatedperson);
		}

	}

	@Override
	@Transactional
	public void deletePerson(NttdataPersons deletedPerson) {
		// Verificación de nulidad y existencia.
		if (deletedPerson != null && deletedPerson.getIdPersons() != null) {

			// Eliminación de la persona.
			daoPerson.delete(deletedPerson);
		}

	}

	@Override
	@Transactional
	public NttdataPersons searchById(Integer IDPerson) {
		// Resultado.
		NttdataPersons person = null;

		// Verificación de nulidad.
		if (IDPerson != null) {

			// Obtención de la persona por ID.
			person = daoPerson.searchById(IDPerson);
		}

		return person;
	}

	@Override
	@Transactional
	public List<NttdataPersons> searchByFullName(String name, String surname1, String surname2) {
		// Resultado.
		List<NttdataPersons> personsList = new ArrayList<NttdataPersons>();

		// Verificación de nulidad.
		if (StringUtils.hasText(name) && StringUtils.hasText(surname1) && StringUtils.hasText(surname2)) {

			// Obtención de la persona por nombre completo.
			personsList = daoPerson.searchByPersonFullName(name, surname1, surname2);
		}

		return personsList;
	}

	@Override
	@Transactional
	public List<NttdataPersons> searchAll() {
		// Resultado.
		List<NttdataPersons> personsList = new ArrayList<NttdataPersons>();

		// Obtención de personas.
		personsList = daoPerson.searchAll();

		return personsList;
	}

}
