package matrices;

public class Matrices1 {

	public static void main(String[] args) {

		//Definir una matriz de 6 filas y 8 columnas 
		int [][] matriz = new int [6][8];
		
		//rellenar la matriz con valores aleatorios
		for (int fil=0;fil<matriz.length;fil++) {
			for (int col=0;col<matriz[fil].length;col++) {
				matriz[fil][col]=(int)(Math.random()*100);
				System.out.println(matriz[fil][col]+" ");
			}//end for col
			
			System.out.println();
						
		}//end for fil
		
	}

}
