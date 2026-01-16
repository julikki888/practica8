package ej10;

public class Main {

	public static void main(String[] args) {

		
		LibreriaObjeto lo = new LibreriaObjeto();
		
		lo.cargaDatosAleatoria();
		lo.toStringArray();
		
		System.out.println("\n"+lo.busquedaBinaria(30));
		
		lo.ordenacionBurbuja();
		lo.toStringArray();
		System.out.println("\n---porposicion");
		
		lo.borrarPorPosicion(1);
		lo.toStringArray();
		System.out.println();
		
		lo.insertarNumero(67, 4);
		lo.toStringArray();
		
		
		System.out.println();
		lo.desordenarArray();
		lo.toStringArray();
		
		
		
/*
 * 10.- Desarrolla dos librerías con métodos para manejar arrays:
 * 
 * --una de ellas contendrá métodos de objeto, por tanto tendremos una variable de instancia que será
		el array con el que trabajaremos,
 * --y otra con métodos de clase, en este caso el array llegará como parámetro a los diferentes métodos.
		Asimismo deberá desarrollar dos programas que incluyan un menú con el que poder probar las
		librerías anteriores.
			Los métodos que incluiremos en nuestras librerías serán:
 Carga de datos en el array mediante teclado.

 Carga de datos en el array de forma aleatoria.

 toString del array.

 Elemento máximo del array.

 Elemento mínimo del array.

 Suma de los elementos del array.
--------------------------------------------------------
 Métodos de búsqueda (lineal y dicotómica o binaria).

 Métodos varios de ordenación (búrbuja, selección, inserción y Shell).

 Método que desordene el array.

 Método de insertar por posición, es decir, colocando el nuevo número en la posición indicada,
siempre y cuando sea válida, es decir, le abriremos un hueco en el array desplazando todos los
elementos a la derecha y perdiendo el último elemento que haya en el array.

 Método de borrar por posición, es lo opuesto al método anterior, tendremos que desplazar los
	elementos a la izquierda, y colocaremos un 0 en la última posición del array.
	
 Método de borrar un determinado elemento (la primera ocurrencia que encontremos).

 Método para borrar todas las apariciones de un elemento.


	De forma paralela al desarrollo de las librerías se irán desarrollando unos programas para el testeo de
las mismas, por ejemplo, un menú con las diferentes funcionalidades que ofrecen los métodos de las
librerías.
 * 
 * 
 */
	}
}
