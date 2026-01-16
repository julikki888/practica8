package alumnos;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
	
	/**
	 * Variables instancia
	 */
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;

	
	/**
	 * Constructor
	 */
	public Alumno(String nombre, String apellido1, String apellido2, int edad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}

	/**
	 * Getter y Setter
	 */
	public String getNombre() {return nombre;	}
	public String getApellido1() {return apellido1;}
	public String getApellido2() {return apellido2;}
	public int getEdad() {return edad;}

	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido1(String apellido1) {this.apellido1 = apellido1;}
	public void setApellido2(String apellido2) {this.apellido2 = apellido2;}
	public void setEdad(int edad) {this.edad = edad;}
	
	
	/**
	 * Redefinici�n el m�todo toString
	 */
	@Override
	public String toString() {
		return this.apellido1 + " " + this.apellido2+ ", " + this.nombre +
				" (" + this.edad + ")\n";
	}

	/**
	 * Redefinicion de hashCode
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash( nombre);
	}

	/**
	 * redefinicion de equals
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}

	/**
	 * Redefinicion compare to
	 * 
	 * devuleve -negativo, 0, o positivo segun si el primer valor
	 * es mas pequeño que el comparado, igual, o mayor
	 */
	
	@Override
	public int compareTo(Alumno o) {
		
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	


	
}



