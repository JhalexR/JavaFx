package model;

/**
La clase Juego representa la base del juego.
Inicializa las tablas de letras y palabras y sus respectivas traducciones a codigo Morse 
que son esenciales para la dinamica de juego.
*/
public class Juego {
	
	protected String [][] tablaLetras;
	protected String [][] tablaPalabras;
	protected int segundos;
	
    /**
    Metodo para inicializar el juego. 
    Configura el tiempo inicial y llena las tablas de letras y palabras.
   */
	public void iniciar () {
		segundos = 60;
		llenarTablaLetras ();
		llenarTablaPalabras ();
	}
	
    /**
    Metodo que llena la tabla de letras con cada letra del alfabeto espanol 
    y su traduccion correspondiente en codigo Morse.
   */
	public void llenarTablaLetras () {
		tablaLetras = new String [27][2];
				
		tablaLetras[0][0]="A";
		tablaLetras[1][0]="B";
		tablaLetras[2][0]="C";
		tablaLetras[3][0]="D";
		tablaLetras[4][0]="E";
		tablaLetras[5][0]="F";
		tablaLetras[6][0]="G";
		tablaLetras[7][0]="H";
		tablaLetras[8][0]="I";
		tablaLetras[9][0]="J";
		tablaLetras[10][0]="K";
		tablaLetras[11][0]="L";
		tablaLetras[12][0]="M";
		tablaLetras[13][0]="N";
		tablaLetras[14][0]="Ñ";
		tablaLetras[15][0]="O";
		tablaLetras[16][0]="P";
		tablaLetras[17][0]="Q";
		tablaLetras[18][0]="R";
		tablaLetras[19][0]="S";
		tablaLetras[20][0]="T";
		tablaLetras[21][0]="U";
		tablaLetras[22][0]="V";
		tablaLetras[23][0]="W";
		tablaLetras[24][0]="X";
		tablaLetras[25][0]="Y";
		tablaLetras[26][0]="Z";
		tablaLetras[0][1]=".-";
		tablaLetras[1][1]="-...";
		tablaLetras[2][1]="-.-.";
		tablaLetras[3][1]="-..";
		tablaLetras[4][1]=".";
		tablaLetras[5][1]="..-.";
		tablaLetras[6][1]="--.";
		tablaLetras[7][1]="....";
		tablaLetras[8][1]="..";
		tablaLetras[9][1]=".---";
		tablaLetras[10][1]="-.-";
		tablaLetras[11][1]=".-..";
		tablaLetras[12][1]="--";
		tablaLetras[13][1]="-.";
		tablaLetras[14][1]="--.--";
		tablaLetras[15][1]="---";
		tablaLetras[16][1]=".--.";
		tablaLetras[17][1]="--.-";
		tablaLetras[18][1]=".-.";
		tablaLetras[19][1]="...";
		tablaLetras[20][1]="-";
		tablaLetras[21][1]="..-";
		tablaLetras[22][1]="...-";
		tablaLetras[23][1]=".--";
		tablaLetras[24][1]="-..-";
		tablaLetras[25][1]="-.--";
		tablaLetras[26][1]="--..";
		
	}
	
