package co.edu.poli.test;

import junit.framework.TestCase;
import model.Jugador;

/*
	Clase que realiza las pruebas unitarias para los metodos:
	* obtenerPosicionAleatoria ();
	* compararCodigos (String, int);
	Debido a que son dos de los tres métodos con retorno de valores  
*/
public class Jugadortest extends TestCase {
	
	/*
	  Test que realiza la prueba del método ObtenerPosicionAleatoria ();
	  el resultado debe ser igual al esperado para considerar 
	  que el metodo funciona correctamente 
	*/    
    public void testObtenerPosicionAleatoria() {
        String[][] letras = new String[27][2];
        String[][] palabras = new String[100][2];
        Jugador jugador = new Jugador(letras, palabras);
        for (int i = 0; i < 10; i++) {
        	int posicion = jugador.obtenerPosicionAleatoria();
        	assertTrue("La posición debe estar entre 0 y 99", posicion >= 0 && posicion < 100);
        }
    }
    
	/*
	  Test que realiza la prueba del método ObtenerPosicionAleatoria
	  el resultado debe ser diferente al esperado para considerar 
	  que el metodo funciona correctamente	  
	*/
    public void testObtenerPosicionAleatoriaIncorrecto() {
        String[][] letras = new String[27][2];
        String[][] palabras = new String[100][2];
        Jugador jugador = new Jugador(letras, palabras);
        for (int i = 0; i < 10; i++) {
        	int posicion = jugador.obtenerPosicionAleatoria()+100;
        	assertTrue("La posición debe estar entre 0 y 99", posicion >= 0 && posicion < 100);
        }
    }
    
	/*
	  Test que realiza la prueba del método CompararCodigos
	  el resultado debe ser igual al esperado para considerar 
	  que el metodo funciona correctamente 
	*/
    public void testCompararCodigos() {
       String[][] letras = new String[27][2];
       String[][] palabras = new String[100][2];
       String[] codigoMorse = new String[4];

       palabras[0][0] = "HOLA";
       palabras[0][1] = "....---.-...-"; 
       palabras[1][0] = "JUEGO";
       palabras[1][1] = "·−−−··−·−−·−−−"; 
       palabras[2][0] = "QUESO";
       palabras[2][1] = "−−·−··−····−−−"; 
       palabras[3][0] = "AMOR";
       palabras[3][1] = "·−−−−−−·−·";
              
       codigoMorse [0] = "....---.-...-";
       codigoMorse [1] = "·−−−··−·−−·−−−"; 
       codigoMorse [2] = "−−·−··−····−−−";
       codigoMorse [3] = "·−−−−−−·−·";

       Jugador jugador = new Jugador(letras, palabras);
       
		for(int i=0; i<4; i++) {
			    boolean resultadoCorrecto = jugador.compararCodigos(codigoMorse [i], i);
			    assertTrue("El código Morse debería coincidir.", resultadoCorrecto);
			}		
   }
    
	/*
	  Test que realiza la prueba del método CompararCodigos
	  el resultado debe ser diferente al esperado para considerar 
	  que el metodo funciona correctamente 
	*/
  public void testCompararCodigosIncorrecto() {
     String[][] letras = new String[27][2];
     String[][] palabras = new String[100][2];
     String[] codigoMorse = new String[4];

     palabras[0][0] = "HOLA";
     palabras[0][1] = "....---.-...-"; 
     palabras[1][0] = "JUEGO";
     palabras[1][1] = "·−−−··−·−−·−−−"; 
     palabras[2][0] = "QUESO";
     palabras[2][1] = "−−·−··−····−−−"; 
     palabras[3][0] = "AMOR";
     palabras[3][1] = "·−−−−−−·−·";
            
     codigoMorse [0] = "............";
     codigoMorse [1] = "------------"; 
     codigoMorse [2] = "abdefghijklm";
     codigoMorse [3] = "123456789";

     Jugador jugador = new Jugador(letras, palabras);
     
		for(int i=0; i<4; i++) {
		     boolean resultadoIncorrecto = jugador.compararCodigos(codigoMorse [i], i);
		     assertFalse( "El código Morse no debería coincidir.", resultadoIncorrecto);
			}		
  	}
    
}