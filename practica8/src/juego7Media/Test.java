package juego7Media;

public class Test {

	public static void main(String[] args) {

		Carta c1 = new Carta(EnumPalo.OROS,(byte)10);
		System.out.println(c1);
		System.out.println("Puntuacion: "+ c1.getPuntos7Media());
		
		Carta c2 = new Carta(EnumPalo.COPAS,(byte)7);
		System.out.println(c2);
		System.out.println("Puntuacion: "+ c2.getPuntos7Media());
		
		Carta c3 = new Carta(EnumPalo.OROS,(byte)10);

		if(c1.equals(c3))
			System.out.println("Son iguales");
		else
			System.out.println("Watermelom");
		
		if(c1.equals(c2))
			System.out.println("Watermelon");
		else
			System.out.println("Son distintas");
		
		
		
		//Prueba de clase baraja
		
		Baraja miBaraja = new Baraja();
		
		for (Carta elemento : miBaraja.getMiBaraja()) {
			System.out.println(elemento);
		}
		
	}

}