    /**
     Metodo que llena la tabla de palabras con una lista de palabras 
     cortas y comunes con sus respectivas traducciones al codigo Morse.
    */
	public void llenarTablaPalabras () {
		tablaPalabras = new String [100][2];
		
		tablaPalabras[0][0]="JUEGO";
		tablaPalabras[1][0]="USARA";
		tablaPalabras[2][0]="AMOR";
		tablaPalabras[3][0]="LUZ";
		tablaPalabras[4][0]="VER";
		tablaPalabras[5][0]="QUESO";
		tablaPalabras[6][0]="LOCA";
		tablaPalabras[7][0]="USAR";
		tablaPalabras[8][0]="ZANJA";
		tablaPalabras[9][0]="PEZ";
		tablaPalabras[10][0]="REMO";
		tablaPalabras[11][0]="RIZO";
		tablaPalabras[12][0]="FACIL";
		tablaPalabras[13][0]="ZURDO";
		tablaPalabras[14][0]="PESCA";
		tablaPalabras[15][0]="BOLA";
		tablaPalabras[16][0]="ÑOÑOS";
		tablaPalabras[17][0]="NIÑA";
		tablaPalabras[18][0]="DOS";
		tablaPalabras[19][0]="PAR";
		tablaPalabras[20][0]="KILOS";
		tablaPalabras[21][0]="HIMNO";
		tablaPalabras[22][0]="SOL";
		tablaPalabras[23][0]="CAZAR";
		tablaPalabras[24][0]="OYE";
		tablaPalabras[25][0]="SHOWS";
		tablaPalabras[26][0]="SAL";
		tablaPalabras[27][0]="ORCA";
		tablaPalabras[28][0]="TAZON";
		tablaPalabras[29][0]="PATA";
		tablaPalabras[30][0]="RATA";
		tablaPalabras[31][0]="TIA";
		tablaPalabras[32][0]="MARTE";
		tablaPalabras[33][0]="LULO";
		tablaPalabras[34][0]="LOROS";
		tablaPalabras[35][0]="PASO";
		tablaPalabras[36][0]="PESAR";
		tablaPalabras[37][0]="UÑA";
		tablaPalabras[38][0]="REIR";
		tablaPalabras[39][0]="REY";
		tablaPalabras[40][0]="ESTE";
		tablaPalabras[41][0]="MIXTO";
		tablaPalabras[42][0]="RON";
		tablaPalabras[43][0]="GAS";
		tablaPalabras[44][0]="MUY";
		tablaPalabras[45][0]="HOLA";
		tablaPalabras[46][0]="UVA";
		tablaPalabras[47][0]="KIWIS";
		tablaPalabras[48][0]="LATA";
		tablaPalabras[49][0]="OPACO";
		tablaPalabras[50][0]="SALTA";
		tablaPalabras[51][0]="VINOS";
		tablaPalabras[52][0]="EJE";
		tablaPalabras[53][0]="LECHE";
		tablaPalabras[54][0]="PILA";
		tablaPalabras[55][0]="PALO";
		tablaPalabras[56][0]="RIMA";
		tablaPalabras[57][0]="DUO";
		tablaPalabras[58][0]="EGO";
		tablaPalabras[59][0]="SER";
		tablaPalabras[60][0]="MONO";
		tablaPalabras[61][0]="HULE";
		tablaPalabras[62][0]="PAZ";
		tablaPalabras[63][0]="TOS";
		tablaPalabras[64][0]="ZOMBI";
		tablaPalabras[65][0]="OCA";
		tablaPalabras[66][0]="EXITO";
		tablaPalabras[67][0]="LUNA";
		tablaPalabras[68][0]="CAMA";
		tablaPalabras[69][0]="OLLA";
		tablaPalabras[70][0]="HAWAI";
		tablaPalabras[71][0]="RIE";
		tablaPalabras[72][0]="CARRO";
		tablaPalabras[73][0]="OXIDO";
		tablaPalabras[74][0]="AVE";
		tablaPalabras[75][0]="HILOS";
		tablaPalabras[76][0]="LAGO";
		tablaPalabras[77][0]="NIÑO";
		tablaPalabras[78][0]="OSO";
		tablaPalabras[79][0]="IGLU";
		tablaPalabras[80][0]="UNO";
		tablaPalabras[81][0]="ORO";
		tablaPalabras[82][0]="RAMOS";
		tablaPalabras[83][0]="SEXTO";
		tablaPalabras[84][0]="MAR";
		tablaPalabras[85][0]="DADO";
		tablaPalabras[86][0]="SOY";
		tablaPalabras[87][0]="PERA";
		tablaPalabras[88][0]="MANGO";
		tablaPalabras[89][0]="CLASE";
		tablaPalabras[90][0]="PESO";
		tablaPalabras[91][0]="NEVAR";
		tablaPalabras[92][0]="MITO";
		tablaPalabras[93][0]="BUS";
		tablaPalabras[94][0]="RED";
		tablaPalabras[95][0]="HUMO";
		tablaPalabras[96][0]="MAL";
		tablaPalabras[97][0]="BALON";
		tablaPalabras[98][0]="AÑO";
		tablaPalabras[99][0]="CASA";
		tablaPalabras[0][1]=".---..-.--.---";
		tablaPalabras[1][1]="..-....-.-..-";
		tablaPalabras[2][1]=".------.-.";
		tablaPalabras[3][1]=".-....---..";
		tablaPalabras[4][1]="...-..-.";
		tablaPalabras[5][1]="--.-..-....---";
		tablaPalabras[6][1]=".-..----.-..-";
		tablaPalabras[7][1]="..-....-.-.";
		tablaPalabras[8][1]="--...--..---.-";
		tablaPalabras[9][1]=".--..--..";
		tablaPalabras[10][1]=".-..-----";
		tablaPalabras[11][1]=".-...--..---";
		tablaPalabras[12][1]="..-..--.-....-..";
		tablaPalabras[13][1]="--....-.-.-..---";
		tablaPalabras[14][1]=".--.....-.-..-";
		tablaPalabras[15][1]="-...---.-...-";
		tablaPalabras[16][1]="--.-------.-----...";
		tablaPalabras[17][1]="-...--.--.-";
		tablaPalabras[18][1]="-..---...";
		tablaPalabras[19][1]=".--..-.-.";
		tablaPalabras[20][1]="-.-...-..---...";
		tablaPalabras[21][1]="......---.---";
		tablaPalabras[22][1]="...---.-..";
		tablaPalabras[23][1]="-.-..---...-.-.";
		tablaPalabras[24][1]="----.--.";
		tablaPalabras[25][1]=".......---.--...";
		tablaPalabras[26][1]="....-.-..";
		tablaPalabras[27][1]="---.-.-.-..-";
		tablaPalabras[28][1]="-.---..----.";
		tablaPalabras[29][1]=".--..--.-";
		tablaPalabras[30][1]=".-..--.-";
		tablaPalabras[31][1]="-...-";
		tablaPalabras[32][1]="--.-.-.-.";
		tablaPalabras[33][1]=".-....-.-..---";
		tablaPalabras[34][1]=".-..---.-.---...";
		tablaPalabras[35][1]=".--..-...---";
		tablaPalabras[36][1]=".--......-.-.";
		tablaPalabras[37][1]="..---.--.-";
		tablaPalabras[38][1]=".-.....-.";
		tablaPalabras[39][1]=".-..-.--";
		tablaPalabras[40][1]="....-.";
		tablaPalabras[41][1]="--..-..-----";
		tablaPalabras[42][1]=".-.----.";
		tablaPalabras[43][1]="--..-...";
		tablaPalabras[44][1]="--..--.--";
		tablaPalabras[45][1]="....---.-...-";
		tablaPalabras[46][1]="..-...-.-";
		tablaPalabras[47][1]="-.-...--.....";
		tablaPalabras[48][1]=".-...--.-";
		tablaPalabras[49][1]="---.--..--.-.---";
		tablaPalabras[50][1]="....-.-..-.-";
		tablaPalabras[51][1]="...-..-.---...";
		tablaPalabras[52][1]="..---.";
		tablaPalabras[53][1]=".-...----.";
		tablaPalabras[54][1]=".--....-...-";
		tablaPalabras[55][1]=".--..-.-..---";
		tablaPalabras[56][1]=".-...--.-";
		tablaPalabras[57][1]="-....----";
		tablaPalabras[58][1]=".--.---";
		tablaPalabras[59][1]=".....-.";
		tablaPalabras[60][1]="------.---";
		tablaPalabras[61][1]="......-.-...";
		tablaPalabras[62][1]=".--..---..";
		tablaPalabras[63][1]="----...";
		tablaPalabras[64][1]="--..------.....";
		tablaPalabras[65][1]="----.-..-";
		tablaPalabras[66][1]=".-..-..----";
		tablaPalabras[67][1]=".-....--..-";
		tablaPalabras[68][1]="-.-..---.-";
		tablaPalabras[69][1]="---.-...-...-";
		tablaPalabras[70][1]=".....-.--.-..";
		tablaPalabras[71][1]=".-....";
		tablaPalabras[72][1]="-.-..-.-..-.---";
		tablaPalabras[73][1]="----..-..-..---";
		tablaPalabras[74][1]=".-...-.";
		tablaPalabras[75][1]=".......-..---...";
		tablaPalabras[76][1]=".-...---.---";
		tablaPalabras[77][1]="-...--.-----";
		tablaPalabras[78][1]="---...---";
		tablaPalabras[79][1]="..--..-....-";
		tablaPalabras[80][1]="..--.---";
		tablaPalabras[81][1]="---.-.---";
		tablaPalabras[82][1]=".-..------...";
		tablaPalabras[83][1]="....-..-----";
		tablaPalabras[84][1]="--.-.-.";
		tablaPalabras[85][1]="-...--..---";
		tablaPalabras[86][1]="...----.--";
		tablaPalabras[87][1]=".--...-..-";
		tablaPalabras[88][1]="--.--.--.---";
		tablaPalabras[89][1]="-.-..-...-....";
		tablaPalabras[90][1]=".--.....---";
		tablaPalabras[91][1]="-.....-.-.-.";
		tablaPalabras[92][1]="--..----";
		tablaPalabras[93][1]="-.....-...";
		tablaPalabras[94][1]=".-..-..";
		tablaPalabras[95][1]="......------";
		tablaPalabras[96][1]="--.-.-..";
		tablaPalabras[97][1]="-....-.-..----.";
		tablaPalabras[98][1]=".---.-----";
		tablaPalabras[99][1]="-.-..-....-";
	
	}
}
