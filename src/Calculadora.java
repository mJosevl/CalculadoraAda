import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

    String tipoOper = pedirOperacion();
    int numero1 = pedirNumero1();
    int numero2 = pedirNumero2();
    operar(numero1, numero2, tipoOper);
}

    public static int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2; // resultado de la suma
        return resultado;
    }

    public static int restar(int numero1, int numero2) {
        int resultado = numero1 - numero2; // resultado de la resta
        return resultado;
    }

    public static int multiplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2; // resultado de la multiplicación
        return resultado;
    }

    public static double dividir(double numero1, double numero2) {
        double resultado = 0;
        if (numero2 == 0) {
            System.out.println("No es posible dividir por cero");
        } else {
            resultado = numero1 / numero2; // resultado de la división
        }
        return resultado;
    }

    public static String pedirOperacion() { // entradas
        Scanner reader = new Scanner(System.in); // recibo datos del usuario (lector)

        System.out.println("Introduce la operación (+, -, /, *): "); // le indico al usuario qué hacer
        String tipoOperacion = reader.nextLine(); // guarde la entrada del usuario en la variable

        return tipoOperacion;
    }

    public static int pedirNumero1() {
        Scanner reader = new Scanner(System.in); // recibo datos del usuario (lector)
        System.out.println("Ingrese el primer número : "); //instrucción al usuario
        int numero1 = reader.nextInt(); // lea lo que el usuario ingresó
        return numero1; // retorne número 1
    }

    public static int pedirNumero2() {
        Scanner reader = new Scanner(System.in); // recibo datos del usuario (lector)
        System.out.println("Ingrese el segundo número : "); //instrucción al usuario
        int numero2 = reader.nextInt(); // lea lo que el usuario ingresó
        return numero2; // retorne número 2
    }
    public static void operar(int numero1, int numero2, String tipoOperacion) {
        double resultado = 0;
        if (tipoOperacion.equals("+")) {
            resultado = sumar(numero1, numero2);
        } else if (tipoOperacion.equals("-")) {
            resultado = restar(numero1, numero2);
        } else if (tipoOperacion.equals("/")) {
            resultado = dividir(numero1, numero2);
        } else if (tipoOperacion.equals("*")) {
            resultado = multiplicar(numero1, numero2);
        } else {
            System.out.println("Tipo de operación inválida : " + tipoOperacion);
        }
        imprimirResultado(resultado);
    }
    public static void imprimirResultado(double resultadoAMostrar) { // salida al usuario por consola
        System.out.println("El resultado es : " + resultadoAMostrar);
    }

}

