package co.edu.poli.test;

import junit.framework.TestCase;
import java.io.ByteArrayInputStream;
import model.Jugador;

/*
	Clase que realiza las pruebas unitarias para los metodos:
	* obtenerPosicionAleatoria ();
	* capturarCodigoMorse ();
	* compararCodigos (String, int);
	Debido a que son los únicos métodos con retorno de valores  
*/
public class Jugadortest extends TestCase {
	
	/*
	  Test que realiza la prueba del método ObtenerPosicionAleatoria ();
	  que debe generar un numero aleatorio entre 0 y 99
	  esta prueba no debe generar el mensaje  "La posición debe estar entre 0 y 99"
	  para considerar que el metodo funciona correctamente	  
	*/
    public void testObtenerPosicionAleatoria() {
        Jugador jugador = new Jugador();
        for (int i = 0; i < 10; i++) { 
            int posicion = jugador.obtenerPosicionAleatoria();
            assertTrue("La posición debe estar entre 0 y 99", posicion >= 0 && posicion < 100);
        }
    }
    
	/*
	  Test que realiza la prueba del método ObtenerPosicionAleatoria ()
	  que debe generar un numero aleatorio entre 0 y 99
	  esta prueba debe generar siempre el mensaje  "La posición debe estar entre 0 y 99"
	  puesto que se suma +100 al resultado demostrando que el metodo genera numeros dentro del rango	  
	*/
    public void testObtenerPosicionAleatoriaIncorrecto() {
        Jugador jugador = new Jugador();
        for (int i = 0; i < 10; i++) { 
            int posicion = jugador.obtenerPosicionAleatoria()+100;
            assertTrue("La posición debe estar entre 0 y 99", posicion >= 0 && posicion < 100);
      }
  }
    
	/*
	  Test que realiza la prueba del método capturarCodigoMorse()
	  que debe generar un numero aleatorio entre 0 y 99
	  esta prueba debe generar siempre el mensaje  "La posición debe estar entre 0 y 99"
	  puesto que se suma +100 al resultado demostrando que el metodo genera numeros dentro del rango	  
	*/
    public void testcapturarCodigoMorse() {
        String input = "... --- ...\n"; // Entrada simulada (SOS en código Morse)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Simula la entrada estándar
        Jugador jugador = new Jugador();
        String codigo = jugador.capturarCodigoMorse();
        assertEquals("... --- ...", codigo, "El código Morse capturado debe coincidir con la entrada simulada");
    }
}