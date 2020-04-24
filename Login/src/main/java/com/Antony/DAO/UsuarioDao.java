package com.Antony.DAO;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Antony.model.Loginusuario;

public class UsuarioDao {
	public List<Loginusuario> ingresoUsuario(Loginusuario usu){
		List<Loginusuario> usuarios = new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Login");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			usuarios = em.createQuery("from Loginusuario as u where u.usuario = '"+usu.getUsuario()+"'and u.contrasena='"+usu.getContrasena()+"'").getResultList();
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
		 System.out.println(e+"Error");
		}
		
		return usuarios;
	}

}
