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

    public static String convertirDecimalBinario (int dec) { // concatenación de 
        String bino = "";
        if (dec == 0){
            bino = "0";
        }
        else if (dec == 1){
            bino = "1";
        }
        else {
            bino = convertirDecimalBinario(dec / 2) + String.valueOf(dec % 2);
        }
        return bino;
    }

    public static int MCD(int a, int b){ // algoritmo de Euclides
        int maxCD = 0;
        if (b == 0){
            maxCD = a;
        }
        else{
            maxCD = MCD(b, a % b);
        }
        return maxCD;
    }

    public static int Ackerman(int m, int n){ // Can't find uses for this bs
        int a = 0;
        if (m == 0){
            a = n + 1;
        }
        else if (m > 0 && n == 0){
            a = Ackerman(m - 1, 1);
        }
        else{
            a = Ackerman(m - 1, Ackerman(m, n - 1));
        }
        return a;
    }
    
    public static long Catalan(long n){
        long c = 0;
        if (n == 0){
            c = 1;
        }
        else{
            c = ((Catalan(n - 1)) * (2 * (2 * n - 1))) / (n + 1);
        }
        return c;
    }
    

}
