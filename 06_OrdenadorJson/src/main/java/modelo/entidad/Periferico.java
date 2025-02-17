package modelo.entidad;

public class Periferico {
	private String tipo;
	private  String nombre;
	private String marca;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Periferico [tipo=" + tipo + ", nombre=" + nombre + ", marca=" + marca + "]";
	}
	
	
}	
