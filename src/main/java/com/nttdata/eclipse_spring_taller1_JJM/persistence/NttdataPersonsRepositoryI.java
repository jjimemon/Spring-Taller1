package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de la entidad Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public interface NttdataPersonsRepositoryI extends JpaRepository<NttdataPersons, Integer> {

	public List<NttdataPersons> searchByNameAndSurname1AndSurname2(final String name, final String surname1,
			final String surname2);
}
