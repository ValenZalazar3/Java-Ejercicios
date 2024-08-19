import java.util.Scanner;

public class Ejer02 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

      double ancho;
      double largo;
      double resultado;

      double valorMetroCuadrado;
      double valorTotalPropiedad;



      System.out.println("Ingrese ancho de la propiedad: ");
      ancho = scanner.nextDouble();
      System.out.println("Ingrese largo de la propiedad: ");
      largo = scanner.nextDouble();
      System.out.println("Ingrese valor del metro cuadrado de la propiedad: ");
      valorMetroCuadrado = scanner.nextDouble();

        resultado= ancho * largo;
        valorTotalPropiedad = valorMetroCuadrado * resultado;

        System.out.println("Total de la superficie: " + resultado + "m²");
        System.out.println("Precio total de la propiedad: " + valorTotalPropiedad + "USD");


      

    }
}
