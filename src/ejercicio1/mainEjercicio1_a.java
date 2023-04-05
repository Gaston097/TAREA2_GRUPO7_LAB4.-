package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		//CREAMOS LOS OBJETOS Y LES CARGAMOS DATOS
		Profesor prof1 = new Profesor();
		prof1.setNombre("Sergio");
		prof1.setEdad(28);
		prof1.setCargo("Titular");
		prof1.setAntiguedadDocente(8);
		
		Profesor prof2 = new Profesor();
		prof2.setNombre("Marcela");
		prof2.setEdad(58);
		prof2.setCargo("Titular");
		prof2.setAntiguedadDocente(20);

		Profesor prof3 = new Profesor("Ramiro", 20, "Ayudante", 1);
		Profesor prof4 = new Profesor("Juan", 34, "Titular", 4);
		Profesor prof5 = new Profesor("Mar�a", 41, "Ayudante", 2);
		
		//CREAMOS UNA COLECCI�N PARA AGREGAR LOS OBJETOS CREADOS
		ArrayList <Empleado> listadoProfesores = new ArrayList <Empleado>();
		
		//AGREGAMOS LOS OBJETOS A LA COLECCI�N
		listadoProfesores.add(prof1);
		listadoProfesores.add(prof2);
		listadoProfesores.add(prof3);
		listadoProfesores.add(prof4);
		listadoProfesores.add(prof5);
		
		//CREAMOS UN INTERADOR PARA PODER RECORRER LA COLECCI�N
		ListIterator<Empleado> listadoIterado = listadoProfesores.listIterator();
		
		//RECORREMOS LA COLECCI�N USANDO ITERATOR
		while(listadoIterado.hasNext()) {
			Empleado profesor = listadoIterado.next();
			System.out.println(profesor.toString());
		}	
	}
}
