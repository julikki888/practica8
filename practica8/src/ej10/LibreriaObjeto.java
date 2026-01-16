package ej10;

import java.util.Scanner;

public class LibreriaObjeto {


	/**
	 * Variables de instancia
	 */
	
	private int[] array = new int [10];

	
	
	/**
	 * metodos de instancia
	 */
	
	public void cargaDatos (Scanner sc){
		
		for (int i=0;i<this.array.length;i++) {
			System.out.println("Que valor va a introducir?");
			int dato = sc.nextInt();
	
			this.array[i]=dato;
		}
	}
	
	
	public void cargaDatosAleatoria (){
		
		for (int i=0;i<this.array.length;i++) {
			this.array[i]=(int)(Math.random()*100);
		}
	}

	public void toStringArray(){
		for (int i : this.array) {
			System.out.print(i+"  ");
		}
	}
	
	public int elementoMax(){
		int max=this.array[0];
		
		for (int i = 0; i<this.array.length;i++) {
			max=Math.max(this.array[i], this.array[i-1]);
		}
		
		return max;
	}
	
	
	public int elementoMin(){
		int min=this.array[0];
		
		for (int i = 0; i<this.array.length;i++) {
			min=Math.min(this.array[i], this.array[i-1]);
		}
		
		return min;
	}
	
	
	public int sumaElementos() {
		int suma = 0;
		
		for (int i : this.array) {
			suma+=i;
		}
		
		return suma;
		
	}
	
	
	public int busquedaLineal(int numero){
		int cont=-1;
		
		do {
			cont++;
		}
		while ((this.array[cont]!=numero) && (cont < (this.array.length-1)));
		
		if(this.array[cont]==numero) return cont;
		
		return -1;
	}
	
	
	
	public  int busquedaBinaria(int numero){
		boolean sw = false;
		
		int mitad, primero = 0, ultimo = this.array.length-1;
		
		do{
			mitad = (primero + ultimo)/2;
		
			if(this.array[mitad]==numero)
				sw = true;
			else if(this.array[mitad]<numero)
				primero = mitad+1;
			else
				ultimo = mitad-1;
		}
		while ((sw == false) && (primero <= ultimo));
			
		if(sw == false)
			return -1;
		
		return mitad;
	}

	
	
	
	
	public void ordenacionBurbuja(){
		int i=1, temp;
		boolean ordenado=false;
		
		while(i<this.array.length && ordenado == false){
			ordenado = true;
			
			for(int j=this.array.length-1; j>=i; j--){
				
				if(this.array[j]<this.array[j-1]){
					temp=this.array[j];
					
					this.array[j]=this.array[j-1];
										
					this.array[j-1]=temp;
					
					ordenado = false;
				}
			}
			i++;
		}
	}
	
	
	public void ordenacionSeleccion(){
		int pos_menor, menor;
		
		for(int i=0; i<=this.array.length-2; i++){
			pos_menor=i;
			menor = this.array[i];
			
			for(int j= i+1; j<=this.array.length-1; j++){
				if(this.array[j]<menor){
					pos_menor = j;
					menor = this.array[j];
				}
			}//fin for interios
			
			this.array[pos_menor]=this.array[i];
			this.array[i]=menor;
		}//fin for
	}
	
	public void ordenarInsercion() {
		int j, aux;
		
		for (int i = 1; i<(this.array.length); i++) {
			aux = this.array[i];
			j = i-1;
		
			while ((j >= 0) && (this.array[j] > aux)) {
				this.array[j+1] = this.array[j];
				j--;
			}//fin while
			this.array[j+1] = aux;
		}//fin for
	}
	
	
	public void ordenarShell() {
		int sw, i, salto, aux, n;
		n = this.array.length-1;
		salto = n;
		while (salto != 1) {
			sw = 1;
			salto = salto/2;
			while (sw!=0) {
				i = 0;
				sw = 0;
				while (i <= (n-salto)) {
					if (this.array[i] > this.array[i+salto]) {
						aux = this.array[i+salto];
						this.array[i+salto] = this.array[i];
						this.array[i]= aux;
						sw = 1;
					}
					i++;
				}
			}
		}
	}
	
	public void desordenarArray() {
		int aux, random;
		
		for (int i=0;i<(this.array.length);i++) {
			random=(int)(Math.random()*this.array.length);
			aux = this.array[i];
			this.array[i]=this.array[random];
			this.array[random]=aux;
		}
	}
	
	/** Método de insertar por posición, es decir, colocando el nuevo número en la posición indicada,
siempre y cuando sea válida, es decir, le abriremos un hueco en el array desplazando todos los
elementos a la derecha y perdiendo el último elemento que haya en el arr*/
	
	public void insertarNumero(int num, int posicion) {
		
		int aux=this.array[posicion], aux2=this.array[posicion+1];
		this.array[posicion]=num;
		
		for(int i=posicion+1;i<this.array.length-1;i++) {
			
			this.array[i]=aux;
			aux=aux2;
			aux2=this.array[i+1];
			
		}
		this.array[this.array.length-1]=aux;
	}
	
	
	public void borrarPorPosicion(int posicion) {				
		for(int i=posicion;i<this.array.length-1;i++) {			
			this.array[i]=this.array[i+1];			
		}
		this.array[this.array.length-1]=0;
	}
	
	
	
	
}
