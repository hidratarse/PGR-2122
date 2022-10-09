package repaso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Examen implements Reposo{

	public static void main(String[] args) {
		
		Examen ee =new  Examen();
		
		ee.ei();
		
		String ficheroPartidos = "C:/Users/migue/Desktop/partidos.txt";
		
		ArrayList<Partido> partidos= obtenerPartidos(ficheroPartidos);
		
		partidos.sort(new Comparator<Partido>(){
			@Override
			public int compare(Partido o1, Partido o2) {
				return o1.getEquipoL().compareTo( o2.getEquipoL());
			}});
		
		muestraPartidos(partidos);
		
		ArrayList<Partido> partidosEquipo=obtenerPartidos("Real Betis FC", partidos);
		
		//puntosEquipo("Equipo",partidosEquipo);
		
		serializarPartidos(partidosEquipo);
		Vehiculo ee1= new Vehiculo(ficheroPartidos, null) {
			
			@Override
			public void calculaImporte() {
				// TODO Auto-generated method stub
				
			}
		};	}


	private static void serializarPartidos(ArrayList<Partido> partidosEquipo) {
		try {
			RandomAccessFile equipodat = new RandomAccessFile("C:/Users/migue/Desktop/Equipo.txt","rw");
			Iterator<Partido> iterA=partidosEquipo.iterator();		
			while (iterA.hasNext()){
				Partido partido=iterA.next();
				System.out.println(partido);
				equipodat.writeUTF(partido.getEquipoL());
				equipodat.writeUTF(partido.getEquipoV());
				equipodat.writeInt(partido.getGolesL());
				equipodat.writeInt(partido.getGolesV());
			}
			equipodat.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		}
		
	}


	//private static void puntosEquipo(String string, ArrayList<Partido> partidosEquipo) {}


	private static ArrayList<Partido> obtenerPartidos(String equipo, ArrayList<Partido> partidos) {
		ArrayList<Partido> partidosEquipo=new ArrayList<Partido>();
		Iterator<Partido> iterA = partidos.iterator();
		while (iterA.hasNext()) {
			Partido partido = iterA.next();
			if (partido.getEquipoL().equals(equipo)||partido.getEquipoV().equals(equipo)) {
				partidosEquipo.add(partido);
			}
		}
		return partidosEquipo;
	}


	private static void muestraPartidos(ArrayList<Partido> partidos) {
		Iterator<Partido>iterA= partidos.iterator();
		while (iterA.hasNext()) {
			Partido muestra= iterA.next();
			System.out.println(muestra.getEquipoL()+muestra.getGolesL()+"-"+muestra.getGolesV()+muestra.getEquipoV());
		}
	}

	private static ArrayList<Partido> obtenerPartidos(String ficheroPartidos){
		ArrayList<Partido> partidos =  new ArrayList<Partido>();
		try (FileReader fr = new FileReader(ficheroPartidos);){
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea!=null) {
				String vector[]=linea.split("::");
				partidos.add(new Partido(vector[0],vector[1],Integer.parseInt(vector[2]),Integer.parseInt(vector[3])));
				linea=br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Error de lectura");
		}
		return partidos;	
	}
}
