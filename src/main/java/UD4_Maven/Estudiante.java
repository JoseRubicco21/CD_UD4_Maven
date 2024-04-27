package UD4_Maven;

public class Estudiante {
	
	/**
	 * String nombre. Campo privado del Objeto estudiante que define su nombre.
	 */
    private String nombre;
    /**
     *  int edad. Campo privado que Indica la edad del estudiante.
     */
    private int edad;
    /**
     * double calificacion. Campo privado que indica la calificación del estudiante.
     */
    private double calificacion;

    /**
     * Constructor para un objeto Estudiante que especifica los atributos nombre y edad.
     * @param nombre. Atributo que hace referencia al nombre del estudiante.
     * @param edad. Atributo que hace referencia a la edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Método para establecer la calificación del estudiante.
     * @param calificacion Atributo que indica la calificación del estudiante.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Método para obtener el nombre del estudiante.
     * @return String. El nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del estudiante.
     * @param nombre String que se desea establecer como nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad del estudiante.
     * @return int La edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del estudiante.
     * @param edad La edad que se desea establecer.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener la calaficación del estudiante.
     * @return double La calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Método que determina si un estudiante ha aprobado o no.
     * @return boolean Si esta aprobado, será verdadero sino falso.
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /** 
     * Método que devuelve la edad escolar de un estudiante 
     * @return int Edad escolar ( Edad / 12 )
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Método que determina si un estudiante es universitario o no.
     * @return boolean. Si la edad es mayor o igual que 18, devolverá verdadero, sino falso.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    } 

    /**
     * Método para imprimir la información del estudiante.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}