package model;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Jugador extends Juego {
	
	protected int puntaje;
	protected String codigoMorse;

	public void jugar () {
		
		Jugador jugador1 = new Jugador();
		jugador1.segundos = 60;
		puntaje = 0;
		codigoMorse ="";
		conteoRegresivo ();		
	}
	
	public void conteoRegresivo () {
		
		Jugador jugador1 = new Jugador();
		jugador1.segundos = 60;
				
	       new Thread(() -> {
	            while (jugador1.segundos > 0) {
	                try {
	                    Thread.sleep(1000);  // Esperar 1 segundo
	                    jugador1.segundos--;
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	            finalizarJuego();
	        }).jugar();
	}

}
