import java.util.Scanner;
import java.util.Vector;

public class EjercicioTodoCode {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        


        Vector<Integer> vector = new Vector<Integer>(15);

        final int CANTIDAD_VECTOR = 15;
        
        int numeros;
        int numerosIngresados = 15;
        int tres = 0;
               

        while(vector.size() < CANTIDAD_VECTOR){
            System.out.println("Ingresa un numero: ");

            numeros = scanner.nextInt();
            
            vector.add(numeros);
            
            numerosIngresados--;

            System.out.println("Faltan " + numerosIngresados + " numeros");

            if (numeros == 3) {
                tres++;
            }
            
        }
        System.out.println("El numero tres fue ingresado " + tres + " veces");
    }
    
}
