package hundir_la_flota;

import java.util.Scanner;

public class Flota {

	//Declaración de variables tipo final
	public static final char AGUA='A', AGUA_NO_TOCADO='.',TOCADO='X';
	public static final int TAMANIO=10;
	public static Scanner dato= new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		//Declaración de variables locales al main()
		int puntosJugador, puntosOrdenador,fila,columna;
		puntosJugador=puntosOrdenador=24;
		boolean  disparoCorrecto=false;
		char resultadoDisparo='A';
		
		//Declaración de arrays
		char [][] mapaUsuario = new char[TAMANIO][TAMANIO];
		char [][] mapaOrdenador = new char[TAMANIO][TAMANIO];
		char [][] mapaOrdenadorParaUsuario = new char[TAMANIO][TAMANIO];
		int [] disparo = new int[2];
		
		//Inicializar mapas y registrar barcos
		inicializacionMapa(mapaUsuario);
		inicializacionMapa(mapaOrdenador);
		inicializacionMapa(mapaOrdenadorParaUsuario);
				
		registrarBarcos(mapaUsuario);
		registrarBarcos(mapaOrdenador);
		
		while(puntosOrdenador!=0 && puntosJugador!=0) {
			//Dispara usuario
			System.out.println("\nTU TURNO\n========\n");
			System.out.println("PUNTOS ORDENADOR:"+puntosOrdenador);
			System.out.println("TUS PUNTOS:"+puntosJugador);
			imprimirMapa("MAPA ORDENADOR PARA USUARIO",mapaOrdenadorParaUsuario);
			disparoCorrecto=false;
			while(!disparoCorrecto) {
				disparo=pedirCasilla();
				if(disparo[0]!=-1) {
					  resultadoDisparo=evaluarDisparo(disparo,mapaOrdenador);
					  if(resultadoDisparo=='E')
						  System.out.println("DISPARO NO VÁLIDO");
					  else {
						  disparoCorrecto=true;
						  fila=disparo[0];
					  	  columna=disparo[1];
					  	  mapaOrdenadorParaUsuario[fila][columna]=resultadoDisparo;
					  	  mapaOrdenador[fila][columna]=resultadoDisparo;
					  	  if(resultadoDisparo=='X') puntosOrdenador--;
					  }		
				}else System.out.println("COORDENADAS NO VÁLIDAS");
			}
			System.out.println("PUNTOS ORDENADOR:"+puntosOrdenador);
			imprimirMapa("MAPA ORDENADOR PARA USUARIO",mapaOrdenadorParaUsuario);
			Thread.sleep(3000);			
			if(puntosOrdenador!=0) { 
				//Dispara Ordenador
				System.out.println("\nTURNO DEL ORDENADOR\n===========\n");
				System.out.println("PUNTOS ORDENADOR:"+puntosOrdenador);
				System.out.println("TUS PUNTOS:"+puntosJugador);
				
				disparoCorrecto=false;
				while(!disparoCorrecto) {
					disparo=generarDisparoAleatorio();
					
					  resultadoDisparo=evaluarDisparo(disparo,mapaUsuario);
					  if(resultadoDisparo=='E')
						  System.out.println("DISPARO NO VÁLIDO");
					  else {
						  disparoCorrecto=true;
						  fila=disparo[0];
					  	  columna=disparo[1];
					  	  mapaUsuario[fila][columna]=resultadoDisparo;
					  	  if(resultadoDisparo=='X') puntosJugador--;
					  }		
				
				}
				System.out.println("PUNTOS ORDENADOR:"+puntosOrdenador);
				System.out.println("TUS PUNTOS:"+puntosJugador);
				imprimirMapa("TU MAPA",mapaUsuario);
				Thread.sleep(3000);						
			}
		}
		if(puntosOrdenador==0) System.out.println("ENHORABUENA. HAS GANADO LA PARTIDA");
		else System.out.println("LO SIENTO HA GANADO EL ORDENADOR");
	}
	
	public static int [] pedirCasilla() {
		//Declaración del vector que guardará las coordenadas
		int[] c = new int[2];
		String coordenadas;
		char coordenada1, coordenada2;
		System.out.println("\nIntroduce las coordenadas del disparo:");
		coordenadas=dato.next();
		coordenada1=Character.toUpperCase(coordenadas.charAt(0));
		coordenada2=coordenadas.charAt(1);
		if(Character.getNumericValue(coordenada1)<Character.getNumericValue('A')+TAMANIO && Character.getNumericValue(coordenada2)<Character.getNumericValue('0')+TAMANIO){
			c[0]=Character.getNumericValue(coordenada1)-Character.getNumericValue('A');
			c[1]=Character.getNumericValue(coordenada2)-Character.getNumericValue('0');		
		} else {
			c[0]=-1;
			c[1]=-1;
		}
		return c;
	}
	
	public static char evaluarDisparo(int[] d, char[][] m) {
		int fila,columna;
		fila =d[0];
		columna = d[1];
		if(m[fila][columna]>='1' && m[fila][columna]<='5') return 'X';
		else 
			if(m[fila][columna]==AGUA_NO_TOCADO) return 'A';
			else return 'E';		
	}
	
	public static int[] generarDisparoAleatorio() {
		int[] c = new int[2];
		c[0]=(int)(Math.random()*TAMANIO);
		c[1]=(int)(Math.random()*TAMANIO);
		return c;
	}
	
	public static void inicializacionMapa(char [][] m) {
		for (int f = 0; f < m.length; f++) {
			for (int c = 0; c < m[f].length; c++) {
				m[f][c]	= AGUA_NO_TOCADO;		
			}
		}		
	}
	
	public static void imprimirMapa(String titulo,char [][] m) {
		//char[] letrasCabecera = {'A','B','C',    }
		//Crear vector con las letras de las cabeceras de filas
		char[] letrasCabecera = new char[TAMANIO];
		for (int i = 0; i < TAMANIO; i++) {
			letrasCabecera[i]=(char)('A'+ i);			
		}
		
		//Visualizar el Array
		//Imprimir la 1ª linea de cabecera
		System.out.print("\n"+titulo+"\n    ");
		for (int i = 0; i <TAMANIO; i++) {
			System.out.printf("[%1d] ",i);			
		}
		
		
				
		//Imprimir contenido del array
		for (int i = 0; i <m.length; i++) {
			System.out.printf("\n[%s] ",letrasCabecera[i]);	
			for (int j = 0; j <m[i].length; j++) {
				System.out.printf(" %S  ",m[i][j]);				
			}			
		}		
	}
	
	public static void registrarBarcos(char [][] m) {
		//Declaración de vectores locales al método
		int[] barcos = {5,5,3,3,3,1,1,1,1,1};
		char[] direccion = {'V','H'};
		boolean colocado;
		int fila,columna,dir;
		
		for (int tamanioBarco : barcos) {
			colocado=false;
			while(!colocado) {
				//Generar coordenadas y dirección aleatoriamente
				fila=(int)(Math.random()*TAMANIO);
				columna=(int)(Math.random()*TAMANIO);
				dir=(int)(Math.random()*2);
				
				//Comprobar si el barco cabe a partir de esas coordenadas
				if((direccion[dir]=='V' && (fila+tamanioBarco)<TAMANIO) || (direccion[dir]=='H' && (columna+tamanioBarco)<TAMANIO)) {
					//Comprobar si el barco no choca con otro ya colocado
					boolean vacio=true;
					if (direccion[dir]=='V') {
						int f=0;
						while (f<tamanioBarco && vacio) {
							if(m[fila+f][columna]!=AGUA_NO_TOCADO) vacio=false;								
							else f++;							
						}						
					} else {
						int c=0;
						while (c<tamanioBarco && vacio) {
							if(m[fila][columna+c]!=AGUA_NO_TOCADO) vacio=false;								
							else c++;							
						}					
					}
					if(vacio) {
						//Colocar el barco en estas coordenadas
						for (int i = 0; i < tamanioBarco; i++) {
							if (direccion[dir]=='V') m[fila+i][columna]=Integer.toString(tamanioBarco).charAt(0);	
							else  m[fila][columna+i]=Integer.toString(tamanioBarco).charAt(0);
						}
						colocado=true;						
					}				
				}			
			}
		}
	}
}
