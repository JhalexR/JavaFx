package model;

public class Inicio extends Juego {
	
	protected static String [][] letras;
	protected static String [][] palabras;
	
	public Inicio(){
		
		Juego juego1 = new Juego();
		juego1.iniciar();
		
		letras = new String [26][2];
		palabras = new String [100][2];
		
		for(int j=0; j<2; j++) {
			for(int i=0; i<26; i++) {
				letras[i][j] = juego1.tablaLetras[i][j];
			}
		}
		
		for(int j=0; j<2; j++) {
			for(int i=0; i<100; i++) {
				palabras[i][j] = juego1.tablaPalabras[i][j];
			}
		}
	}	
	
	public void MostrarInstrucciones () {				
		System.out.println("El juego consiste en digitar el Codigo Morse de la palabra ");
		System.out.println("que aparece en el centro, usando como guia la tabla con la traduccion");
		System.out.println("el codigo morse solo usa los simbolos ( . ) y ( - )");
		System.out.println("se debe digitar el Código Morse sin espacios y al terminar la traducción");
		System.out.println("se debe presionar (enter) para pasar a la siguiente palabra ");				
	}
	
	public static void main(String[] args) {	
		Inicio partida = new Inicio();		
		partida.MostrarInstrucciones();		

		Jugador Jugador1 = new Jugador();
		Jugador1.jugar(letras, palabras);		
	}
}
