package juego7Media;

import java.util.Objects;

public class Carta {

	/**
	 * Guardara la informacion de un objeto tipo carta
	 * 		-Valor de la carta --> 1 a 10(1 a 7, cartas de 1 a 7, 8-Sota,9-Caballo,10-Rey)
	 * 		-Palo de la carta --> Oros, Copas, Bastos, Espadas
	 */
	private EnumPalo palo;
	private byte valor;
	
	
	public Carta(EnumPalo palo, byte valor) {
		super();
		this.palo = palo;
		this.valor = valor;
	}


	public EnumPalo getPalo() {return palo;}
	public byte getValor() {return valor;}

	public void setPalo(EnumPalo palo) {this.palo = palo;}
	public void setValor(byte valor) {this.valor = valor;}


	/**
	 * Redifinicion de hashCode	
	 */
	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	/**
	 * Redifinicion de equals
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return palo == other.palo && valor == other.valor;
	}


	@Override
	public String toString() {
		
		return switch (this.valor) {
		case 1,2,3,4,5,6,7 ->{yield this.valor + " de " + this.palo;}
		case 8 ->{yield "Sota de "+this.palo; }
		case 9 ->{yield "Caballo de "+this.palo;}
		case 10 ->{yield "Rey de "+this.palo;}
		default -> {yield "Carta no valida";}
		};				
	}
	
	
	/**
	 * metodo que devuelve la puntiuacion real de la carta para el juego de las siete y media
	 * 
	 * @return --> 1 a 7 si el valor de la carta es de 1 a 7
	 * 		   -->0.5 si el valor de la carta es 8,9 o 10
	 */
	public float getPuntos7Media() {
		
		if(this.valor<=7) return this.valor;
		return 0.5f;
	}
	
	
	
	
	
}
