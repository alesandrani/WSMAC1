
public class NumerosPrimosRunnable implements Runnable{
	private long number;
	
	public NumerosPrimosRunnable(long number) {
		super();
		this.number = number;
	}
	 private boolean esPrimo(long num) {
	        if (num <= 1) return false;
	        if (num == 2) return true;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
        boolean esPrimo = esPrimo(number);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Número: " + number +  " Es primo : " + esPrimo + " Tiempo de procesamiento" +
        elapsedTime + " ms");
		
	}

}
