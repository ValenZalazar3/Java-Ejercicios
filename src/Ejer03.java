import java.util.Scanner;

public class Ejer03 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

      String nombre1;
      String nombre2;
      double aporte1;
      double aporte2;

      double porcentajeAportado1;
      double porcentajeAportado2;

      double totalAportado;

      System.out.println("Ingrese su nombre: ");
      nombre1 = scanner.nextLine();

      System.out.println("Ingrese su nombre: ");
      nombre2 = scanner.nextLine();

      System.out.println("Ingrese su aporte: " + nombre1);
      aporte1 = scanner.nextDouble();


      System.out.println("Ingrese su aporte: " + nombre2);
      aporte2 = scanner.nextDouble();

      totalAportado = aporte1 + aporte2;

      // Calculo porcentaje

      porcentajeAportado1 = 100 * aporte1 / totalAportado;
      porcentajeAportado2 = 100 * aporte2 / totalAportado;




      System.out.println("Total aportado: " + totalAportado);

      System.out.println("Porcentaje aportado de: " + nombre1 + " " + porcentajeAportado1) ;
      System.out.println("Porcentaje aportado de: " + nombre2 + " " + porcentajeAportado2) ;



    }
}
