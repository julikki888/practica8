package ej10;

import java.util.Scanner;

public class LibreriaObjeto {


	/**
	 * Variables de instancia
	 */
	
	private int[] array = new int [100];

	
	
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
	
	
	
	
}
