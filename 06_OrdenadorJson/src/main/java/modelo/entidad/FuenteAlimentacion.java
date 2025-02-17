package modelo.entidad;

public class FuenteAlimentacion {
	private String marca;
	private  String modelo;
	private  int potencia;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "FuenteAlimentacion [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
	}
	
	
}
