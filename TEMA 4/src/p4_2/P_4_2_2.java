package p4_2;
import javax.swing.JOptionPane;

public class P_4_2_2 {
	
	public static void main (String[]args){
			
		int opc=0,cambio;
		boolean exacto;
		
		//Declaración e inicialización de Arrays
		int monedas[]={200,100,50,20,10,5};
		int cantidad[]={20,0,20,20,0,20};	
		String productos[]={"Agua","Refesco","Zumo"};
		int precio[]={50,75,95};
		
		while(opc!=4){
			opc=menu();			
			if (opc!=4) {
				exacto=importeExacto(monedas,cantidad);
				cambio=realizarPago(monedas,cantidad,precio[opc-1])-precio[opc-1];
				
				if(!exacto && cambio!=0) 
					devorverCambio(monedas,cantidad,cambio);
				JOptionPane.showMessageDialog(null, "Aquí tiene su botella de "+productos[opc-1]);
			}
		}
		//Mostrar información de salida 
		
	}
	
	//MÉTODOS
	public static int menu(){
		int op=0;
		String respuesta;
		while (op<=0||op>4){
			respuesta=JOptionPane.showInputDialog("Introduzca una opcion valida\nLISTA DE PRODUCTOS\n1-Agua\n2-Refresco\n3-Zumo\n4-Salir\nElija la opcion");
			op= Integer.parseInt(respuesta);
		}
		return op;
	}
	
	public static boolean importeExacto(int[] m, int[] c) {
		boolean exacto=false;
		int contMonedas=0;
		for(int i=0;i<c.length && exacto==false;i++) {
			if (c[i]==0){
				contMonedas++;
				if (m[i]==5) exacto=true; 
			}
		}	
		if (contMonedas>=2 || exacto==true) {
			exacto=true;
			JOptionPane.showMessageDialog(null, "INTRODUZCA IMPORTE EXACTO\n LA MÁQUINA NO DEVOLVERÁ CAMBIO");
		}
		return exacto;
	}
	
	public static int realizarPago(int[] m,int[] c,int precio) {
		int dineroPagado=0;
		int pago;
		do {
			
			pago=(int)(100*Double.parseDouble(JOptionPane.showInputDialog("Introduzca moneda en euros:")));
			int i=0;
			boolean encontrado=false;
			while (i<m.length && !encontrado) {
				if(pago==m[i]) {
					encontrado=true;
					c[i]++;
					dineroPagado+=pago;
				}
				i++;
			}			
		}while(dineroPagado<precio);
		return dineroPagado;			
	}
	
	public static void devorverCambio(int[] m,int[] c,int cambio) {
		do {
			for(int i=0;i<m.length && cambio>0 ;i++) {
				while(m[i]<=cambio && c[i]>0) {
					if(c[i]!=0) {
						c[i]--;
						cambio-=m[i];
						System.out.println("Moneda devuelta:"+(m[i]/(float)100)+" euros");
						}
					}				
				}				
			}while(cambio!=0);			
		}
}	
		
		