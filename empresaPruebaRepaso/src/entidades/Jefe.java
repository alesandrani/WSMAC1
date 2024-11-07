package entidades;

import java.util.List;

public class Jefe extends Empleado{
	private int numeroEmpleados;
	private String despacho;
	private List<Empleado> listaEmpleados;
	
	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public double sueldoTotal() {
		double bono= 0;
		for (Empleado e : listaEmpleados)
			bono = bono + e.getSalario()  * 0.10;
		double salarioTotal = 0;
		salarioTotal = bono + this.getSalario();
		return salarioTotal;
	}
	@Override
	public String toString() {
		return "Jefe [numeroEmpleados=" + numeroEmpleados + ", despacho=" + despacho + ", listaEmpleados="
				+ listaEmpleados + "]";
	}
	public void agregarCurrito(Currito currito) {
        listaEmpleados.add(currito);
    }
	public Jefe(String nombre, String sexo, int edad, Direccion direccion, double salario, int numeroEmpleados,
			String despacho, List<Empleado> listaEmpleados) {
		super(nombre, sexo, edad, direccion, salario);
		this.numeroEmpleados = numeroEmpleados;
		this.despacho = despacho;
		this.listaEmpleados = listaEmpleados;
	}
	
}
