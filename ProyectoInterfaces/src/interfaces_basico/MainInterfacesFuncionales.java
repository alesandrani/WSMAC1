package interfaces_basico;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainInterfacesFuncionales {

	public static void main(String[] args) {
		// Existen predefinidas interfaces funcionales
		//1. SUPPLIER
		
		Supplier<Integer> numeroAleatorio = () -> {
			Random rd = new Random();
			int numero = rd.nextInt(1,100);
			return numero;
		};
		
		System.out.println(numeroAleatorio.get());
		
		//con clase anonima
		numeroAleatorio = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				Random rd = new Random();
				int numero = rd.nextInt(1,100);
				return numero;
			}
		};
		
		//2. CONSUMER
		Consumer<String> log = (v) ->{
			Date date = new Date();
			System.out.println("*** " + date + "- " + v);
			
		};
		log.accept("NullPointerExeption!");
		log.accept("Datos recibidos");
		
		//FUNCTION
		
		Function<Double,Double> raizCuadrada = (v) -> {
			double raiz = Math.sqrt(v);
			return raiz;
		};
		System.out.println(raizCuadrada.apply(9.0));
		System.out.println(raizCuadrada.apply(25.0));
		
		List<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.add(1);
		listaEnteros.add(2);
		listaEnteros.add(3);
		
		//Recorrer con un for classico
		for(Integer i : listaEnteros) {
			System.out.println(i);
		}
		
		System.out.println("-----Lambda-----");
		Consumer<Integer> recorrer= new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		listaEnteros.forEach(recorrer);
	
		Consumer<Integer> reccorerLambda = (v) ->{
			System.out.println(v);
		};
		System.out.println(reccorerLambda);
			//resumen de todo
		listaEnteros.forEach(v -> System.out.println(v));
			
		
		//Map<String,Integer> mapa = new Map<String,Integer>();
		}

}
