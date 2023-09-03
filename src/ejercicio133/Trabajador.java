/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio133;

/**
 *
 * @author Totto
 */
public class Trabajador {
    private int run;
    private String dv,nombreTrabajador;
    

    public Trabajador() {
    }

    public Trabajador(int run, String dv, String nombreTrabajador) {
        this.run = run;
        this.dv = dv;
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "run=" + run + ", dv=" + dv + ", nombreTrabajador=" + nombreTrabajador + '}';
    }
   
   
}
