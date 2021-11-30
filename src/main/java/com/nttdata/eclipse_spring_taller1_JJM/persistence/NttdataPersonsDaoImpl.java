package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Proyecto Spring taller 1.
 *
 * Implementación de la entidad Personas.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public class NttdataPersonsDaoImpl implements NttdataPersonsDaoI {

	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(NttdataPersons newPerson) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.save(newPerson);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void update(NttdataPersons persons) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.saveOrUpdate(persons);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void delete(NttdataPersons persons) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);
		// Mergeo de estados.
		persons = entityManager.merge(persons);
		// Insercción.
		session.delete(persons);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public NttdataPersons searchById(Integer IDpersons) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda por PK.
		NttdataPersons result = session.get(NttdataPersons.class, IDpersons);

		// Cierre de sesión.
		session.close();

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataPersons> searchAll() {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda de todos los registros.
		List<NttdataPersons> list = session.createQuery("FROM NttdataPersons").list();

		// Cierre de sesión.
		session.close();

		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NttdataPersons> searchByPersonFullName(String name, String surname1, String surname2) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Localiza cliente por nombre completo.
		final List<NttdataPersons> personList = session.createQuery("FROM EverisCustomer WHERE name='" + name
				+ "' AND surname1='" + surname1 + "' AND surname2='" + surname2 + "'").list();

		return personList;
	}

}
