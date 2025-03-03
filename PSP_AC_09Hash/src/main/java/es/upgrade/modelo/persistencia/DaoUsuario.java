package es.upgrade.modelo.persistencia;

import java.util.List;

import es.upgrade.modelo.entidad.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DaoUsuario {

	private static DaoUsuario instance;
	private EntityManagerFactory emf;
	private EntityManager em;

	private DaoUsuario() {
		
		emf = Persistence.createEntityManagerFactory("JPAUser");
		em = emf.createEntityManager();
	}
	
	public static synchronized DaoUsuario getInstance() {
		if(instance == null) {
			instance = new DaoUsuario();
		}
		return instance;
	}
	
	public void savePersona(Persona p) {
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public Persona findByName(String name) {
		// Para obtener una persona, como no vamos a modificar la tabla no hace 
		// falta abrir un entorno de transaccionalidad
		// Estamos creando una consulta mediante JPQL p en minuscula es el alias
		// para referirse a la persona
		List<Persona> lista = em.createQuery("SELECT p FROM Persona p WHERE p.nombre = :nombre", Persona.class)
				.setParameter("nombre", name)
				.getResultList();
		if(lista.size() == 0) {
			return null;
		}else {
			return lista.get(0);
		}
	}
	public void close() {
		em.close();
		emf.close();
	}
}