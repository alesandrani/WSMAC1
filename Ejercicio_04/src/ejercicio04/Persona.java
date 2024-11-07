package ejercicio04;

public class Persona {
	private int edad;
	private String nombre;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws EdadNoPermitidaExeption {
		this.edad = edad;
		if(edad <0) {
			throw new EdadNoPermitidaExeption("Edad no puede ser negativa");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws NombreVacioNoPermitidoRunTimeExeption, IllegalArgumentException{
		this.nombre = nombre;
		if(nombre == "") {
			throw new NombreVacioNoPermitidoRunTimeExeption("Nombre no puede ser vacio");
		}
		if(nombre == null){
			throw new  IllegalArgumentException("Variable nulas");
		}
		this.nombre = nombre;
	}
	
	
	
}
