package com.nttdata.eclipse_spring_taller1_JJM.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersonsRepositoryI;

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
	private NttdataPersonsRepositoryI daoPerson;

	@Override
	@Transactional
	public void insertNewPerson(NttdataPersons newPerson) {
		// Verificación de nulidad e inexistencia.
		if (newPerson != null && newPerson.getIdPersons() == null) {

			// Insercción de una nueva persona.
			daoPerson.save(newPerson);
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
	public Optional<NttdataPersons> findById(Integer IDPerson) {
		// Resultado.
		Optional<NttdataPersons> person = null;

		// Verificación de nulidad.
		if (IDPerson != null) {

			// Obtención de la persona por ID.
			person = daoPerson.findById(IDPerson);
		}

		return person;
	}

	@Override
	@Transactional
	public List<NttdataPersons> findAll() {
		// Resultado.
		List<NttdataPersons> personsList = new ArrayList<NttdataPersons>();

		// Obtención de personas.
		personsList = daoPerson.findAll();

		return personsList;
	}

	@Override
	public List<NttdataPersons> searchByNameAndSurname1AndSurname2(String name, String surname1, String surname2) {
		// Resultado.
		List<NttdataPersons> personsList = new ArrayList<NttdataPersons>();

		// Verificación de nulidad.
		if (StringUtils.hasText(name) && StringUtils.hasText(surname1) && StringUtils.hasText(surname2)) {

			// Obtención de la persona por nombre completo.
			personsList = daoPerson.searchByNameAndSurname1AndSurname2(name, surname1, surname2);
		}

		return personsList;
	}

}
