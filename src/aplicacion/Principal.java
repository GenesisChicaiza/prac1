package aplicacion;
import java.util.Scanner;
import mates.Matematicas;


/**
 * @author Genesis Chicaiza
 * Clase que contiene el metodo principal para calcular una aproximacion de Pi
 *
 */
public class Principal {
    /**
     * metodo que solicita al usuario la cantidad de pasos para la
     * aproximacion de Pi. Usa la clase
     * Matematicas para realizar el calculo y muestra el resultado.
     * @param args: Argumentos de linea de comandos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de pasos para la aproximacion de Pi: ");
        long pasos = sc.nextLong();

        double aproximacionPi = Matematicas.generarNumeroPiIterativo(pasos);

        System.out.println("Aproximacion de Pi: " + aproximacionPi);
        sc.close();
    }
}