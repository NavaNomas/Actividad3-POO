
package Actividad3;

public class Logica {
    public static String mayormenor (int a, int b){
        if (a == b) {
            return "A es igual a B";
        }
        else
            if(Math.max(a, b) == b){
                return "A es menor que B";  
            }
        return "A es mayor que B";
        
    }
}
