package model;

import java.io.FileReader;
import java.io.BufferedReader;

public class Juego {
	
	protected String tablaLetras [][];
	protected String tablaPalabras [][];
	protected int segundos;
	
	public void juego () {
		
		segundos = 60;
		
		String texto="";
		
		try {			
			FileReader lector = new FileReader("Letras.txt");
			BufferedReader contenido = new BufferedReader(lector);
			int j = 0;
			for(int i = 0; i<52; i++) {	
				texto = contenido.readLine();
				tablaLetras[i][j] = texto;
				if(i==25) {
					j++;
				}
			}			
		}catch(Exception e) {
			System.out.println("Error al leer");
		}
		
		
		try {			
			FileReader lector = new FileReader("Palabras.txt");
			BufferedReader contenido = new BufferedReader(lector);
			int j = 0;
			for(int i = 0; i<199; i++) {	
				texto = contenido.readLine();
				tablaPalabras [i][j] = texto;
				if(i==99) {
					j++;
				}
			}			
		}catch(Exception e) {
			System.out.println("Error al leer");
		}
	}
	
}
