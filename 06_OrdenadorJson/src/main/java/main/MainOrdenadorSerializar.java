package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modelo.entidad.DiscoDuro;
import modelo.entidad.FuenteAlimentacion;
import modelo.entidad.Ordenador;
import modelo.entidad.Periferico;
import modelo.entidad.PlacaBase;
import modelo.entidad.Procesador;
import modelo.entidad.Ram;
import modelo.entidad.TarjetaGrafica;

public class MainOrdenadorSerializar {

	public static void main(String[] args) {
		// Crear el objeto Ordenador
        Ordenador ordenador = new Ordenador();
        ordenador.setNombre("Flameador 2024");
        ordenador.setPrecio(1900);

        // Configurar Procesador
        Procesador procesador = new Procesador();
        procesador.setMarca("Manker");
        procesador.setModelo("9700X");
        procesador.setHz(5000);
        ordenador.setProcesador(procesador);

        // Configurar Placa Base
        PlacaBase placaBase = new PlacaBase();
        placaBase.setModelo("B470");
        placaBase.setMarca("iAmanoob");
        placaBase.setSlots_ram(4);
        ordenador.setPlaca_base(placaBase);

        // Configurar RAM
        List<Ram> rams = new ArrayList<>();
        Ram ram1 = new Ram();
        ram1.setId(1);
        ram1.setMarca("Flaming");
        ram1.setTipo("DDR4");
        ram1.setCapacidad("8GB");
        ram1.setHz(6000);
        ram1.setCl(30);
        rams.add(ram1);

        Ram ram2 = new Ram();
        ram2.setId(2);
        ram2.setMarca("Flaming");
        ram2.setTipo("DDR4");
        ram2.setCapacidad("8GB");
        ram2.setHz(6000);
        ram2.setCl(30);
        rams.add(ram2);
        ordenador.setRams(rams);

        // Configurar Disco Duro
        DiscoDuro discoDuro = new DiscoDuro();
        discoDuro.setMarca("Manker");
        discoDuro.setTipo("HDD");
        discoDuro.setCapacidad("2TB");
        ordenador.setDisco_duro(discoDuro);

        // Configurar Fuente de Alimentación
        FuenteAlimentacion fuente = new FuenteAlimentacion();
        fuente.setMarca("Manker");
        fuente.setModelo("ATX");
        fuente.setPotencia(750);
        ordenador.setFuente_alimentacion(fuente);

        // Configurar Tarjeta Gráfica
        TarjetaGrafica grafica = new TarjetaGrafica();
        grafica.setMarca("iAmanoob");
        grafica.setModelo("4080");
        grafica.setCudas(9830);
        ordenador.setTarjeta_grafica(grafica);

        // Configurar Periféricos
        List<Periferico> perifericos = new ArrayList<>();
        Periferico teclado = new Periferico();
        teclado.setTipo("Teclado");
        teclado.setNombre("Flaming pro eco 2");
        teclado.setMarca("Flamer Gaming SL");
        perifericos.add(teclado);

        Periferico raton = new Periferico();
        raton.setTipo("Ratón");
        raton.setNombre("Insultating pro 1");
        raton.setMarca("Flamer Gaming SL");
        perifericos.add(raton);

        Periferico monitor = new Periferico();
        monitor.setTipo("Monitor");
        monitor.setNombre("4K full de chill");
        monitor.setMarca("Munion S.L.");
        perifericos.add(monitor);

        ordenador.setPerifericos(perifericos);

        // Serializar a JSON y guardar en un archivo
        Gson gson = new GsonBuilder().setPrettyPrinting().create();//para que se vea estructurado el JSON
        String json = gson.toJson(ordenador);

        try (FileWriter fw = new FileWriter("ordenador.json")) {
            fw.write(json);
            System.out.println("Fichero JSON creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}