import java.util.Scanner;

public class Ejer01 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

      int num1;
      int num2;
      int result;
      String simbol;
      String message =  "Felicidades su resultado es: ";


      System.out.println("Ingrese su simbolo de operación(+, -, /, *): ");
        simbol = scanner.nextLine();
      System.out.println("Ingrese su primer numero: ");
        num1 = scanner.nextInt();
      System.out.println("Ingrese su segundo numero: ");
      num2 = scanner.nextInt();

      if(simbol.equals("+")){
        result = num1 + num2;
        System.out.println(message + result);
      }
      if(simbol.equals("-")){
        result = num1 - num2;
        System.out.println(message + result);
      }
      if(simbol.equals("/")){
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede poner cero en ningun número!");
           
        }else{

            result = num1 / num2;
            System.out.println(message + result);
        }
      }
      if(simbol.equals("*")){
        result = num1 + num2;
        System.out.println(message + result);
      }

    }
}
