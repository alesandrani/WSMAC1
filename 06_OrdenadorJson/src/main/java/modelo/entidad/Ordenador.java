package modelo.entidad;

import java.util.List;

public class Ordenador {
	private String nombre;
    private double precio;
    private  Procesador procesador;
    private  PlacaBase placa_base;
    private List<Ram> rams;
    private DiscoDuro disco_duro;
    private	FuenteAlimentacion fuente_alimentacion;
    private TarjetaGrafica tarjeta_grafica;
    private  List<Periferico> perifericos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public PlacaBase getPlaca_base() {
		return placa_base;
	}
	public void setPlaca_base(PlacaBase placa_base) {
		this.placa_base = placa_base;
	}
	public List<Ram> getRams() {
		return rams;
	}
	public void setRams(List<Ram> rams) {
		this.rams = rams;
	}
	public DiscoDuro getDisco_duro() {
		return disco_duro;
	}
	public void setDisco_duro(DiscoDuro disco_duro) {
		this.disco_duro = disco_duro;
	}
	public FuenteAlimentacion getFuente_alimentacion() {
		return fuente_alimentacion;
	}
	public void setFuente_alimentacion(FuenteAlimentacion fuente_alimentacion) {
		this.fuente_alimentacion = fuente_alimentacion;
	}
	public TarjetaGrafica getTarjeta_grafica() {
		return tarjeta_grafica;
	}
	public void setTarjeta_grafica(TarjetaGrafica tarjeta_grafica) {
		this.tarjeta_grafica = tarjeta_grafica;
	}
	public List<Periferico> getPerifericos() {
		return perifericos;
	}
	public void setPerifericos(List<Periferico> perifericos) {
		this.perifericos = perifericos;
	}
	@Override
	public String toString() {
		return "Ordenador [nombre=" + nombre + ", precio=" + precio + ", procesador=" + procesador + ", placa_base="
				+ placa_base + ", rams=" + rams + ", disco_duro=" + disco_duro + ", fuente_alimentacion="
				+ fuente_alimentacion + ", tarjeta_grafica=" + tarjeta_grafica + ", perifericos=" + perifericos + "]";
	}
    
    
}
