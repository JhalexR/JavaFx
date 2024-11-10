package model;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Jugador extends Juego {	
	protected int puntaje;
	protected String codigoMorse;
	protected boolean juegoActivo;	

	public void jugar () {	
		Jugador jugador1 = new Jugador();
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
		Juego jugadorA = new Juego();
		while (juegoActivo) {			
			int posicion = obtenerPosicionAleatoria();
			System.out.println(posicion);
			int a = 0;
			System.out.println(jugadorA.tablaPalabras[posicion][a]);
			codigoMorse = capturarCodigoMorse();
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
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escriba el codigo Morse de la palabra: ");
		return scanner.nextLine();		
	}
	
	public boolean compararCodigos (String codigo, int fila) {
		Jugador jugador1 = new Jugador();
		return  jugador1.tablaPalabras[fila][0].equalsIgnoreCase(codigo);
	}

}