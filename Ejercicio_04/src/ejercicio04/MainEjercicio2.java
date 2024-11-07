package ejercicio04;

public class MainEjercicio2 {

	public static void main(String[] args) {
		String cadena = concatenarPalabra("hola", "Mundo");
		System.out.println(cadena);
		
		String cadena2;
		try {
			cadena2 = concatenarPalabra("hola", null);
		} catch (RuntimeException e) {
			
			e.printStackTrace();
		}
		System.out.println("fin de programa");

	}
	public static String concatenarPalabra(String s,String s1) throws RuntimeException{
		if(s == null || s1 == null) {
			throw new RuntimeException("Alguno de los parametros es nulo");
		}
		String cadena = s.concat(s1);
		return cadena;
	}
}

