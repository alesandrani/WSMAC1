package usuarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorUsuarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean accesoPermitido = false;
		int intentos = 0;
		
		while (intentos < 3 && !accesoPermitido) {
			System.out.println("Introduzca el nombre del usuario: ");
			String usuario = sc.nextLine();
			System.out.println("Introduzca su contraseña: ");
			String password = sc.nextLine();
			
			accesoPermitido = verificarUsuario(usuario,password);
			if (accesoPermitido) {
				System.out.println("Usuario y contraseña son correctos. Bienvenido " + usuario);
				mostrarMenu();
			}else {
				intentos++;
				if(intentos < 3) {
					System.out.println("Usuario o contraseña son incorrectos. Intenta de nuevo. ");
				}else {
					System.out.println("Has alcanzado el numero maximo de intentos para hoy. Intentalo mas tarde.");
				}
			}
		}
		sc.close();
	}

	private static void mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while( opcion != 2) {
			System.out.println("1. Añadir usuario al registro ");
			System.out.println("2. Fin del programa ");
			System.out.println("Elija una opcion ");
			opcion = sc.nextInt();
			sc.nextLine();
			if(opcion == 1) {
				anadirUsuario();
			}else if(opcion == 2) {
				System.out.println("Saliendo del programa.....");
			}else {
				System.out.println("opcion no valida o vacia. Intenta de nuevo");
			}
		}
		
	}

	private static void anadirUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre del usuario");
		String nombreUsuario = sc.nextLine();
		System.out.println("Introduzca la contraseña");
		String passwordUsuario = sc.nextLine();
		try(BufferedWriter  bw = new BufferedWriter(new FileWriter("usuarios.dat", true))){
			bw.write(nombreUsuario + "/" + passwordUsuario);
			bw.newLine();
			System.out.println("Usuario añadido con exito.");
		}catch(IOException e) {
			System.out.println("Error");
		}
	}

	private static boolean verificarUsuario(String usuario, String password) {
		try (BufferedReader br = new BufferedReader(new FileReader("usuarios.dat"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("/");
                if (partes[0].equals(usuario) && partes[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios.");
        }
		return false;
	}

}
