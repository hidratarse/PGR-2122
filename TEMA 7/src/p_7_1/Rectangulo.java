package p_7_1;

public class Rectangulo {
	
	int base, altura, area, perimetro;
	String signo;
	
	//Métodos
	public void pintar() {
		for (int i=0; i <altura; i++) {
            for (int j=0; j<base; j++) {
                if (i == 0||i==altura-1||j==0||j==base-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
	}
	
	public void pintarSigno() {	
		for (int i=0; i <altura; i++) {
            for (int j=0; j<base; j++) {
                if (i == 0 || i==altura-1|| j==0 || j==base-1)
                    System.out.print(signo+" ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
	}
	
	public void invertir() {
		for (int i=0; i <base; i++) {
            for (int j=0; j<altura; j++) {
                if (i == 0 || i==base-1|| j==0 || j==altura-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
		}
	}
	
	public void centrarHorizontal() {
		for (int i=0; i <altura; i++) {
			for(int b=0; b<80-base/2; b++) System.out.print(" ");
            for (int j=0; j<base; j++) {
                if (i == 0||i==altura-1||j==0||j==base-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
	}
	
	public void centrarPantalla() {
		for(int a=0; a<(24-altura)/2; a++)System.out.println();
		for (int i=0; i <altura; i++) {
			for(int b=0; b<(80-base)/2; b++) System.out.print(" ");
            for (int j=0; j<base; j++) {
                if (i == 0||i==altura-1||j==0||j==base-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
	}
	
	public int calcularArea() {
		area=base*altura;
		return area;
	}
	
	public int calcularPerimetro() {
		perimetro=(2*base)+(2*altura);
		return perimetro;
	}
}
