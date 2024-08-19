import java.util.Scanner;

public class Ejer04 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int edad;

        char genero;

        int jubilacionHombres = 65;
        int jubilacionMujeres = 60;
        double jubilacionX = 62.5;

        System.out.println("Ingresa tu edad: ");
        edad = scanner.nextInt();

        if(edad == 0 || edad == 100){
            System.out.println("ingresa una edad entre 1 o 99");
            return;
        }

        System.out.println("Ingresa tu género ('F', 'M', 'X'): " );
        genero = scanner.next().toUpperCase().charAt(0);

        if(genero != 'F' && genero != 'M' && genero != 'X' ){
            System.out.println("Solo ingresar F M o X");
            return;
        }


        if (genero == 'F') {
            if (edad >= jubilacionMujeres) {
                System.out.println("Te podrías Jubilar!!");
            } else {
                int mujerTrabajadora = jubilacionMujeres - edad;
                System.out.println("Todavía te faltan " + mujerTrabajadora + " años para jubilarte :(");
            }
        } else if (genero == 'M') {
            if (edad >= jubilacionHombres) {
                System.out.println("Te podrías Jubilar!!");
            } else {
                int hombreTrabajador = jubilacionHombres - edad;
                System.out.println("Todavía te faltan " + hombreTrabajador + " años para jubilarte :(");
            }
        } else if (genero == 'X') {
            if (edad >= jubilacionX) {
                System.out.println("Te podrías Jubilar!!");
            } else {
                double xTrabajadora = jubilacionX - edad;
                System.out.println("Todavía te faltan " + xTrabajadora + " años para jubilarte aproximadamente :(");
            }
        }

    }
}
