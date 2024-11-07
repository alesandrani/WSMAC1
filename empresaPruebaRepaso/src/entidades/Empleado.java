package entidades;

public class Empleado {
	protected String nombre;
	private String sexo;
	private int edad;
	private Direccion direccion;
	private double salario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", direccion=" + direccion
				+ ", salario=" + salario + "]";
	}
	public Empleado(String nombre, String sexo, int edad, Direccion direccion, double salario) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.direccion = direccion;
		this.salario = salario;
	}
	
}
