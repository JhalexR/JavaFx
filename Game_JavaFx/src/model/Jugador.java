package model;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Jugador extends Inicio {	
	protected int puntaje;
	protected String codigoMorse;
	protected boolean juegoActivo;
	protected static String [][] listaLetras; 
	protected static String [][] listaPalabras; 
		
	Scanner scanner = new Scanner(System.in);
	
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
	
	public void mostrartablaLetras () {			
		for(int i=0; i<27; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(listaLetras[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println();
	}
	
	public void iniciarConteoRegresivo (int tempo) {	
		
        Timer temporizador = new Timer();
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                // Cuando el temporizador llega a 0, el juego termina
                juegoActivo = false;
                System.out.println("\n¡Tiempo agotado!");
                temporizador.cancel();
        		finalizarPartida ();
            }
        }, tempo * 1000);

	}
	
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
	
	
	public int obtenerPosicionAleatoria () {		
		Random random = new Random();
		return random.nextInt(100);		
	}
	
	
	public String capturarCodigoMorse () {	
		System.out.println("Escriba el codigo Morse de la palabra:");
		return scanner.nextLine();		
	}
	
	public boolean compararCodigos (String codigo, int fila) {
		return  listaPalabras[fila][1].equalsIgnoreCase(codigo);
	}
	
	public void finalizarPartida () {
		System.out.println("\n¡Su puntaje fue de!\n");
		System.out.println(puntaje);
		System.out.println("\nPresione enter para finalizar\n");
		scanner.nextLine();
	}

}