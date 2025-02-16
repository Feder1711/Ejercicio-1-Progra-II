package src;

public class IntegralRecursiva {

    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        // Caso base: si alcanzamos el límite superior, retornamos 0
        if (limInf >= limSup) {
            return 0;
        }

        // Caso recursivo: sumar el área del rectángulo actual y llamar recursivamente
        return (Math.exp(limInf * limInf) * h) + integralEXCuadrado(limInf + h, limSup, h);
    }

    public static void main(String[] args) {
        double resultado = integralEXCuadrado(0, 1, 0.01);
        System.out.println("Resultado de la integral: " + resultado);
    }
}
