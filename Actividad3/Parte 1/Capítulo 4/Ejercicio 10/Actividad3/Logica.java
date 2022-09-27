
package Actividad3;

public class Logica {
    public static double matricula (int patrimonio, int estrato){
        if (patrimonio > 2000000 && estrato > 3) {
            return 50000 + patrimonio * 0.03;
        }
        return 50000;
        
    }
}
