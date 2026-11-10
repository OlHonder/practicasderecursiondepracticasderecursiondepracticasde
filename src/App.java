import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Preparacion de variables
        int[] arregloNumeros;
        List<Integer> arregloLista;
        boolean continuar = true;
        int opcion;
        int tamano;

        System.out.println(
                "\nBienvenido a las practicas de recursion de practicas de recursion de practicas de recursion de practicas de recursion de.........");

        do { // Corremos todo hasta que se decida terminar, multiples opciones correran sin
             // asignacion de metodos externos
             // Opciones de ejercicios disponibles.
            System.out.println("\n\nSeleccione el ejercicio deseado: ");
            System.out.println("1.- Suma de numeros en un arreglo");
            System.out.println("2.- Impresion de datos de un arreglo");
            System.out.println("3.- Convertir de decimal a binario");
            System.out.println("4.- Maximo comun divisor (MCD)");
            System.out.println("5.- Funcion de Akerman");
            System.out.println("6.- Numeros de Catalan");
            System.out.println("7.- Elevar a una potencia un número");
            System.out.println("8.- Busqueda Binaria");
            System.out.println("9.- Sumatoria de elementos en una lista");
            System.out.println("10.- Terminar");

            try {
                opcion = Keyboard.readInt(); // Entrada del usuario
                tamano = (int) (Math.random() * 16); // Queremos un arreglo de tamaño máximo 16, pero aleatorio para
                                                     // demostrar que se implementa recursion sin importar su tamaño
                // System.out.println(tamano);
                arregloNumeros = new int[tamano];
                arregloLista = new ArrayList<>();
                int aleatorio1 = (int) (Math.random() * 256);
                int aleatorio2 = (int) (Math.random() * 256);

                for (int i = 0; i < tamano; i++) {
                    arregloNumeros[i] = (int) (Math.random() * 50); // Valores del arreglo de máximo 50 para introducir
                                                                    // variedad
                    arregloLista.add(arregloNumeros[i]); // Lista de arreglo.
                }

                switch (opcion) {
                    case 1: { // Suma de un arreglo
                        int resultadoSuma = Ejercicios.sumarArreglo(tamano - 1, arregloNumeros);
                        System.out.println();
                        System.out.println("El arreglo de números generado es: "
                                + Ejercicios.imprimirArreglo(tamano - 1, arregloNumeros));
                        System.out.println("El resultado de la suma es: " + resultadoSuma);
                        break;
                    }
                    case 2: { // Impresión de un arreglo
                        String arregloTextual = Ejercicios.imprimirArreglo(tamano - 1, arregloNumeros);
                        System.out.println();
                        System.out.println("El arreglo de numeros generado es: " + arregloTextual);
                        break;
                    }
                    case 3: { // Convertidor decimal a binario
                        String convBinario = "";
                        convBinario = Ejercicios.convertirDecimalBinario(aleatorio1);
                        System.out.println();
                        System.out.println("Numero aleatorio generado es: " + aleatorio1);
                        System.out.println("Su conversión a binario es: " + convBinario);
                        break;
                    }
                    case 4: { // Calculadora de MCD
                        int resultadoMCD = Ejercicios.MCD(aleatorio1, aleatorio2);
                        System.out.println();
                        System.out.printf("Se ha generado un par de números %d y %d de manera aleatoria.\n", aleatorio1,
                                aleatorio2);
                        System.out.println("Su máximo común divisor es: " + resultadoMCD);
                        break;
                    }
                    case 5: { // Función de Ackerman
                        System.out.println("\nSeleccionaste la función de Ackerman, la cuál solicitará una entrada manual para que se pueda controlar la ejecución, parámetros >= 4 se convertirán es una prueba de estrés de memoria.");
                        System.out.println("\nIngrese parámetro m: ");
                        int m = Keyboard.readInt();
                        System.out.println("\nIngrese parámetro n: ");
                        int n = Keyboard.readInt();
                        try {
                            int resultadoAck = Ejercicios.Ackerman(m, n);
                            System.out.println("\nEl resultado de la función es: " + resultadoAck);
                        } catch (StackOverflowError e) {
                            System.out.printf("\nTe acabaste la memoria con eso. %d y %d son muy grandes para este algoritmo.", m, n);  
                        }
                        break;
                    }
                    case 6: { // Números de Catalán
                        System.out.println("\nSeleccionaste los números de Catalán, cuya secuencia crece de manera exponencial respecto a la magnitud de n.");
                        System.out.println("\nIngrese parámetro n: ");
                        long n = Keyboard.readLong();
                        try {
                            long cat = Ejercicios.Catalan(n);
                            System.out.printf("\nEl número de Catalán para %d es: %d", n, cat);
                        } catch (StackOverflowError e) {
                            System.out.printf("\nTe acabaste la memoria con eso. %d produce un número de Catalán muy grande para la memoria.", n);
                        }
                        break;
                    }
                    case 7: {
                        
                        break;
                    }
                    case 8: {
                        break;
                    }
                    case 9: {
                        break;
                    }
                    case 10: {
                        continuar = false;
                        System.out.println("\nAdios! o7");
                        break;
                    }
                    default: {
                        System.out.println("Seleccion invalida, intente de nuevo."); // tf u on
                    }
                }
            } catch (IllegalArgumentException Bruh) {
                System.out.println("No entiendo cómo lograste tal " + Bruh + ", pero felicidades, eres especial.");
            }

        } while (continuar);
    }
}
