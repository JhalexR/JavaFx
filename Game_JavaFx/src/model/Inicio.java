package model;

public class Inicio extends Juego {
	
	public void MostrartablaLetras () {			
		for(int i=0; i<26; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(tablaLetras[i][j]+" ");
			}
			System.out.println();
		}	
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(tablaPalabras[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	public void MostrarInstrucciones () {				
		System.out.println("El juego consiste en digitar el Codigo Morse de la palabra ");
		System.out.println("que aparece en el centro, usando como guia la tabla con la traduccion");
		System.out.println("el codigo morse solo usa los simbolos ( . ) y ( - )");
		System.out.println("se debe digitar el Código Morse sin espacios y al terminar la traducción");
		System.out.println("se debe presioanr (enter) para pasar a la siguiente palabra ");				
	}
	

	public static void main(String[] args) {				
		Inicio partida = new Inicio();		
		partida.llenarTablas();
		partida.MostrartablaLetras();
		partida.MostrarInstrucciones();		
		Jugador partida2 = new Jugador();		
		partida2.jugar();		
	}
}
