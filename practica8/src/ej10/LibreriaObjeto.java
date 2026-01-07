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
	
	
	public void cargaDatosAleatoria (Scanner sc){
		
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
		
		for (int i : array) {
			suma+=i;
		}
		
		return suma;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
