package Ejemplos;

import javax.swing.JOptionPane;

public class Ejemplo5_VariosCatch {

	public static void main(String[] args) {
		int num1, num2;
        // PEDIR DOS NÚMERO POR TECLADO
        // Segunda parte. Pedir datos por teclado
        try{       
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));

            System.out.println("A/B = " + num1/num2);   
        }
        catch(NumberFormatException ex) {
            System.out.println("SE HA PRODUCIDO UN ERROR. USTED NO HA INTRODUCIDO UN NÚMERO ENTERO");
            
            System.out.println("Información que proporciona el método getMessage es ");
            System.out.println(ex.getMessage());           
            
            System.out.println("Información que proporciona el método toString es ");
            System.out.println(ex.toString());   
            
        }
        catch(ArithmeticException ex)        {
            System.out.println("HA INTROUCIDO UN DENOMINADOR CON VALOR 0");
        }
        catch(Exception ex){
            System.out.println("SE HA PRODUCIDO UN ERROR");
            //System.out.println("Información que proporciona el método getName es "+ex.getName());
        }

	}


}
