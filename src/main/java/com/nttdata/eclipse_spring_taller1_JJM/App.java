package com.nttdata.eclipse_spring_taller1_JJM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataEdifice;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPersons;
import com.nttdata.eclipse_spring_taller1_JJM.persistence.NttdataPlant;
import com.nttdata.eclipse_spring_taller1_JJM.services.NttdataEdificeManagementServiceI;
import com.nttdata.eclipse_spring_taller1_JJM.services.NttdataPersonsManagementServiceI;
import com.nttdata.eclipse_spring_taller1_JJM.services.NttdataPlantManagementServiceI;

/**
 * Proyecto Spring taller 1.
 *
 * Clase Main de la app.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {
	/*
	 * Servicio de gestion de personas
	 */
	@Autowired
	private NttdataPersonsManagementServiceI personService;
	@Autowired
	private NttdataEdificeManagementServiceI edificeService;
	@Autowired
	private NttdataPlantManagementServiceI plantService;

	/**
	 * Método main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creacion de nuevos edificios.
		NttdataEdifice edifice1 = new NttdataEdifice();
		edifice1.setName("Edificio la cartuja");

		// Creacion de nuevas personas.
		NttdataPersons persona1 = new NttdataPersons();
		persona1.setDNI("20061899B");
		persona1.setName("Javier");
		persona1.setSurname1("Jimenez");
		persona1.setSurname2("Montesino");
		persona1.setEdifice(edifice1);

		NttdataPersons persona2 = new NttdataPersons();
		persona2.setDNI("20021829B");
		persona2.setName("Manuel");
		persona2.setSurname1("Benitez");
		persona2.setSurname2("Loco");
		persona2.setEdifice(edifice1);

		// Creacion de nuevas plantas.
		NttdataPlant plant1 = new NttdataPlant();
		plant1.setNumPlant(1);
		plant1.setEdifice(edifice1);

		NttdataPlant plant2 = new NttdataPlant();
		plant2.setNumPlant(2);
		plant2.setEdifice(edifice1);

		// utilización de servicios.

		edificeService.insertNewEdifice(edifice1);
		personService.insertNewPerson(persona1);
		personService.insertNewPerson(persona2);
		plantService.insertNewPlant(plant1);
		plantService.insertNewPlant(plant2);

		// Busca una persona en concreta y la devuelve
		System.out.println(personService.searchByNameAndSurname1AndSurname2("Javier", "Jimenez", "Montesino"));

	}
}
