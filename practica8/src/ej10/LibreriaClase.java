package ej10;

import java.util.Scanner;

public class LibreriaClase {

	

	public static void  cargaDatos (Scanner sc,int array[]){
		
		for (int i=0;i<array.length;i++) {
			System.out.println("Que valor va a introducir?");
			int dato = sc.nextInt();
	
			array[i]=dato;
		}
	}
	
	
	public static void cargaDatosAleatoria (int array[]){
		
		for (int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100);
		}
	}

	public static void toStringArray(int array[]){
		for (int i : array) {
			System.out.print(i+"  ");
		}
	}

	public static int elementoMax(int array[]){
		int max=array[0];
		
		for (int i = 0; i<array.length;i++) {
			max=Math.max(array[i], array[i-1]);
		}
		
		return max;
	}
	

	public static int elementoMin(int array[]){
		int min=array[0];
		
		for (int i = 0; i<array.length;i++) {
			min=Math.min(array[i], array[i-1]);
		}
		
		return min;
	}
	
	
	public static int sumaElementos(int array[]) {
		int suma = 0;
		
		for (int i : array) {
			suma+=i;
		}
		
		return suma;
	}
	
	public static int busquedaLineal(int [] vector, int numero){
		int cont=-1;
		
		do {
			cont++;
		}
		while ((vector[cont]!=numero) && (cont < (vector.length-1)));
		
		if(vector[cont]==numero) return cont;
		return -1;
	}

	public static int busquedaBinaria(int [] vector, int numero){
		boolean sw = false;
		int mitad, primero = 0, ultimo = vector.length-1;
		
		do{
			mitad = (primero + ultimo)/2;
			
			if(vector[mitad]==numero)
				sw = true;
			else if(vector[mitad]<numero)
				primero = mitad+1;
			else
				ultimo = mitad-1;
		}
		while ((sw == false) && (primero <= ultimo));
		
		if(sw == false)
			return -1;
		return mitad;
	}


	public static void ordenarBurbuja(int [] array){
		int i=1, temp;
		boolean ordenado=false;
		while(i<array.length && ordenado == false){
			ordenado = true;
			for(int j=array.length-1; j>=i; j--){
				if(array[j]<array[j-1]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					ordenado = false;
				}
			}
			i++;
		}
	}

	public static void ordenarSeleccion(int [] array){
		int pos_menor, menor;
		for(int i=0; i<=array.length-2; i++){
			pos_menor=i;
			menor = array[i];
			for(int j= i+1; j<=array.length-1; j++){
				if(array[j]<menor){
					pos_menor = j;
					menor = array[j];
				}
			}
			array[pos_menor]=array[i];
			array[i]=menor;
		}
	}

	public static void ordenarInsercion(int [] array) {
		int j, aux;
		for (int i = 1; i<(array.length); i++) {
			aux = array[i];
			j = i-1;
			while ((j >= 0) && (array[j] > aux)) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = aux;
		}
	}


	public static void ordenarShell(int [] array) {
		int sw, i, salto, aux, n;
		n = array.length-1;
		salto = n;
		while (salto != 1) {
			sw = 1;
			salto = salto/2;
			while (sw!=0) {
				i = 0;
				sw = 0;
				while (i <= (n-salto)) {
					if (array[i] > array[i+salto]) {
						aux = array[i+salto];
						array[i+salto] = array[i];
						array[i]= aux;
						sw = 1;
					}
					i++;
				}
			}
		}
	}

	
	public static void desordenarArray(int array[]) {
		int aux, random;
		
		for (int i=0;i<(array.length);i++) {
			random=(int)(Math.random()*array.length);
			aux = array[i];
			array[i]=array[random];
			array[random]=aux;
		}
	}
	
	public static void insertarNumero(int num, int posicion,int array[]) {
		
		int aux=array[posicion], aux2=array[posicion+1];
		array[posicion]=num;
		
		for(int i=posicion+1;i<array.length-1;i++) {
			
			array[i]=aux;
			aux=aux2;
			aux2=array[i+1];
			
		}
		array[array.length-1]=aux;
	}
	
	
	public static void borrarPorPosicion(int posicion,int array[]) {				
		for(int i=posicion;i<array.length-1;i++) {			
			array[i]=array[i+1];			
		}
		array[array.length-1]=0;
	}
	
	
	public static void borrarDeterminado(int num,int array[]) {
		int busqueda=busquedaLineal(array,num);
		if(busqueda >=0) {
			array[busqueda]=0;
		}
		
	}
	
	public static void borrarTodosDeterminados(int num,int array[]) {
		while (busquedaLineal(array,num)>=0) {
			array[busquedaLineal(array,num)]=0;
		}
	}
	
	
	
}
