package interfaces_basico;

public class MainBasico {

	public static void main(String[] args) {
		Operable operacion = new Suma();
		System.out.println(operacion.operar(3,4));
		
		operacion = new Resta();
		System.out.println(operacion.operar(3,4));
		
		//clase anonima
		Operable multiplicacion = new Operable() {
			
			@Override
			public double operar(double d1, double d2) {
				double resultado = d1 * d2;
				return resultado;
			}
		};
		
		System.out.println(multiplicacion.operar(3, 4));
		System.out.println(multiplicacion.operar(6, 7));
		
		//FUNCION LAMBDA
		Operable division = (op1,op2) -> {
			double resultado = op1/op2;
			return resultado;
		};
		System.out.println(division.operar(10, 2));
		System.out.println(division.operar(20, 4));
		
		Operable numeroElevado =(base,exponente) -> {
			double resultado = Math.pow(base, exponente);
			return resultado;
		};
		System.out.println(numeroElevado.operar(3,3));
		//Si solo tenemos una instruccion y devuelve algo no face fralta poner la 
		//palabra return
		
		Operable siempreCero = (op1,op2) -> 0;
		System.out.println(siempreCero.operar(4, 5));
			
		
		SinParametrosEntrada spe = () -> System.out.println("Esto no tiene parametros");
		spe.accion();
		
		spe = new SinParametrosEntrada() {
			
			@Override
			public void accion() {
				System.out.println("eswto no tiene parametr5os ( clase anomina)");
				
			}
		};
		spe.accion();
	}


}
