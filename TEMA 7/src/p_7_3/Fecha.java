package p_7_3;

public class Fecha {
	//Atributos
	int dia, mes, año;
	
	//Constructores
	public Fecha(){}
	public Fecha(int dia, int mes, int año){
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}
	//Métodos
	public boolean saberBisiesto(int año) {
		boolean bisiesto;
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			bisiesto=true;
			return bisiesto;
		}else {
			bisiesto=false;
			return bisiesto;
		}
	}

	 public int tiempoTranscurrido(int diaRef, int mesRef, int añoRef){
			//Dias transcurridos desde el 1/1/1 hasta la fecha del objeto.
			int dias1,dias2;
			dias1=(año-1)*360+(mes-1)*30+dia;
			dias2=(añoRef-1)*360+(mesRef-1)*30+diaRef;
			int dias=Math.abs(dias1-dias2);
	        return dias;
	    }
	
    /*public String cadenaFecha (){
		String cadena = "";
		return String.format("%02d/%02d/%04d",dia,mes,año);
			
    }*/
}
