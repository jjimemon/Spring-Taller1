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
 * Implementación de la entidad Edificios.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public class NttdataEdificeDaoImpl implements NttdataEdificeDaoI {
	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(NttdataEdifice newEdifice) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.save(newEdifice);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void update(NttdataEdifice edifice) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.saveOrUpdate(edifice);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void delete(NttdataEdifice edifice) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);
		// Mergeo de estados.
		edifice = entityManager.merge(edifice);
		// Insercción.
		session.delete(edifice);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public NttdataEdifice searchById(Integer IDedifice) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda por PK.
		NttdataEdifice result = session.get(NttdataEdifice.class, IDedifice);

		// Cierre de sesión.
		session.close();

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataEdifice> searchAll() {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda de todos los registros.
		List<NttdataEdifice> list = session.createQuery("FROM NttdataEdifice").list();

		// Cierre de sesión.
		session.close();

		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataPersons> searchByPersonFullName(String name, String surname1, String surname2,
			NttdataEdifice edifice) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Localiza persona por nombre completo y edificacion a la que pertenece.
		final List<NttdataPersons> personList = session
				.createQuery("FROM NttdataPersons WHERE name='" + name + "' AND surname1='" + surname1
						+ "' AND surname2='" + surname2 + "' AND edifice.idEdifice =" + edifice.getIdEdifice())
				.list();

		return personList;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataPersons> searchAllPeopleEdifice(NttdataEdifice edifice) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Localiza persona por nombre completo y edificacion a la que pertenece.
		final List<NttdataPersons> personList = session
				.createQuery("FROM NttdataPersons WHERE edifice.idEdifice=" + edifice.getIdEdifice()).list();

		return personList;
	}

}
