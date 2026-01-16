package alumnos;


import java.lang.reflect.Array;
import java.util.Arrays;

public class TestAlumno {

	public static void main(String[] args) {
		
		Alumno [] clase = new Alumno[3];
		
		clase[0] = new Alumno("Juan", "Moreno", "L�pez", 20);
		clase[1] = new Alumno("Ana", "Mart�n", "Garc�a", 19);
		clase[2] = new Alumno("Antonio", "Gil", "Gonz�lez", 22);
		
		System.out.println(Arrays.toString(clase));
		
		Alumno [] clase2 = {new Alumno("Juan", "Moreno", "L�pez", 20),
							new Alumno("Ana", "Mart�n", "Garc�a", 19),
							new Alumno("Antonio", "Gil", "Gonz�lez", 22),
							new Alumno("Mar�a", "Gil", "Gonz�lez", 22),
							new Alumno("Ana", "Mart�n", "Garc�a", 19),
		};
		System.out.println(Arrays.toString(clase2));
		
		Alumno [] clase3 = {new Alumno("Juan", "Moreno", "L�pez", 20),
				new Alumno("Ana", "Mart�n", "Garc�a", 19),
				new Alumno("Antonio", "Gil", "Gonz�lez", 22),
				new Alumno("Mar�a", "Gil", "Gonz�lez", 22),
				new Alumno("Ana", "Mart�n", "Garc�a", 19),
		};
		
		//Recorrer el array 3 de indices mostrando solo su nombre en mayuscula y su edad 
		for (int i=0;i<clase3.length;i++) {
			System.out.println(clase3[i].getNombre().toUpperCase()+", "+clase3[i].getEdad());
		}
		
		for(Alumno alum:clase3) {
			System.out.println(alum.getNombre().toUpperCase()+", "+alum.getEdad());
		}
		
		
		//Comparar arrays de objetos
		System.out.println("Comparacion clase y clase 2: "+Arrays.equals(clase,clase2));
		System.out.println("Comparacion clase y clase 2: "+Arrays.equals(clase2,clase3));
		
		//Ordenar el array 
		Arrays.sort(clase2);
		System.out.println(Arrays.toString(clase2));
		
		
	}

}


