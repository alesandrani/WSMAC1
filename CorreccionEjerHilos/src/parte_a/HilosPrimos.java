package parte_a;

import java.util.Date;

public class HilosPrimos extends Thread{
	private long numeroPrimo;

	public HilosPrimos(long numeroPrimo) {
		super();
		this.numeroPrimo = numeroPrimo;
	}
	
	public void run() {
		Date date = new Date();//toma la hora del sistma con milesegundos desde 1970
		
		boolean esPrimo =false;
		for(int i = 2; i< numeroPrimo/2;i++) {
			if(numeroPrimo % i == 0) {
				esPrimo = false;
				break;
			}
		}
		Date date2 = new Date();
		long tiempoTotalProcesamiento = date2.getTime() - date.getTime();
		System.out.println("Hilo : " + Thread.currentThread().getName() + "-> el numero " + numeroPrimo + "es primo?" + esPrimo +
				 ". Tiempo total de procesamiento: " + tiempoTotalProcesamiento);
	}
	
}
