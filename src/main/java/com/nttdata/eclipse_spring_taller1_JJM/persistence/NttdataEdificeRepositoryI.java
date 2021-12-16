package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de la entidad Edifice.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public interface NttdataEdificeRepositoryI extends JpaRepository<NttdataEdifice, Integer> {

	public NttdataEdifice findByIdEdifice(final Integer IDEdifice);

}
