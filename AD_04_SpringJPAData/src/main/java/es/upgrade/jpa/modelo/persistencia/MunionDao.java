package es.upgrade.jpa.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.upgrade.jpa.modelo.entidad.Munion;
@Repository
public interface MunionDao extends JpaRepository<Munion, Integer> {
	//este objeto en el contexto de spring se llama "munionDao"
}
