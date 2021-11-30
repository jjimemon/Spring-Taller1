package com.nttdata.eclipse_spring_taller1_JJM.persistence;

import java.util.List;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de la entidad planta.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataPlantDaoI {
	/**
	 * Inserta una nueva planta en BBDD.
	 * 
	 * @param newPlant
	 */
	public void insert(NttdataPlant newPlant);

	/**
	 * Actualiza una planta de BBDD.
	 * 
	 * @param Plant
	 */
	public void update(NttdataPlant Plant);

	/**
	 * Elimina una planta en BBDD.
	 * 
	 * @param Plant
	 */
	public void delete(NttdataPlant Plant);

	/**
	 * Localiza una planta por ID en BBDD.
	 * 
	 * @param IDPlant
	 * @return NttdataPlant
	 */
	public NttdataPlant searchById(final Integer IDPlant);

	/**
	 * Búsqueda de todas las plantas en BBDD.
	 * 
	 * @return List<NttdataPlant>
	 */
	public List<NttdataPlant> searchAll();

}
