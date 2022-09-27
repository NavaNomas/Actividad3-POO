
package Actividad3;

public class Logica {
    public static double[] salario (int horatrabajada, int valorhora, double reten){
        
        double salariobruto = horatrabajada * valorhora;
        double retencion = salariobruto * reten;
        double salarioneto = salariobruto - retencion;
        double[]  salario = {salariobruto, salarioneto};
            
        return salario;
    }
}
