package modelo.entidad;

public class PlacaBase {
	private String modelo;
	private  String marca;
    private int slots_ram;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getSlots_ram() {
		return slots_ram;
	}
	public void setSlots_ram(int slots_ram) {
		this.slots_ram = slots_ram;
	}
	@Override
	public String toString() {
		return "PlacaBase [modelo=" + modelo + ", marca=" + marca + ", slots_ram=" + slots_ram + "]";
	}
    
}
