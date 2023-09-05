package ejercicio133;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Totto
 */
public class Valida {

    public Valida() {
    }
    
  int monto;  
  String dv,nombre;
    
  
  public boolean validaMonto (){
    if (monto > 0){
    return true;}
    else{
            return false;}
    }
    
   
    
public boolean validaDv(int dv) {
    if ((dv >= 0 && dv <= 9) || dv == 'K') {
        return true;
    } else {
        return false;
    }
}


public boolean validaNombre(){
if(nombre != null){return true;}
else {return false;}
}


public static boolean validarDigitoVerificador(char dv) {
        // Comprobamos si es un dígito del 0 al 9 o la letra 'k' (mayúscula o minúscula)
        return (dv >= '0' && dv <= '9') || dv == 'k' || dv == 'K';
    }

public boolean validarDigito(char dv) {
if (dv>='0' && dv <='9' || dv =='k' || dv == 'K')
    return true;
else{
}return false;
}

public boolean ValidaNombre(){
if (nombre != null && !nombre.isEmpty()){
    return true;}
else{}return false;
}
}
