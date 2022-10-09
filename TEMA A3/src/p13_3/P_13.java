package p13_3;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class P_13 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		int[] array2=new int[50];

		for(int i=0;i<200;i++) {
			array2[1+(int)(Math.random()*49)]+=1;
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		try (RandomAccessFile fichero1=new RandomAccessFile("E:/PROG/Tema13/Ej3.txt","rw")) {
			for (int i = 0; i < array2.length; i++) {
				fichero1.writeInt(array2[i]);
			}
			visualizarFichero(fichero1);
			System.out.println("¿Qué número quieres contar?");
			int dato=sc.nextInt();
			while(dato>0&&dato<50) {
				fichero1.seek(dato*4);
				System.out.println(fichero1.readInt());
				System.out.println("¿Qué número quieres contar?");
				dato=sc.nextInt();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}
		catch(IOException e1) {
			System.out.println("Error de entrada y salida");
		}
	}
	public static void visualizarFichero(RandomAccessFile f) throws IOException {
		f.seek(0);
		f.skipBytes(4);
		int cont=1;
		while(f.getFilePointer()<f.length()) {
			System.out.println("Dato "+cont+": "+f.readInt());
			cont++;
		}
	}
} 