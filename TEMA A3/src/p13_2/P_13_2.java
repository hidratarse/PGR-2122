package p13_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P_13_2 {
	public static void main(String[]args) throws IOException {
		
		try(FileInputStream archivo=new FileInputStream("C:/Users/migue/Desktop/joker.jpg");) {
			FileInputStream archivoC=new FileInputStream("C:/Users/migue/Desktop/joker.jpg");
			
			int dato,cont=0,datoV;
			dato=archivo.read();
			datoV=archivoC.read();
			
			boolean bueno=true;
			while((dato!=-1)&&(datoV!=-1) &&bueno==true) {
			//System.out.print("\t"+dato);
				if(dato!=datoV) {
					bueno=false;
					System.out.println((char)datoV);
					System.out.println((char)dato);
					System.out.println("Posición de diferencia :"+cont);
				}
				cont++;	
				dato=archivo.read();
				datoV=archivoC.read();
				
			}
			System.out.println();
			System.out.println("He leido "+cont+" bytes");
			System.out.println(bueno);
			if(bueno) {
				System.out.println("es Comparar bien");
			}else System.out.println("es distinto");
			
			archivoC.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe o no se encuentra en esa ubicacion");
		}catch(IOException e) {
			System.out.println("ERROR DE ENTRADA/SALIDA");
		}
	
	}
}

