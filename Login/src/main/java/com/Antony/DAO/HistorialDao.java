package com.Antony.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Antony.model.Historial;

public class HistorialDao {

	public void agregarDatosHistorial(Historial his) {
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Login");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(his);
		em.flush();
		em.getTransaction().commit(); 
	}
	
}
