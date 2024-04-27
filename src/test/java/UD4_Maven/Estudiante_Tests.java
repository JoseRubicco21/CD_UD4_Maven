package UD4_Maven;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Estudiante_Tests {

	@Test
	public void esUniversiterioTest() {
		Estudiante e = new Estudiante("Pepe", 21);
		assertTrue(e.esUniversitario());
		
		e.setEdad(17);
		assertFalse(e.esUniversitario());
	}
	
	@Test
	public void aproboTest() {
		Estudiante e = new Estudiante("Pepe", 21);
		e.setCalificacion(9.0);
		assertTrue(e.aprobo());
		
		e.setCalificacion(4.0);
		assertFalse(e.aprobo());
	}
	
	
}
