package Aplicacion01;

import javax.swing.*;

public class Aplicacion01 {
    
    public static void main(String[] args){
        System.out.println("Ejecutando Aplicacion01");
        String nombre = "";
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        var pintar = "Hola " + nombre + " Bienvenid@ !!!!";
        JOptionPane.showMessageDialog(null, pintar);
        
        System.out.println(pintar);

        System.out.println("Terminando Ejecución de Aplicacion01");
    }
}
