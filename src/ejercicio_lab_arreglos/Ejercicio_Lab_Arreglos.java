/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_lab_arreglos;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Ejercicio_Lab_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int max=0, min=101, sumatoria=0;
        double promedio=0;
        System.out.println("~~~ N O T A S  A L U M N O ~~~");
        
        System.out.println("Ingrese las notas del alumno (Son un minimo de 10 notas y un maximo de 20): ");
        int cantidadnotas = leer.nextInt();
        
        int Nota[]= new int [cantidadnotas];
        
        for(int x=0; x<Nota.length;x++){
            System.out.println("\nIngrese una nota: ");
             Nota[x]=leer.nextInt();
            if(max<Nota[x] ){
            max= Nota[x];
            }
            if (min>Nota[x]){
            min=Nota[x];
            }
            if (Nota[x] <= 0 || Nota[x] >100) {
                System.out.println("Nota no valida ingrese denuevo");
                Nota[x]=0;
                x--;
                
            }
            sumatoria+=Nota[x];
            promedio= sumatoria/cantidadnotas; 
        }
        System.out.println("La nota mayor es de: "+ max);
            System.out.println("La nota menor es de:" + min);
            System.out.println("El promedio es igual a: " +  promedio );
    }
    
}
