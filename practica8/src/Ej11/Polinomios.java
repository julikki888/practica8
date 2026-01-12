package Ej11;

import java.util.Arrays;
import java.util.Scanner;

public class Polinomios {

	public static void main(String[] args) {

	/**11.- Hacer un programa de menú con las siguientes opciones:
				 Suma de dos polinomios de grado N y M.
				 Resta de dos polinomios de grado N y M.
				 Multiplicación de dos polinomios de grado N y M.	*/
		
		int [] pol1,pol2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Grado del primer polinomio: ");
		pol1 = new int[sc.nextInt()+1];
		
		for (int i=0 ; i<pol1.length;i++) {
			System.out.println("Introduce el numero en la posicion "+i);
			pol1[i]=(int)(Math.random()*100);
		}
		
		System.out.println("Grado del segundo polinomio: ");
		pol2 = new int[sc.nextInt()+1];
		
		for (int i=0 ; i<pol2.length;i++) {
			System.out.println("Introduce el numero en la posicion "+i);
			pol2[i]=(int)(Math.random()*100);
		}
		
		System.out.println("Pol1: "+Arrays.toString(pol1)+"\nPol2: "+Arrays.toString(pol2));
		
		
	}
	
	public static int[] sumaArray(int[]pol1,int[]pol2) {
		int[] polResultado = new int[Math.max(pol1.length, pol2.length)] ;
		
		
		
		
		return polResultado;
	}

}
