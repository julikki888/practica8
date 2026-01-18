package ej10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		LibreriaObjeto lo = new LibreriaObjeto();
		int [] array=new int [10];
		
		int menuNum, aux, aux2;
		
		try (Scanner sc = new Scanner(System.in)){
			menuNum=menu(sc);
			while(menuNum!=0) {				
				switch (menuNum) {
				case 0 -> {continue;}
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
					System.out.println("(MetodoObjeto)¿Que numero desea buscar?");
					aux = sc.nextInt();
					System.out.println(
							(lo.busquedaLineal(aux)<0?"No existe este numero en el array.":
													  "El numero que buscas se encuentra en la posicion: "+lo.busquedaLineal(aux)));
					System.out.println("\n(MetodoClase)¿Que numero desea buscar?");
					System.out.println(
							(LibreriaClase.busquedaLineal(array, aux)<0?"No existe este numero en el array.":
										"El numero que buscas se encuentra en la posicion: "+LibreriaClase.busquedaLineal(array, aux)));
				}
				case 8 ->{
					System.out.println("(MetodoObjeto)¿Que numero desea buscar?");
					aux = sc.nextInt();
					System.out.println(
							(lo.busquedaBinaria(aux)<0?"No existe este numero en el array.":
													  "El numero que buscas se encuentra en la posicion: "+lo.busquedaBinaria(aux)));
					System.out.println("\n(MetodoClase)¿Que numero desea buscar?");
					System.out.println(
							(LibreriaClase.busquedaBinaria(array, aux)<0?"No existe este numero en el array.":
										"El numero que buscas se encuentra en la posicion: "+LibreriaClase.busquedaBinaria(array, aux)));
				}
				case 9 ->{lo.ordenacionBurbuja(); LibreriaClase.ordenarBurbuja(array);}
				case 10 -> {lo.ordenacionSeleccion(); LibreriaClase.ordenarSeleccion(array);}
				case 11 -> {lo.ordenarInsercion(); LibreriaClase.ordenarInsercion(array);}
				case 12 -> {lo.ordenarShell(); LibreriaClase.ordenarShell(array);}
				case 13 -> {lo.desordenarArray(); LibreriaClase.desordenarArray(array);}
				case 14 -> {
					System.out.println("(MetodoObjeto)Introduce el numero y la posicion donde va a insertar");
					aux = sc.nextInt();
					aux2 = sc.nextInt();
					lo.insertarNumero(aux, aux2);
					
					System.out.println("(MetodoClase)Introduce el numero y la posicion donde va a insertar");
					LibreriaClase.insertarNumero(aux, aux2, array);
				}
				case 15 -> {
					System.out.println("(MetodoObjeto)Introduce la posicion a borrar");
					aux = sc.nextInt();
					lo.borrarPorPosicion(aux);
					
					System.out.println("(MetodoClase)Introduce la posicion a borrar");
					LibreriaClase.borrarPorPosicion(aux, array);
				}
				case 16 -> {
					System.out.println("(MetodoObjeto)Introduce el numero a eliminar una vez");
					aux = sc.nextInt();
					lo.borrarDeterminado(aux);
					
					System.out.println("(MetodoClase)Introduce el numero a eliminar una vez");
					LibreriaClase.borrarDeterminado(aux, array);
				}
				case 17 -> {
					System.out.println("(MetodoObjeto)Introduce el numero a eliminar completamente");
					aux = sc.nextInt();
					lo.borrarTodosDeterminados(aux);
					
					System.out.println("(MetodoClase)Introduce el numero a eliminar completamente");
					LibreriaClase.borrarTodosDeterminados(aux, array);
				}
				
				default -> System.out.println("Numero no valido: " + menuNum);
				}
				menuNum=menu(sc);
				
			}; 

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static int menu(Scanner sc) {
		
		System.out.println("\nSelecciona una opcion:"
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
