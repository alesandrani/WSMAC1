import java.util.Scanner;

public class Parte_C {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese tres números:");

	        long num1 = sc.nextLong();
	    	long num2 = sc.nextLong();
	    	long num3 = sc.nextLong();

	        NumerosPrimosRunnable hiloRunnable1 = new NumerosPrimosRunnable(num1);
	        NumerosPrimosRunnable hiloRunnable2 = new NumerosPrimosRunnable(num2);
	        NumerosPrimosRunnable hiloRunnable3 = new NumerosPrimosRunnable(num3);
	        
	        Thread hilo1 = new Thread(hiloRunnable1);
	        Thread hilo2 = new Thread(hiloRunnable2);
	        Thread hilo3 = new Thread(hiloRunnable3);
	        

	        hilo1.setName("Hilo 1");
	    	hilo2.setName("Hilo 2");
	    	hilo3.setName("Hilo 3"); 
	    	
	        hilo1.run();
	        hilo2.run();
	        hilo3.run();

	}

}
