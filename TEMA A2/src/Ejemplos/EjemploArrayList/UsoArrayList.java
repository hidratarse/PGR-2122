package Ejemplos.EjemploArrayList;


import  java.util.ArrayList ;
import  java.util.Scanner ;

/*
  * PROGRAMA DE EJEMPLO DE USO DE LA CLASE ARRAYLIST, QUE SIMULA UNA SENCILLA AGENDA DE CONTACTOS
*/

public class UsoArrayList {
		// Declaramos estas dos referencias como estáticas, para poder usarlas en todos los métodos
		static Scanner  sc=  new Scanner(System . in);
		public static ArrayList < Persona > listaPersonas =  new ArrayList<>();

		public static void main(String[] args) {

			// Inicializamos la lista y la lectura por teclado
			//ArrayList < Persona >listaPersonas =  new  ArrayList<>();
			

			int opcion;
			do {
				// Al inicio de cada iteración mostramos el menú, y recogemos la opción
				menu();
				opcion =  Integer.parseInt (sc.nextLine());

				switch (opcion) {
				case  1 :
					listarPersonas ();
					break;
				case  2 :
					añadirPersona ();
					break;
				case  3 :
					eliminarPersona ();
					break;
				case 4 :
					eliminarTodas ();
					break;

				default :
					System.out.print( " Opción no válida. Introducir una opción válida, por favor. " );
				}

			} while (opcion !=  0 );
			sc . next();
		}

		/*
		 * MENÚ
		 */
		 public static void menu () { 
			System.out.print( " AGENDA DE CONTACTOS " );
			System.out.print ( " =================== " );
			System.out.println ( " 1. Listar todos los contactos ");
			System.out.println ( " 2. Añadir un contacto " );
			System.out.println ( " 3. Eliminar un contacto " );
			System.out.println ( " 4. Eliminar todos los contactos ");
			System.out.println ( " 0. Salir del programa \n \n ");
			System.out.println ( " Introduzca una opción: " );
		}

		/*
		 * MÉTODO QUE LISTA TODOS LOS CONTACTOS DE LA AGENDA
		 * O MUESTRA UN MENSAJE SI NO HAY NINGUNO QUE MOSTRAR
		 */
		 public static  void listarPersonas() {
			if (listaPersonas.isEmpty()) {
				System.out.println( " La agenda no tiene contactos \n " );
			} else {
				for ( int i =  0 ; i<listaPersonas.size(); i ++ ) {
					Persona p = listaPersonas.get(i);
					System.out.printf( " %d %s %s (%s)%n " , i, p.getNombre(), p.getApellidos(), p.getTelefono());
				}
				System.out.println( " " );
			}
		}

		/*
		 * MÉTODO QUE RECOGE LOS DATOS DEL USUARIO
		 * PARA AÑADIR UNA NUEVA PERSONA, Y LA INSERTA EN LA LISTA
		 */
		public  static  void  añadirPersona () {
			System.out.println( " \n \n AÑADIR NUEVO CONTACTO " );
			System.out.println( " Introduzca el nombre: " );
			String nombre = sc.nextLine();
			System.out.println( " Introduzca los apellidos: " );
			String apellidos = sc.nextLine();
			System.out.println( " Introduzca su número de teléfono: " );
			String telefono = sc.nextLine();

			listaPersonas.add(new  Persona(nombre, apellidos, telefono));
			
			System.out.println( " " );			
		}

		/*
		 * MÉTODO QUE ELIMINA UNA PERSONA DE LA AGENDA
		 * EN FUNCIÓN DE UNA POSICIÓN RECOGIDA DEL TECLADO
		 */
		public  static  void  eliminarPersona() {
			System.out.println( " \n \n ELIMINAR CONTACTO " );
			System.out.println( " Ingrese la posición del contacto: " );
			int posicion=  Integer.parseInt(sc.nextLine ());
			if (posicion<0  || posicion>=listaPersonas.size()) {
				System.out.println( " Posición erronea " );
			} else {
				System.out.println( " ¿Está usted seguro de querer eliminar el contacto? (S / N): " );
				String siono = sc.nextLine();
				if (siono.equalsIgnoreCase ( " S " )) {
					listaPersonas.remove(posicion);
				}
			}
			System.out.println( " " );


		}

		/*
		 * MÉTODO QUE ELIMINA TODOS LOS CONTACTOS DE LA AGENDA
		 * PREVIA CONFIRMACIÓN DE LA OPERACIÓN
		 */
		public  static  void  eliminarTodas() {
			System.out.println( " \n \n ELIMINAR CONTACTO " );
			System.out.println( " ¿Está usted seguro de querer eliminar el contacto? (S / N): " );
			String siono = sc.nextLine();
			if (siono.equalsIgnoreCase( "S" )) {
				listaPersonas.clear();
			}
			System.out.println( " " );

		}

	}


