package ej11;

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
			pol1[i]=(int)(Math.random()*100);
		}
		
		System.out.println("Grado del segundo polinomio: ");
		pol2 = new int[sc.nextInt()+1];
		
		for (int i=0 ; i<pol2.length;i++) {
			pol2[i]=(int)(Math.random()*100);
		}
		
		System.out.println("Pol1: "+Arrays.toString(pol1)+"\nPol2: "+Arrays.toString(pol2));
		System.out.println("suma= "+Arrays.toString(sumaArray(pol1, pol2)));
		System.out.println("resta= "+Arrays.toString(restaArray(pol1, pol2)));

		
	}
	
	public static int[] sumaArray(int[]pol1,int[]pol2) {
		int[] polResultado = Arrays.copyOf((pol1.length <pol2.length?pol2:pol1),Math.max(pol1.length, pol2.length));
		
		for(int i=0; i<Math.min(pol1.length, pol2.length);i++) {
			polResultado[i]=pol1[i]+pol2[i];
		}		
		return polResultado;
	}
	
	public static int[] restaArray(int[]pol1,int[]pol2) {
		int[] polResultado = Arrays.copyOf(pol1,Math.max(pol1.length, pol2.length));
		
		for(int i=0; i<pol2.length;i++) {
			polResultado[i]=polResultado[i]-pol2[i];
		}		
		return polResultado;
	}
	
	public static int[] multiArray(int[]pol1,int[]pol2) {
		int[] polResultado = Arrays.copyOf((pol1.length <pol2.length?pol2:pol1),Math.max(pol1.length, pol2.length));
		
		for(int i=0; i<pol2.length;i++) {
			polResultado[i]=pol1[i]+pol2[i];
		}		
		return polResultado;
	}

}
