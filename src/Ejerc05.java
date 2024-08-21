import java.util.Scanner;

public class Ejerc05 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        int numero;

        
        System.out.println("Ingresa un numero entero: ");
        numero = scanner.nextInt();
        
        
        
        boolean esDeUnSoloDigito=  (numero < 10) ? true : false;
        boolean esImpar= (numero % 2 == 0) ? false :  true;
        boolean estaEnAmbosGrupos =  (esDeUnSoloDigito && esImpar) ? true : false;
        boolean noEstaEnNingunGrupo= (!esDeUnSoloDigito || !esImpar) ? true : false;

    
        System.out.println("¿Es de un solo digito?" + esDeUnSoloDigito);
        System.out.println("¿Es impar?" + esImpar);
        System.out.println("¿Esta en ambos grupos?" + estaEnAmbosGrupos);
        System.out.println("¿No esta en ningun grupo?" + noEstaEnNingunGrupo);


    }
    
}
