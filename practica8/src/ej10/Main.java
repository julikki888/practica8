package ej10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		LibreriaObjeto lo = new LibreriaObjeto();
		int [] array=new int [10];
		
		int menuNum, aux;
		
		try (Scanner sc = new Scanner(System.in)){
			do {
			
				menuNum=menu(sc);
				
				switch (menuNum) {
				case 1 -> {lo.cargaDatos(sc); LibreriaClase.cargaDatos(sc, array);}
				case 2 -> {lo.cargaDatosAleatoria(); LibreriaClase.cargaDatosAleatoria(array);}
				case 3 -> {
					System.out.println("toString metodoInstancia");
					lo.toStringArray(); 
					System.out.println("toString metodoClase");
					LibreriaClase.toStringArray(array);}
				case 4 -> {System.out.println("(MetodoInstancia)\nElemento maximo: "+lo.elementoMax()); 
							System.out.println("\n(MetodoClase)\nElemento Maximo: "+LibreriaClase.elementoMax(array));}
				case 5 -> {System.out.println(lo.elementoMin()); System.out.println(LibreriaClase.elementoMin(array));}
				case 6 -> {System.out.println(lo.sumaElementos()); System.out.println(LibreriaClase.sumaElementos(array));}
				case 7 -> {
					System.out.println("¿Que numero desea buscar?");
					aux = sc.nextInt();
					System.out.println(
							(lo.busquedaLineal(aux)<0?"No existe este numero en el array.":
													  "El numero que buscas se encuentra en la posicion: "+lo.busquedaLineal(aux)));
					
				}
				
				default ->
				throw new IllegalArgumentException("Unexpected value: " + menuNum);
				}
				
				
			}while(menuNum!=0); 
				
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static int menu(Scanner sc) {
		
		System.out.println("Selecciona una opcion:"
				+ "\n0. Cerrar menu."
				+ "\n1. Carga de datos en el array mediante teclado."
				+ "\n2. Carga de datos en el array de forma aleatoria."
				+ "\n3. toString del array."
				+ "\n4. Elemento máximo del array."
				+ "\n5. Elemento mínimo del array."
				+ "\n6. Suma de los elementos del array."
				+ "\n7. Método de búsqueda lineal."
				+ "\n8. Método de búsqueda binaria."
				+ "\n9. Método de ordenación burbuja."
				+ "\n10. Método de ordenación seleccion."
				+ "\n11. Método de ordenación inserccion."
				+ "\n12. Método de ordenación Shell."
				+ "\n13. Método de desordenacion del array."
				+ "\n14. Insertar por posicion."
				+ "\n15. Borrar por posicion."
				+ "\n16. Borrar un elemento."
				+ "\n17. Borrar un elemento completamente");
		
		return sc.nextInt();
		
	}
}
