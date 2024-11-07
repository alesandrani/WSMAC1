package entidades;

import java.util.ArrayList;
import java.util.List;

public class MainEmpresa {

	public static void main(String[] args) {
		Direccion direccion1 = new Direccion("calle","deva","28041");
		Direccion direccion2 = new Direccion("calle","orense","28941");
		Direccion direccion3 = new Direccion("calle","hola","28044");
		Direccion direccion4 = new Direccion("calle","sanjose","28087");
		Currito currito1 = new Currito("Pepe", "Hombre", 25, direccion2,1500.00);
		Currito currito2 = new Currito("Maria", "Mujer", 30, direccion3,1800.00);
		List<Empleado> listaEmpleado= new ArrayList<>();
		List<Empleado>listaEmpleadosJefe = new ArrayList<>();
		listaEmpleadosJefe.add(currito2);
		listaEmpleadosJefe.add(currito1);
		Jefe jefe = new Jefe("Jose", "hombre", 40, direccion4, 2500, 2, "si", listaEmpleadosJefe);
		listaEmpleado.add(currito1);
		listaEmpleado.add(currito2);
		listaEmpleado.add(jefe);
		
		
		Empresa empresa = new Empresa("Amazon", "y66980", direccion1, listaEmpleado);
		// Calcular y mostrar el salario total de todos los empleados
        System.out.println("Salario total de todos los empleados: " + empresa.salarioTotalEmpleados());

        // Contar y mostrar cuántos empleados son jefes
        System.out.println("Cantidad de jefes en la empresa: " + empresa.empleadoEsJefe());
	}

}
