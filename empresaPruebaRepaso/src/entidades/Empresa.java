package entidades;

import java.util.List;

public class Empresa {
	private String nombre;
	private String NIF;
	private Direccion direccion;
	private List<Empleado> listaEmpleado;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<Empleado> getListaEmpleado() {
		return listaEmpleado;
	}
	public void setListaEmpleado(List<Empleado> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}
	public double salarioTotalEmpleados() {
		double salarioTotal = 0;
		for(Empleado e : listaEmpleado){
			salarioTotal = salarioTotal + e.getSalario() ;
		}
		return salarioTotal;
	}
	
	public int empleadoEsJefe() {
		int contador = 0;
		for (Empleado emp : listaEmpleado) {
			if (emp instanceof Jefe) {
				contador++;
			}
		}
		return contador;

	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", NIF=" + NIF + ", direccion=" + direccion + ", listaEmpleado="
				+ listaEmpleado + "]";
	}

	public Empresa(String nombre, String nIF, Direccion direccion, List<Empleado> listaEmpleado) {
		super();
		this.nombre = nombre;
		NIF = nIF;
		this.direccion = direccion;
		this.listaEmpleado = listaEmpleado;
	}

	
}
