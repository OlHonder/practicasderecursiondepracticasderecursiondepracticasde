public class Ejercicios {
    
    public static int sumarArreglo(int indice, int[] arreglo) {
        int resultado = 0;
        if (indice == 0) {
            resultado = arreglo[0];
        }
        else {
            resultado = arreglo[indice] + sumarArreglo(indice - 1, arreglo);
        }
        return resultado;
    }

    public static String imprimirArreglo(int indice, int[] arreglo) {
        String texto = "";
        if (indice == 0){
            texto = String.valueOf(arreglo[0]) + ".";
        }
        else {
            texto = String.valueOf(arreglo[indice]) + " , " + imprimirArreglo(indice - 1, arreglo);
        }
        return texto;
    }

    public static byte convertirDecimalBinario (int decimal) {
        byte binario = 0;
        
        return binario;
    }

}
