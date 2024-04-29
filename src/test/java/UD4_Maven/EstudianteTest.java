package UD4_Maven;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EstudianteTest {
	
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
