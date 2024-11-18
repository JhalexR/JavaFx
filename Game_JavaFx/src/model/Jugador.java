package model;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
  Clase Jugador: Es la lógica del jugador dentro del juego.
  Clase extendida de la clase Inicio.
  Da inicio a la partida con la traducción de palabras a 
  código Morse y maneja el puntaje.
*/
public class Jugador extends Inicio {	
	protected int puntaje;
	protected String codigoMorse;
	protected boolean juegoActivo;
	protected static String [][] listaLetras; 
	protected static String [][] listaPalabras; 
		
	Scanner scanner = new Scanner(System.in);
	
    /**
     Método principal referente para el jugador.
     Carga las listas de letras y palabras, 
     comienza la partida mostrando las reglas iniciales
     @param letrasM Matriz con las letras y sus códigos Morse.
     @param palabrasM Matriz con las palabras y sus códigos Morse.
    */
	public void jugar (String letrasM[][], String palabrasM[][]) {	
		segundos = 60;
		puntaje = 0;
		codigoMorse ="";			
		juegoActivo = true;
		listaLetras = new String [27][2];
		listaPalabras = new String [100][2];
		
		for(int j=0; j<2; j++) {
			for(int i=0; i<27; i++) {
				listaLetras[i][j] = letrasM[i][j];
			}
		}
		
		for(int j=0; j<2; j++) {
			for(int i=0; i<100; i++) {
				listaPalabras[i][j] = palabrasM[i][j];
			}
		}
		
		mostrartablaLetras();
		iniciarConteoRegresivo (segundos);	
		iniciarPartida ();		
		scanner.close();
	}
	
    /**
     Método que muestra la tabla de letras y su traducción a código Morse.
    */
	public void mostrartablaLetras () {			
		for(int i=0; i<27; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(listaLetras[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println();
	}
	
    /**
      Método que inicia un conteo regresivo desde 60.
      Cuando el tiempo se agota, el juego finaliza automáticamente.
      @param tempo Tiempo límite en segundos.
    */
	public void iniciarConteoRegresivo (int tempo) {	
		
        Timer temporizador = new Timer();
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {                
                juegoActivo = false;
                System.out.println("\n¡Tiempo agotado!");
                temporizador.cancel();
        		finalizarPartida ();
            }
        }, tempo * 1000);

	}
	
    /**
      Método con la lógica de la partida. 
      Presenta palabras aleatorias de la lista al jugador,
      evalúa las respuestas y actualiza el puntaje.
    */
	public void iniciarPartida () {	
		while (juegoActivo) {			
			int posicion = obtenerPosicionAleatoria();
			System.out.println("\nLa palabra a traducir es :");
			System.out.println(listaPalabras[posicion][0]);						
			codigoMorse = capturarCodigoMorse();
			if(compararCodigos(codigoMorse, posicion)) {
				puntaje = puntaje+10;				
				System.out.println("\nCodigo Morse Correcto");
				System.out.println("Se suman puntos +10 puntos");
			}
			else {
				System.out.println("\nCodigo Morse Incorrecto");
				System.out.println("No se suman puntos");
			}
		}
	}
	
    /**
     Método que obtiene una posición aleatoria dentro de la lista de palabras.
     @return Un número entero que representa la posición aleatoria.
    */
	public int obtenerPosicionAleatoria () {		
		Random random = new Random();
		return random.nextInt(100);		
	}
	
    /**
     Método que captura el código Morse ingresado por el jugador.
     @return Una cadena de caracteres con el código ingresado por el jugador.
    */
	public String capturarCodigoMorse () {	
		System.out.println("Escriba el codigo Morse de la palabra:");
		return scanner.nextLine();		
	}
	
    /**
      Método que compara el código Morse ingresado por el jugador con el código esperado.
      @param codigo Código Morse ingresado por el jugador.
      @param fila Fila de la la lista de palabras donde está la palabra actual.
      @return True si el código coincide, False si el código No coincide.
    */
	public boolean compararCodigos (String codigo, int fila) {
		return  listaPalabras[fila][1].equalsIgnoreCase(codigo);
	}
	
    /**
     Método que finaliza la partida de juego y muestra el puntaje final.
    */
	public void finalizarPartida () {
		System.out.println("\n¡Su puntaje fue de!\n");
		System.out.println(puntaje);
		System.out.println("\nPresione enter para finalizar\n");
		scanner.nextLine();
	}

}