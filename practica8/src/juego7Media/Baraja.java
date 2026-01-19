package juego7Media;

/**
 * Clase Baraja
 * La baraja la simularemos mediante un array de objetos de tipo carta,
 * en un pricipio las ordenaremos y luego en un metodo la desordenamos
 */

public class Baraja {

	/**
	 * Variables de instancia
	 */
	private Carta[] miBaraja; //Array con 40 cartas
	private byte posProsimaCarta;//Indicara la posicion en el array de la siguiente carta a sacar
	public static final int NUMCARTABARAJA = 40;

	/**
	 * Constructor
	 */
	public Baraja() {
		this.miBaraja = new Carta[NUMCARTABARAJA];
		
		EnumPalo[] enumPalos = EnumPalo.values();
		
		for(int contadorPalos = 0, i=0; contadorPalos<enumPalos.length;contadorPalos++) {
			for(byte contadorValor = 1; contadorValor<=10;contadorValor++,i++) {
				this.miBaraja[i]= new Carta(enumPalos[contadorPalos],contadorValor);
			}
		}
		
		mezclar();//Mezcla las cartas
		
	}
		

	public void mezclar() {
		Carta cartaAux;
		int aux1,aux2; //Variables para generar 2 numeros aleatorios
		
		for(int cont=1;cont<this.miBaraja.length;cont++) {
			aux1=(int)(Math.random()*NUMCARTABARAJA);
			aux2=(int)(Math.random()*NUMCARTABARAJA);
			
			cartaAux = this.miBaraja[aux1];
			this.miBaraja[aux1] = this.miBaraja[aux2];
			this.miBaraja[aux2] = cartaAux;
		}
	}
	
	
	/**
	 * Metodo que saca una carta de la baraja
	 */
	public Carta sacaCarta() {
		return this.miBaraja[this.posProsimaCarta++];
	}
	
	public boolean quedanCartas() {
		return this.posProsimaCarta<NUMCARTABARAJA;
	}


	public Carta[] getMiBaraja() {return miBaraja;}
	public byte getPosProsimaCarta() {return posProsimaCarta;}

	public void setMiBaraja(Carta[] miBaraja) {this.miBaraja = miBaraja;}
	public void setPosProsimaCarta(byte posProsimaCarta) {this.posProsimaCarta = posProsimaCarta;}
	
	
	
	@Override
	public String toString() {
		
		String cad = "Quedan "+ (NUMCARTABARAJA - this.posProsimaCarta)+ " cartas";
		
		for (int i = this.posProsimaCarta;i<this.miBaraja.length;i++) {
			cad += "\n"+this.miBaraja[i].toString();
		}
		
		return cad;
	}	
	
	
	
	
}
