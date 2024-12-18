package model;

/*
  Autor: John Alexander Penaloza Rojas
  Institucion Universitaria Politecnico Grancolombiano 
  Modulo: Paradigmas de programacion - Segundo semestre 2024
  Grupo: B01 - subgrupo: 19
  fecha: 11/11/2024
 
*/

/**
  * Clase Inicio que hereda de la clase Juego.
  * Esta clase inicializa las tablas de letras y palabras desde la clase Juego
  * y muestra las instrucciones del juego. 
  * Actua como el punto de entrada principal del programa.
*/
public class Inicio extends Juego {
	
	protected static String [][] letras;
	protected static String [][] palabras;
	
    /**
      Metodo Constructor de la clase Inicio.
      Inicializa las tablas de letras y palabras copiando los datos de
      la clase Juego despues de llamarlo mediante su metodo iniciar().
   */
	public Inicio(){
		
		Juego juego1 = new Juego();
		juego1.iniciar();
		
		letras = new String [27][2];
		palabras = new String [100][2];
		
		for(int j=0; j<2; j++) {
			for(int i=0; i<27; i++) {
				letras[i][j] = juego1.tablaLetras[i][j];
			}
		}
		
		for(int j=0; j<2; j++) {
			for(int i=0; i<100; i++) {
				palabras[i][j] = juego1.tablaPalabras[i][j];
			}
		}
	}	
	
    /**
      Metodo para mostrar las instrucciones del juego al usuario.
      Explicacion basica de como jugar.
    */
	public void MostrarInstrucciones () {				
		System.out.println("El juego consiste en digitar el Codigo Morse de la palabra ");
		System.out.println("que aparece en el centro, usando como guia la tabla con la traduccion");
		System.out.println("el codigo morse solo usa los simbolos ( . ) y ( - )");
		System.out.println("se debe digitar el Código Morse sin espacios y al terminar la traducción");
		System.out.println("se debe presionar (enter) para pasar a la siguiente palabra ");				
	}
	
    /**
     Metodo principal del programa.
     Inicia una partida del juego, muestra las instrucciones.
     @param args Argumentos de la linea de comandos (no utilizados en este programa).
    */
	public static void main(String[] args) {	
		Inicio partida = new Inicio();		
		partida.MostrarInstrucciones();		

		Jugador Jugador1 = new Jugador(letras, palabras);
		Jugador1.jugar();		
	}
}
