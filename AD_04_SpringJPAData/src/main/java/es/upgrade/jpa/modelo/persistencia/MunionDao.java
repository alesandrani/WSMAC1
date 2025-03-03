package es.upgrade.jpa.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.upgrade.jpa.modelo.entidad.Munion;
@Repository
public interface MunionDao extends JpaRepository<Munion, Integer> {
	//este objeto en el contexto de spring se llama "munionDao"
	
	public List<Munion> findByPuntosVida(int puntosVida);
	
	//aqui seria exactamente igual el nombre
	public Munion findByNombre(String nombre);
	
	public Munion findByNombreContains(String nombre);
	
	public Munion findByNombreAndTipo(String nombre,String tipo);
}
