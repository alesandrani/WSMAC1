
public class MostrarString implements Runnable{
	private String texto;
	private long number;
	
	public MostrarString(String texto, long number) {
		super();
		this.texto = texto;
		this.number = number;
	}

	@Override
	public void run() {
		  long startTime = System.currentTimeMillis();
	        for (int i = 0; i < number; i++) {
	            System.out.println(texto);
	        }
	        long endTime = System.currentTimeMillis();
	        long elapsedTime = endTime - startTime;

	        System.out.println("Texto repetido " + number + " veces en " + elapsedTime + "ms.");
		
	}

}
