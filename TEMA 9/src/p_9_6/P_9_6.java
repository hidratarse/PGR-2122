package p_9_6;

public class P_9_6 {

	public static void main(String[] args) {
	//---2
		
		//a
		for(String arg:args) System.out.println("Hola "+arg);
		
		//b
		for (int i = 0; i < args.length; i++) {
			String aux;
			if(Integer.parseInt(args[i])>Integer.parseInt(args[i+1])) {
				aux=args[i+1];
				args[i+1]=args[i];
				args[i]=aux;
			}
			System.out.println(args[i]);
		}
		//c
		String usuario="Armin";
		String contrase�a="Arlett";
		
		if (args[0].equals(usuario)&&args[1].equals(contrase�a))System.out.println("Bienvenido");
		else System.out.println("Usuario o contrase�a incorrectos");
	}
	//---1
	public static String saberMedia (String alumno, int...notas) {
		int aCum=0;
		for (int i = 0; i < notas.length; i++) aCum+=notas[i];
		int media=aCum/notas.length;
		return "El alumno "+alumno+" ha obtenido una calificaci�n media de "+media;
	}

}
