import java.util.Scanner;

public class Parte_A {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Introduzca el numero");
	
	long num1 = sc.nextLong();
	long num2 = sc.nextLong();
	long num3 = sc.nextLong();
	
	//Creando los hilos
	NumerosPrimosHilo hilo1 = new NumerosPrimosHilo(num1);
	NumerosPrimosHilo hilo2 = new NumerosPrimosHilo(num2);
	NumerosPrimosHilo hilo3 = new NumerosPrimosHilo(num3);
	hilo1.setName("Hilo 1");
	hilo2.setName("Hilo 2");
	hilo3.setName("Hilo 3");
	
	hilo1.start();
	hilo2.start();
	hilo3.start();
	
	}

}
