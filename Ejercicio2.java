/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author delfi_000
 */
public class Ejercicio2 {
       private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String ap){
        this.apellido = ap;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setEdad(int e){
        this.edad = e+1;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getDni() {
        return this.dni;
    }
   public void setDni(int r){
       this.dni=r; 
   } 
    
    public static void main(String[] args) {
    int num = 1;
    int i;      
    Ejercicio2 paciente[] = new Ejercicio2[num];
     for(i=0; i<paciente.length; i++){

            paciente[i] = new Ejercicio2();
            paciente[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
            paciente[i].setApellido(JOptionPane.showInputDialog("Ingrese Apellido"));
            paciente[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad(en años)")));
            paciente[i].setDni(Integer.valueOf(JOptionPane.showInputDialog("Ingrese DNI")));


        }
     for(i=0; i<paciente.length; i++){

            JOptionPane.showMessageDialog(null, "Paciente: "+paciente[i].getNombre()+""+paciente[i].getApellido()+", "+paciente[i].getEdad()+" años, DNI N°"+paciente[i].getDni());
    }  
}
}
    

