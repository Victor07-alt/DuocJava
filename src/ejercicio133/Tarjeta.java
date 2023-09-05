/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio133;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Totto
 */
public class Tarjeta {
    private int codigo,clave,monto,codigoTarjeta;
    private String vigencia;
   private Trabajador trabajador;

    public Tarjeta() {
    }

    public Tarjeta(int codigo, int clave, int monto, String vigencia, String trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
       
    }
    
   

    public int getCodigo() {
        return codigo;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        
        this.vigencia = vigencia;
    }


    @Override
    public String toString() {
        return "Tarjeta{" + "codigo=" + codigo + ", clave=" + clave + ", monto=" + monto + ", codigoTarjeta=" + codigoTarjeta + ", vigencia=" + vigencia + ", trabajador=" + trabajador + '}';
    }
    
Scanner leer = new Scanner(System.in);


//♦	Un método que genere un código correlativo de la tarjeta de 16 dígitos.
public void generarCodigoTarjeta() {
        Random random = new Random();
        StringBuilder codigoTarjeta = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            int digito = random.nextInt(10); // Genera un número aleatorio entre 0 y 9
            codigoTarjeta.append(digito);
        }
        System.out.println(codigoTarjeta);
          
    }
 // ♦	Un método que valide la clave del trabajador, siendo ésta los 4 primeros dígitos del run.




//♦	Un método que permita validar si el monto cubre la compra que se desea realizar.

public void validaCompra(){
    System.out.println("Ingrese monto de la Compra: ");
    int compra;
    compra = leer.nextInt();
    if (this.getMonto()>= compra){
        System.out.println("Compra realizada por : "+compra);
        monto = monto-compra;
        System.out.println("Saldo restante en Tarjeta: "+monto);
    }else{System.out.println("Monto Excede el Maximo de su Tarjeta: "+monto);
    }   
}
}

//♦	Un método que permita descontar del monto de la tarjeta el valor de la compra realizada.





//♦	Un método que valide si la tarjeta está vigente.
//public static String validarFecha(){
 ///   Date fechaActual = new Date();
  ///  SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    



   
    



