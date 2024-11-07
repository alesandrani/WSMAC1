package funciones_lambda;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainEjercicio {
	public static void main(String[] args) {
		
	Operable numeroElevado =(base,exponente) -> {
		double resultado = Math.pow(base, exponente);
		return resultado;
	};
	System.out.println(numeroElevado.operar(3,3));
	
	Operable raizCuadrada = (numero,numero2) -> {
		double resultado = Math.sqrt(numero);
		return resultado;
	};
	System.out.println(raizCuadrada.operar(4, 0));
	
	Imprimible imprimirPantalla= (cadena1) -> {
		System.out.println("Hola " + cadena1);
	};
	imprimirPantalla.imprimir("Felix");
	
	Imprimible imprimirFichero = (cadena1) -> {
		//Este método arroja Excepciones que DEBEMOS controlar
		//Con esta clase vamos a poder escribir en un fichero
		//de texto cadenas
		try {
			PrintWriter pw = new PrintWriter("fichero.txt");
			//El objeto tiene un método que nos permite escribir
			//en el fichero, que se llama igual que el método
			//de la clase "System.out"
			pw.println(cadena1);//LLenamos el buffer con la información
			pw.flush();//Pasamos la información del buffer al fichero
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	imprimirFichero.imprimir("fichero");
	
	Imprimible imprimirImpresora =(cadena1)->{
		String IP = "192.168.56.13";//Supongamos que la impresora esta aquí
		//Simulamos la impresion por impresora
		System.out.println("Imprimiendo por la impresora: " + cadena1);
	};
	imprimirImpresora.imprimir("Hola Mundo");
	
	Funcionable devolverCadena = (cadena1) -> {
		System.out.println("Hola" + cadena1);
	};
	devolverCadena.funcion("Mundo");
	
	Funcionable quitarEspacio = (cadena1) ->{
		System.out.println("o quita los espacios de aqui?" + cadena1.trim());
	};
	quitarEspacio.funcion("    tiene que quitar los espacios          ");
}
}