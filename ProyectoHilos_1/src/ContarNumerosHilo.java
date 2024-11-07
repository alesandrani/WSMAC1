
public class ContarNumerosHilo extends Thread {
	private long number;

	public ContarNumerosHilo(long number) {
		super();
		this.number = number;
	}
	
	public void run() {
		long startTime = System.currentTimeMillis();
        for (long i = number; i <= 1000000000; i++) {
        	if (i % 100000000 == 0) {
                System.out.println("Contando... " + i);
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Contado hasta 1.000.000.000 desde " + number + " en " + elapsedTime + "ms.");
	}
}
