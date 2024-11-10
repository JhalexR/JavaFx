package model;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
		conteoRegresivo (jugador1.segundos);		
	}
	
	public void conteoRegresivo (int tempo) {
		
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
	
	

}
