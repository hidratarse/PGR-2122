package p_7_3;

public class Fecha {
	//Atributos
	int dia, mes, a�o;
	
	//Constructores
	public Fecha(){}
	public Fecha(int dia, int mes, int a�o){
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
	}
	//M�todos
	public boolean saberBisiesto(int a�o) {
		boolean bisiesto;
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
			bisiesto=true;
			return bisiesto;
		}else {
			bisiesto=false;
			return bisiesto;
		}
	}

	 public int tiempoTranscurrido(int diaRef, int mesRef, int a�oRef){
			//Dias transcurridos desde el 1/1/1 hasta la fecha del objeto.
			int dias1,dias2;
			dias1=(a�o-1)*360+(mes-1)*30+dia;
			dias2=(a�oRef-1)*360+(mesRef-1)*30+diaRef;
			int dias=Math.abs(dias1-dias2);
	        return dias;
	    }
	
    /*public String cadenaFecha (){
		String cadena = "";
		return String.format("%02d/%02d/%04d",dia,mes,a�o);
			
    }*/
}
