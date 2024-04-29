package UD4_Maven;

import java.util.Arrays;  
import java.util.Scanner;  

/**
 * Clase que describe un anagrama. Compara 2 strings para saber si son un anagrama.
 */
public class Anagrama {
	      
		/**
		 * Primer string que se quiere comprobar.
		 */
	    private String str1; 
	    /**
	     * Segundo string que se quiere comprobar
	     */
	    private String str2;
	    /**
	     * Objeto que obtiene los datos necesarios para la comprobación del anagrama
	     */
	    private Scanner sc;
	    
	    /**
	     * Constructor por defecto. Instancia un scanner para obtener datos.
	     */
	    public Anagrama() {
	    	this.sc = new Scanner(System.in);
	    }
	    
	    /**
	     * Constructor que crea un objeto anagrama con todos los parametros. Instancia internamente un objeto de tipo Scanner.
	     * @param str1 Primer string para comparar
	     * @param str2 Segundo string para comparar
	     */
	    public Anagrama(String str1, String str2) {
	    	this.str1=str1;
	    	this.str2=str2;
	    	this.sc = new Scanner(System.in);
	    }
		
	    /**
	     * Método para obtener el input de un usuario.
	     */
		public void getInput() {
			System.out.println("Introduce el primer dato a comprobar");
			this.str1=sc.nextLine();
			System.out.println("Introduce el segundo dato a comprobar");
			this.str2=sc.nextLine();
		};

		/**
		 * Método para obtener si los parametros str1 y str2 son un anagrama
		 * @param str1 El primer string que se desea comprobar
 		 * @param str2 El segundo string que se desea comprobar
		 * @return boolean Verdadero o falso según si str1 y str2 son un anagrama o no.
		 */
		public boolean checkAnagram(String str1, String str2) {
	 
	    	if(str1.length() != str2.length()) return false;
	    	
	    	char[] charArray1 = str1.toCharArray();  
	        char[] charArray2 = str2.toCharArray();  
	        
	        Arrays.sort(charArray1);  
	        Arrays.sort(charArray2);  
	    	
	    	return Arrays.equals(charArray1, charArray2);
	    }
	    
		/**
		 * Método que imprime el estado de un anagrama después de ejecutar el método checkAnagram
		 * @param checkAnagramResult Se le pasa como parametro el resultado de {@link #checkAnagram(str1, str2) checkAnagram}
		 */
	    public void printResult(boolean checkAnagramResult) {
	    	if(checkAnagramResult) {
	    		 System.out.println(this.str1 + " and " + this.str2 + " are anagram.");  
	     	} else {
	     		System.out.println(this.str1 + " and " + this.str2 + " are not anagram.");
	     	}
	    }
	    
	    /**
	     * Método para obtner el primer string de un objeto anagrama
	     * @return String str1, el primer string que se desea comparar.
	     */
	    public String getStr1() {
			return str1;
		}
	    
	    /**
	     * Método para establecer el primer string del objeto anagrama.
	     * @param str1 El primer string para comparar.
	     */

		public void setStr1(String str1) {
			this.str1 = str1;
		}

		/**
	     * Método para obtner el primer string de un objeto anagrama
	     * @return String str2, el segundo string que se desea comparar.
	     */
		public String getStr2() {
			return str2;
		}
		
		  
	    /**
	     * Método para establecer el segundo string del objeto anagrama.
	     * @param str2 El segundo string para comparar.
	     */
		public void setStr2(String str2) {
			this.str2 = str2;
		}
	  
}  	

