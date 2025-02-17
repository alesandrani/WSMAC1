package modelo.entidad;

public class TarjetaGrafica {
		private  String marca;
	    private String modelo;
	    private  int cudas;
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
		public int getCudas() {
			return cudas;
		}
		public void setCudas(int cudas) {
			this.cudas = cudas;
		}
		@Override
		public String toString() {
			return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", cudas=" + cudas + "]";
		}
	    
	    
}
