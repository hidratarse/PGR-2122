package p13_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P13_5b {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static List <String> listaAutores = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try (FileReader fAutor=new FileReader("C:/Users/migue/Desktop/biblio.txt")){
			BufferedReader br =new BufferedReader(fAutor);
			RandomAccessFile randomF = new RandomAccessFile("C:/Users/migue/Desktop/bitconnect.txt","rw");
			
			int nl=escritura(br, randomF);
			
			leer(randomF);
			System.out.println("El fichero tiene "+(nl+1)+" lineas");
			
			Autor[] autores=new Autor[nl];
			
			generarObj(randomF, autores);
			
			generarListado(autores);
			
			//FileReader fAutor2=new FileReader("C:/Users/migue/Desktop/biblio.txt");
			//BufferedReader br2 =new BufferedReader(fAutor2);
			//volcar autores a un arraylsit
			
			//volcarALista(br2);
			
			volcarALista(randomF);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		} catch (IOException e1) {
			System.out.println("Error de entrada/salida");
		}
	}

	private static void volcarALista(RandomAccessFile randomF) {
		try {
			int cont=0;
			randomF.seek(0);
		while(true) {
			String linea =Integer.toString(randomF.readInt())
					+randomF.readUTF()
					+randomF.readUTF()
					+randomF.readUTF();
			listaAutores.add(linea);
			System.out.println(listaAutores.get(cont)+" INSERTADO");
			cont++;
		}
		} catch (IOException e) {
			System.out.println("");
		}
		
		
	}

	/*public static void volcarALista(BufferedReader br) throws IOException {
		int cont = 0;
		String linea=br.readLine();
		while (linea!=null) {
			listaAutores.add(linea);
			System.out.println("Se añadió "+listaAutores.get(cont));
			cont++;
			linea=br.readLine();
		}
	}*/

	public static void generarListado(Autor[] autores) throws IOException {
		System.out.println("Introduce la nacionalidad a listar");
		//String busc=sc.next();
		String busc="\"Britanica\"";
		System.out.println(busc);
		FileWriter esc =new FileWriter("C:/Users/migue/Desktop/listadoBritanico.txt");
		esc.write("LISTADO DE AUTORES DE NACIONALIDAD "+busc+"\n"
				+ "CODIGO\t\tNOMBRE\t\tAPELLIDO\t\tNACIONALIDAD"
				+ "\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < autores.length; i++) {
			if (autores[i].getNacionalidad().equals(busc)) {
				esc.append(Integer.toString(autores[i].getCodigo())+"\t\t"+autores[i].getNombre()
						+"\t"+autores[i].getApellidos()+"\t\t"+autores[i].getNacionalidad()+"\n");
			}
		}
		esc.close();
	}

	public static void generarObj(RandomAccessFile randomF, Autor[] autores) throws IOException {
		randomF.seek(0);
		for (int i = 0; i < autores.length; i++) {
			autores[i]=new Autor();
			autores[i].setCodigo(randomF.readInt());
			autores[i].setNombre(randomF.readUTF());
			autores[i].setApellidos(randomF.readUTF());
			autores[i].setNacionalidad(randomF.readUTF());
			System.out.println(autores[i].toString());
		}
	}

	private static void leer(RandomAccessFile randomF) {
		try {
			randomF.seek(0);
		while(true) {
			System.out.print(randomF.readInt());
			System.out.print(randomF.readUTF());
			System.out.print(randomF.readUTF());
			System.out.print(randomF.readUTF());
			System.out.println();
		}
		} catch (IOException e) {
			System.out.println("");
		}
	}

	public static int escritura(BufferedReader br, RandomAccessFile randomF) throws IOException {
		int codigo;
		int cont=0;
		String linea=br.readLine();
		while (linea!=null) {
			String lectura[]=linea.split(";");
			codigo=Integer.parseInt(lectura[0]);
			randomF.seek((codigo-1)*45);
			randomF.writeInt(codigo);
			randomF.writeUTF(lectura[1]);
			randomF.writeUTF(lectura[2]);
			randomF.writeUTF(lectura[3]);
			cont++;
			linea=br.readLine();
		}
		return cont;
	}
}
	//COMO SE DETERMINA LOS BYTES?
	//BORRAR CON ITERADOR SI EL TAMAÑO CAMBIA
	//buffered reade??????