import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //Preparacion de variables
        int[] arregloNumeros;
        List<Integer> arregloLista;
        boolean continuar = true;
        int opcion;
        int tamano;
        int resultado;
        String arregloTextual = "";

        System.out.println("Bienvenido a las practicas de recursion de practicas de recursion de practicas de recursion de practicas de recursion de.........");

        do { //Corremos todo hasta que se decida terminar, multiples opciones correran sin asignacion de metodos externos
            //Opciones de ejercicios disponibles.
            System.out.println("\nSeleccione el ejercicio deseado: ");
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
                opcion = Keyboard.readInt(); //Entrada del usuario
                tamano = (int)(Math.random()*16); //Queremos un arreglo de tamaño máximo 16, pero aleatorio para demostrar que se implementa recursion sin importar su tamaño
                //System.out.println(tamano);
                arregloNumeros = new int[tamano];
                arregloLista = new ArrayList<>();

                for(int i = 0; i < tamano; i++) {
                    arregloNumeros[i] = (int)(Math.random()*50); //Valores del arreglo de máximo 50 para introducir variedad
                    arregloLista.add(arregloNumeros[i]); //Lista de arreglo.
                }


                switch (opcion) {
                    case 1: {
                        System.out.println();
                        System.out.println("El arreglo de números generado es: " + Ejercicios.imprimirArreglo(tamano - 1, arregloNumeros));
                        resultado = Ejercicios.sumarArreglo(tamano - 1, arregloNumeros);
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    }
                    case 2: {
                        System.out.println();
                        arregloTextual = Ejercicios.imprimirArreglo(tamano - 1, arregloNumeros);
                        System.out.println("El arreglo de numeros generado es: " + arregloTextual);
                        break;
                    }
                    case 3: {
                        System.out.println();
                        
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
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
                        System.out.println("Seleccion invalida, intente de nuevo."); //tf u on
                    }
                }
            }
            catch (IllegalArgumentException Bruh){

            }


        } while (continuar);
    }
}
