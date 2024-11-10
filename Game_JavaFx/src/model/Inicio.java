package model;

import java.util.Scanner;

public class Inicio extends Juego {
	
	public void MostrartablaLetras () {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<52; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(tablaLetras [i][j]+" ");
			}
			System.out.println();
		}	
		System.out.print("Presione 'enter' para continuar");
		scanner.next().charAt(0);
		scanner.close();
	}

	
	public void MostrarInstrucciones () {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("El juego consiste en digitar el Codigo Morse de la palabra ");
		System.out.println("que aparece en el centro, usando como guia la tabla con la traduccion");
		System.out.println("el codigo morse solo usa los simbolos ( . ) y ( - )");
		System.out.println("se debe digitar el Código Morse sin espacios y al terminar la traducción");
		System.out.println("se debe presioanr (enter) para pasar a la siguiente palabra ");
		
		System.out.print("Presione 'enter' para continuar");
		scanner.next().charAt(0);
		scanner.close();
			
	}
	

	public static void main(String[] args) {
				
		Inicio partida = new Inicio();
		
		partida.MostrartablaLetras();
		partida.MostrarInstrucciones();
		
		
	}
}
