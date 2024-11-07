package ejercicio04;

public class MainEjer3y4 {

	public static void main(String[] args) {
		Persona p =  new Persona();
		Persona p2 =  new Persona();
		try {
			p2.setEdad(25);
			System.out.println(p2.getEdad());
		} catch (EdadNoPermitidaExeption e) {
			
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
		try {
			p.setEdad(-1);
			System.out.println(p.getEdad());
		} catch (EdadNoPermitidaExeption e) {
			
			e.printStackTrace();
		}
		System.out.println("fin");
		
		try {
			p.setNombre("");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NombreVacioNoPermitidoRunTimeExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin");
		try {
			p2.setNombre(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NombreVacioNoPermitidoRunTimeExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin");
	}

}
