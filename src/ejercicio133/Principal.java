/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio133;

import java.util.Scanner;

/**
 *
 * @author Totto
 */
public class Principal {
    public static void main(String[] args) {
        
        Valida valida = new Valida();
       int monto; 
        boolean flag; //validaciones
        
        Tarjeta tarjeta1 = new Tarjeta ();
        tarjeta1.generarCodigoTarjeta();
        tarjeta1.setVigencia("02-10-2024");
        tarjeta1.setMonto(25000);
        tarjeta1.validaCompra();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejemplo de validador monto : ingrese monto: ");
        monto = leer.nextInt();
        flag = valida.validaMonto();
        do {

        if(flag==false){
            System.out.println("Monto incorrecto:");}
        else{System.out.println("Monto correcto:");
            System.out.println(monto);}
            tarjeta1.setMonto(monto);
            System.out.println(tarjeta1.getMonto());
        } while (false);
           
    }  
    }