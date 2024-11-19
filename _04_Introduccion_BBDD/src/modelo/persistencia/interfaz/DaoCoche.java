package modelo.persistencia.interfaz;

import java.util.List;

import modelo.entidad.Coche;

public interface DaoCoche {
	
	public boolean insertar(Coche coche);
	public boolean modificar (Coche coche);
	public Coche buscarId(String idBuscar);
	public List<Coche> buscarPorMarca(String marca);
	public boolean borrar(String idEliminar);
	public List<Coche> listar();
	
}
