package com.Antony.DAO;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Object> hitorial(){
		List<Object> HISTO = new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Login");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			HISTO = em.createQuery("SELECT his.idHistorial, his.loginusuario.idUsuarios,his.fecha,"
					+ "usu.nombreUsuario,usu.apellidoUsuario"
					+ " FROM Historial AS his INNER JOIN Loginusuario AS usu ON usu.idUsuarios = his.loginusuario.idUsuarios").getResultList();
			
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
		 System.out.println(e+"Error");
		}
		
		return HISTO;
		
	}
	
}
