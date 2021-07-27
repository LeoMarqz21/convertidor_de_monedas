package Aplicacion01;

import javax.swing.*;
import java.lang.Math;
// import java.lang.Math;


public class Aplicacion02 {
    public static void main(String[] args){
        String opcionSelecionada = "";
        String[] arregloOpciones = {"DOLARES A COLONES", "COLONES A DOLARES", "DOLARES A EUROS", "EUROS A DOLARES", "SALIR"};
        double cantidad, conversion;

        
        while(opcionSelecionada != "SALIR"){

            opcionSelecionada = (String)JOptionPane.showInputDialog(null, "Selecione: ", "Tipo de conversion : ",
             JOptionPane.INFORMATION_MESSAGE,null, arregloOpciones, arregloOpciones[0]);

             //codigo de conversion
             if(opcionSelecionada.equals("DOLARES A COLONES")){
                 cantidad = entrada("$");
                 conversion = Math.round((cantidad * 8.75));
                 MostrarDatos("$","C", cantidad, conversion);
             }
             else if(opcionSelecionada.equals("COLONES A DOLARES")){
                cantidad = entrada("C");
                conversion = Math.round((cantidad / 8.75));
                MostrarDatos("C","$", cantidad, conversion);
            }
             else if(opcionSelecionada.equals("DOLARES A EUROS")){
                cantidad = entrada("$");
                conversion = Math.round((cantidad / 1.18));
                MostrarDatos("$","€", cantidad, conversion);
            }
             else if(opcionSelecionada.equals("EUROS A DOLARES")){
                cantidad = entrada("€");
                conversion = Math.round((cantidad * 1.18));
                MostrarDatos("€","$", cantidad, conversion);
            }
            else if(opcionSelecionada.equals("SALIR")){
                alerta("Vuelve pronto :( porfis...");
            }

            alerta("Gracias por preferirnos :) ... te amamos!");
        }
    }

    //agrega simbolo de moneda de entrada y retorna el numero ya convertido a tipo double
    public static double entrada(String simbolo){
        double resultado = Double.parseDouble(JOptionPane.showInputDialog(null, "Introdusca la cantidad " + simbolo + " a convertir: "));
        return resultado;
    }
 
    //se pasan por parametro los simbolos de las monedas en el dato de tipo cadena
    public static void MostrarDatos(String monedaEntrada,String monedaSalida, double cantidad, double conversion) {
        JOptionPane.showMessageDialog(null, "Ingreso: ("+monedaEntrada+")" + cantidad + "\nSalida: ("+monedaSalida+")" + conversion);
    }

    public static void alerta(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
