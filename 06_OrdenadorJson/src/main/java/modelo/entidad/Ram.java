package modelo.entidad;

public class Ram {
	private int id;
    private String marca;
    private String tipo;
    private String capacidad;
    private int hz;
    private int cl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public int getHz() {
		return hz;
	}
	public void setHz(int hz) {
		this.hz = hz;
	}
	public int getCl() {
		return cl;
	}
	public void setCl(int cl) {
		this.cl = cl;
	}
	@Override
	public String toString() {
		return "Ram [id=" + id + ", marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", hz=" + hz
				+ ", cl=" + cl + "]";
	}
    
    
}
