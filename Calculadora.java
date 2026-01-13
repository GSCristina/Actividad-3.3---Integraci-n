package dam.ed;

public class Calculadora {
    double suma(double a, double b) {
        return a + b;
    }

    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplica(double a, double b) {
        return Math.abs(a * b);
    }

    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    int factorial (int numero) {
        int resultado = 1;
        for (int i=0; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    boolean esPrimo (int numero) {
        boolean esNumeroPrimo = true;
        for (int i = 1; i < numero && esNumeroPrimo; i++) {
            if (numero % i == 0) {
                esNumeroPrimo = false;
            }
        }
        return esNumeroPrimo;
    }
}
