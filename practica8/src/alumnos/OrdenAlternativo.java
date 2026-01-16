package alumnos;

import java.util.Comparator;

public class OrdenAlternativo implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int compara;
		
		compara = o1.getApellido1().compareTo(o2.getApellido1());
		if(compara!=0) return compara;
		
		compara = o1.getApellido2().compareTo(o2.getApellido2());
		if(compara!=0) return compara;
		
		compara = o1.getNombre().compareTo(o2.getNombre());
		if(compara!=0) return compara;
		
		return o1.getEdad()-o2.getEdad();
		
	}
	
	
}
