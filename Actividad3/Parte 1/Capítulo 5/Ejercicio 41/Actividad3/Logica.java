
package Actividad3;

public class Logica {
    public static int mayor (int[] lis){
        int mayor = 0;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i]>mayor) {
                mayor = lis[i];
            }
        }
        return mayor;
    }
}
