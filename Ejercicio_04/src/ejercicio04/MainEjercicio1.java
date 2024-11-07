package ejercicio04;

public class MainEjercicio1 {

	public static void main(String[] args) {
		try {
			String cadena = concatenarPalabra("Hola", "Mundo");
			System.out.println(cadena);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			String cadena2 = concatenarPalabra(null, "hola");
			System.out.println(cadena2);
		} catch (Exception e) {
			System.out.println("Error controlado pero ha ocurrido");
			e.printStackTrace();
		}
		System.out.println("Fin de programa");

	}
	
	public static String concatenarPalabra(String s,String s1) throws Exception{
		if(s == null || s1 == null) {
			throw new Exception("Alguno de los parametros es nulo");
		}
		String cadena = s.concat(s1);
		return cadena;
				
	}
}
