package clase_date;

import java.util.*;

public class GregorianoDemo
{
        public static void main(String args[])
        {
        String meses[] = { "Ene", "Feb", "Mar", "Abr", "May", "Jun",
                "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
        int anyo;

        GregorianCalendar gcalendario = new GregorianCalendar();

        System.out.print("Fecha: ");
        System.out.print(gcalendario.get(Calendar.DATE));
        System.out.print(" " + meses[gcalendario.get(Calendar.MONTH)]
                         + " ");
        System.out.println(anyo = gcalendario.get(Calendar.YEAR));
        System.out.print("Hora: ");
        System.out.print(gcalendario.get(Calendar.HOUR) + ":");
        System.out.print(gcalendario.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendario.get(Calendar.SECOND));

        if (gcalendario.isLeapYear(anyo))
        {
                System.out.println("El año actual es bisiesto");
        } else {
                System.out.println("El año actual no es bisiesto");
        }
        }
}
