package Mientras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
while (con){
    instrucciones;
}
*/

public class Mientras {
    public static void main(String[] args) {
        int numero=1, contador;
        Scanner entrada = new Scanner (System.in);
                
        
        do{
            System.out.println("Intenta adivinar un numero entre 1 a 100: ");
            numero = entrada.nextInt();
            System.out.println("Este es el numero: "+numero);
            
            if (numero < 34){
                System.out.println(" Un poco mas arriba\n");
            }
            else{
                System.out.println("poco mas abajo\n");
            }
            
        }while(numero != 34);
        
        System.out.println("Lo lograste 34 es el numero correct");

    }
}