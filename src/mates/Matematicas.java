package mates;

import java.util.Random;
/**
 * Clase que contiene metodos matematicos para realizar calculo para aproximar el numero Pi.
 * 
 * @author Genesis Chicaiza
 */
public class Matematicas {
     /**
     * Genera una aproximación del numero Pi utilizando el metodo Monte Carlo.
     * 
     * @param pasos: La cantidad de pasos para el calculo.
     * @return Aproximación del numero Pi.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random();
        long puntosDentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                puntosDentroCirculo++;
            }
        }

        return 4.0 * puntosDentroCirculo / pasos;
    }
}