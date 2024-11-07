import java.util.Scanner;

public class Parte_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese  número 1 (para la tarea 1):");
       long num1 = sc.nextLong();
        System.out.println("Ingrese número 2 (para la tarea 2):");
        long num2 = sc.nextLong();
        sc.nextLine();
        System.out.println("Ingrese un texto (para la tarea 3):");
        String text = sc.next();
        
        // Tarea 1 - Comprobación de primo usando Runnable
        Thread hilo1 = new Thread(new NumerosPrimosRunnable(num1));

        // Tarea 2 - Contando desde el segundo número hasta 1.000.000.000
        Thread hilo2 = new ContarNumerosHilo(num2);

        // Tarea 3 - Repetir texto
        long repeatCount = Math.abs(num1 - num2);
        Thread hilo3 = new Thread(new MostrarString(text, repeatCount));
        
        hilo1.setName("Hilo 1");
    	hilo2.setName("Hilo 2");
    	hilo3.setName("Hilo 3"); 
    	
        hilo1.start();
        hilo2.start();
        hilo3.start();



	}

}
