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
 * Implementación de la entidad Planta.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public class NttdataPlantDaoImpl implements NttdataPlantDaoI {

	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(NttdataPlant newPlant) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.save(newPlant);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void update(NttdataPlant Plant) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.saveOrUpdate(Plant);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void delete(NttdataPlant Plant) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);
		// Mergeo de estados.
		Plant = entityManager.merge(Plant);
		// Insercción.
		session.delete(Plant);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public NttdataPlant searchById(Integer IDPlant) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda por PK.
		NttdataPlant result = session.get(NttdataPlant.class, IDPlant);

		// Cierre de sesión.
		session.close();

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataPlant> searchAll() {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda de todos los registros.
		List<NttdataPlant> list = session.createQuery("FROM NttdataPlant").list();

		// Cierre de sesión.
		session.close();

		return list;
	}

}
