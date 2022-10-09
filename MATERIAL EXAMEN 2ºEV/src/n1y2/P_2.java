package n1y2;

import java.util.Vector;

public class P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marcas [][]=new int[10][4];
		
		generarArray(marcas);
		
		visualizarTabla(marcas);
		
		Vector<Integer> v =new Vector<Integer>();
		
		for (int i = 0; i < marcas.length; i++) {
			v.addElement(marcas[i][0]-marcas[i][marcas[0].length-1]);
			System.out.print(v.elementAt(i)+"\t");
		}
		
	}

	public static void generarArray(int[][] marcas) {
		for (int i = 0; i < marcas.length; i++) {
			for (int j = 0; j < marcas[i].length; j++) {
				marcas[i][j]=(int)(Math.random()*500);
			}
		}
	}

	public static void visualizarTabla(int[][] marcas) {
		System.out.println("\t\tAño 1\tAño 2\tAño 3\tAño 4");
		for (int i = 0; i < marcas.length; i++) {
			System.out.print("Corredor "+(i+1)+"\t");
			for (int j = 0; j < marcas[i].length; j++) {
				System.out.print(marcas[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
