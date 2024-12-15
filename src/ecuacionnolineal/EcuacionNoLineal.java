
package ecuacionnolineal;

public class EcuacionNoLineal {
  // Aquí definimos la función f(x) = x^2 - 2
    public static double funcion(double x) {
        return x * x - 2;
    }

    public static double derivadaFuncion(double x) {
        return 2 * x;
    }

    public static void main(String[] args) {
        double aproximacionInicial = 1.0; 
        double tolerancia = 0.0001; 
        int maximoIteraciones = 100; 
        int iteracion = 0;

        double nuevaAproximacion; 

        System.out.println("Método de Newton-Raphson para encontrar la raíz de f(x) = x^2 - 2");
        System.out.println("Aproximaciones:");

        do {
           
            nuevaAproximacion = aproximacionInicial - funcion(aproximacionInicial) / derivadaFuncion(aproximacionInicial);

            
            String mensaje = "Iteración " + iteracion + ": x = " + nuevaAproximacion;
            System.out.println(mensaje);

            
            if (Math.abs(nuevaAproximacion - aproximacionInicial) < tolerancia) {
                break;
            }

            
            aproximacionInicial = nuevaAproximacion;
            iteracion++;
        } while (iteracion < maximoIteraciones);

        // Muestra el resultado final
        System.out.println("La raíz encontrada es aproximadamente: " + nuevaAproximacion);
    }

    
}
