import java.util.*;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = 0, m = 0, edades, cont  = 0;
        String sexo = " ";
        System.out.print("ingrese la cantidad de edades que desee: ");
        edades = scanner.nextInt();
        while ( cont != edades){
            System.out.print("ingrese edad ");
            edades = scanner.nextInt();
            
            System.out.print("ingrese el sexo m ó f ");
            sexo = scanner.nextLine();
            
            if (  "m" .equals(sexo) && edades  > 18 ) {
                m = m + 1;
            }
            if ( "m" .equals(sexo) && edades < 18 ){
                h = h ++;
            }
            cont = cont ++;
        }
        System.out.print("la cantidad es: " + edades + cont );

    }
}