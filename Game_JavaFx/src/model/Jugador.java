package model;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Jugador extends Juego {	
	protected int puntaje;
	protected String codigoMorse;
	protected boolean juegoActivo;	
	Jugador jugador1 = new Jugador();
	Scanner scanner = new Scanner(System.in);

	public void jugar () {				
		jugador1.segundos = 60;
		juegoActivo = true;
		puntaje = 0;
		codigoMorse ="";
		iniciarConteoRegresivo (jugador1.segundos);	
		iniciarPartida ();
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
            }
        }, tempo * 1000);

	}
	
	public void iniciarPartida () {		
		while (juegoActivo) {			
			int posicion = obtenerPosicionAleatoria();
			System.out.println(jugador1.tablaPalabras[posicion][0]);
			codigoMorse = capturarCodigoMorse ();
			if(compararCodigos(codigoMorse, posicion)) {
				puntaje = puntaje+10;
			}
		}		
	}
	
	
	public int obtenerPosicionAleatoria () {		
		Random random = new Random();
		return random.nextInt(100);		
	}
	
	
	public String capturarCodigoMorse () {		
		System.out.print("Escriba el codigo Morse de la palabra: ");
		return scanner.nextLine();		
	}
	
	public boolean compararCodigos (String codigo, int fila) {
		return  jugador1.tablaPalabras[fila][0].equalsIgnoreCase(codigo);
	}

}