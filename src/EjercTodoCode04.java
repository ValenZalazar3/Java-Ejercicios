// !Consigna: 
// En tres vectores diferrentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la pricincia de Misiones. En el primer vecto se guardan los nombres de las ciudades, en el segundo las tempreaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última semana. Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la tempratura mas baja y cual con la tempratura más alta(dando a conocer al mismo tiempo la cantidad de grados),

// Oberá 16 --29
// Posadas 18 --32
// LN Alem 15 --28

import java.util.Scanner;

public class EjercTodoCode04 {

    public static final Scanner scanner = new Scanner(System.in);
    public static final Scanner scanner2 = new Scanner(System.in);
    public static void main(String[] args) {
        //creación de variables
        String ciudades[] = new String[3];

        double minima[]= new double[3];
        double maxima[]= new double[3];

        double temperaturasMinimas = 10000;
        double temperaturasMaximas = -10000;
        String ciudadesfinalesMinimas = "";
        String ciudadesfinalesMaximas= "";

        //asignación de valor a los arrays
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la ciudad: ");
            ciudades[i] = scanner.nextLine();
            System.out.println("Ingrese la minima: " );
            minima[i] = scanner2.nextDouble();
            System.out.println("Ingrese la maxima: ");
            maxima[i] = scanner2.nextDouble();
            
            scanner.nextLine();

            
        }

        // logica para ver temps maximas y minimas, mas las ciudades
        for (int j = 0; j < 3; j++) {
            
            if (temperaturasMinimas > minima[j]) {
                temperaturasMinimas = minima[j];
                ciudadesfinalesMinimas = ciudades[j];
            }
            if (temperaturasMaximas < maxima[j]) {
                temperaturasMaximas = maxima[j];
                ciudadesfinalesMaximas = ciudades[j];
            }
        }
        System.out.println("La ciudad con menor temperatura fue de: " + ciudadesfinalesMinimas + " " + temperaturasMinimas);
        System.out.println("La ciudad con mayor temperatura fue de: " + ciudadesfinalesMaximas + " " + temperaturasMaximas);
        
        
        






    }
}
