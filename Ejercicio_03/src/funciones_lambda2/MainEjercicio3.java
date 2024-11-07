package funciones_lambda2;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// Una función lambda que devuelva el número de letras que tiene una frase pasada por parámetro
		Function<String, Integer> contarLetras = frase -> frase.length();
        System.out.println(contarLetras.apply("Hola mundo"));
        
        // Una función lambda que dados 2 números devuelva la distancia entre ambos
        BiFunction<Integer, Integer, Integer> distanciaNumeros = (a, b) -> Math.abs(a - b);
        System.out.println(distanciaNumeros.apply(10, 67));
        
        //Una función lambda que dado una cadena y un número, devuelva una subcadena desde 
        //el principio hasta el número del caracter pasado por parámetro
        BiFunction<String, Integer, String> obtenerSubcadena = (cadena, index) -> cadena.substring(0, index);
        
        System.out.println(obtenerSubcadena.apply("Hola mundo", 4));
        
        //Una función lambda que devuelva true en caso de que una fase introducida por parámetro contiene la cádena "pepe"
        Predicate<String> contienePepe = frase -> frase.contains("pepe");
        
        System.out.println(contienePepe.test("Hola pepe, cómo estás")); 
        
        //Una función lambda que imprima por pantalla un array de números pasado por parámetro.
        Consumer<int[]> imprimirArray = array -> System.out.println(Arrays.toString(array));
        
        imprimirArray.accept(new int[]{1, 2, 3, 4, 5}); 
        
        // Una función lambda que reciba 3 números y devuelva el mayor de los tres.
        TriFunction<Integer,Integer,Integer,Integer> numeroMayor = (a, b, c) -> Math.max(a, Math.max(b, c));
        System.out.println(numeroMayor.apply(5, 9, 3));

	}

}
