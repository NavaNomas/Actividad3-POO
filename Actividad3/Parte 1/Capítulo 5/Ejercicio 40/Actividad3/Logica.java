
package Actividad3;

public class Logica {
    public static double[][] calculo (double[] lis){
        double[] raices = new double[lis.length];
        double[] cuadrados = new double[lis.length];;
        double[] cubos = new double[lis.length];;
        
        for (int i = 0; i < lis.length; i++) {
            raices[i] = Math.pow(lis[i], 0.5);
            cuadrados[i] = Math.pow(lis[i], 2);
            cubos[i] = Math.pow(lis[i], 3);
        }
            
        double[][] res = {raices,cuadrados,cubos};
        return res;
    }
}
