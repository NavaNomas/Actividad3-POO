
package Actividad3;

public class Logica {
    public static String soluciones (double a, double b, double c){
        if((Math.pow(b,2)-4*a*c)>=0){
            if ((Math.pow(b,2)-4*a*c)==0) {
                double solucion = -b / (2*a);
                return "El sistema tiene una solución ("+solucion+")";
            }
            else{
                double x1 = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5)) / (2*a) ;
                double x2 = (-b - Math.pow(Math.pow(b,2)-4*a*c,0.5)) / (2*a) ;
                return "El sistema tiene dos soluciones ("+x1+","+x2+")";
            }    
        }  
        return "El sistema no tiene soluciones reales";
 
    }
}
