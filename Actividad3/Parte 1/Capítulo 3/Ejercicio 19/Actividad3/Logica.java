
package Actividad3;

public class Logica {
    public static double area_triangulo(double lado){
        double area = Math.pow(lado, 2) * Math.pow(3, 0.5) / 4;
        return area;
    }
    public static double perimetro_triangulo(double lado){
        double perimetro = lado*3;
        return perimetro;
    }
    public static double altura_triangulo(double lado){
        double altura = lado * Math.pow(3, 0.5) / 2;
        return altura;
    }
}
