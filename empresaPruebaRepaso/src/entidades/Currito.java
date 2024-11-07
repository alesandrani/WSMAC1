package entidades;

public class Currito extends Empleado {
	public Currito(String nombre, String sexo, int edad, Direccion direccion, double salario) {
		super(nombre, sexo, edad, direccion, salario);
		// TODO Auto-generated constructor stub
	}
	private double jornada;
	private double horasExtra;
	public double getJornada() {
		return jornada;
	}
	public void setJornada(double jornada) {
		this.jornada = jornada;
	}
	public double getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}
	public double sueldoTotal(){
		double sueldoTotal = 0;
		sueldoTotal = getSalario() +  (getHorasExtra() * 50);
		return sueldoTotal;
		
		
	}
	@Override
	public String toString() {
		return "Currito [jornada=" + jornada + ", horasExtra=" + horasExtra + "]";
	}
}
