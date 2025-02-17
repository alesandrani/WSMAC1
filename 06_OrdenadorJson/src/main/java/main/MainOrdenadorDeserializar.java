package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import modelo.entidad.Ordenador;
import modelo.entidad.Ram;

public class MainOrdenadorDeserializar {

	public static void main(String[] args) {
		File file = new File("JSONOrdenador.json");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            StringBuilder jsb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) { // Corrección de condición
                jsb.append(line);
            }

            String json = jsb.toString();
            Gson gson = new Gson();
            Ordenador o = gson.fromJson(json, Ordenador.class);

            System.out.println("Ordenador deserializado:");
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Precio: " + o.getPrecio());
            System.out.println("procesador: " +o.getProcesador().getMarca() + "" + o.getProcesador().getModelo());
            System.out.println("Ram: " );
            for(Ram r : o.getRams()) {
            	System.out.println(" - " + r.getMarca() + " " + r.getCapacidad());
            }

        } catch (IOException e) { // Corrección de IOException
            e.printStackTrace();
        }
    }
}