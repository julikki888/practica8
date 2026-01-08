package matrices;

public class Matrices2 {

	public static void main(String[] args) {
		//Definir una matriz de 6 filas y 8 columnas 
		
		int [][] matriz = new int [10][11], matriz2 = new int [6][6] matriz3 = new int{{0,30,2,0,0,0},
																						{;
	
		
		//rellenar la matriz con 1 en diaonal
		for (int fil=0, i=0;fil<matriz2.length;fil++,i++) {
			for (int col=0;col<matriz2[fil].length;col++) {
				if (col==i) matriz2[fil][col]=1;
				System.out.print(matriz2[fil][col]+" ");
			}//end for col
			System.out.println();
		}//end for fil
	
		System.out.println("\n--------------------\n");
		//rellenar la matriz con la tabla de multiplicar
				for (int fil=0	;fil<matriz.length;fil++) {
					for (int col=0;col<matriz[fil].length;col++) {
						matriz[fil][col]=(fil+1)*col;
						System.out.printf("%4d",matriz[fil][col]);
					}//end for col
					System.out.println("");
				}//end for fil
	
	
	
	}
}
