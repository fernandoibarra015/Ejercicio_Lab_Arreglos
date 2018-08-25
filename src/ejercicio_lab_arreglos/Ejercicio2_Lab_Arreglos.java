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
public class Ejercicio2_Lab_Arreglos {
    public static void main(String args[]){ 
    Scanner leer =new Scanner(System.in);
    int divisor=1,multiplicador=10,contador=0,resultado=0;
        System.out.println("~~~ D I G I T O S  E N  A R R E G L O ~~~");
        int arreglo[]=new int [10];
        System.out.print("Ingresar un numero entero: ");
        int numeroingresado=leer.nextInt();
         int residuo=numeroingresado;
        while(true){
        if((divisor*10)>numeroingresado){
        break;
        }
        divisor = divisor* multiplicador;
        contador++;
        }
        String Posicion = " "+divisor;
        int PosicionArreglo= 11-Posicion.length();
        for(int z=0;z<10;z++){
        arreglo[z]=-1;
        }
        for(int x=0; x<=contador;x++){
        if(PosicionArreglo<=10){
        resultado=residuo/divisor;
        residuo=numeroingresado%divisor;
        arreglo[PosicionArreglo]=resultado;
        PosicionArreglo++;
        }
        int divisor2=1;
        while(true){
        if((divisor2*10) >=divisor){
        break;
        }
        divisor2=divisor2*10;
        }
        divisor=divisor2;
        }
        for(int y=0;y<10;y++){
            System.out.print(" "+arreglo[y] );
        }
            }
}
