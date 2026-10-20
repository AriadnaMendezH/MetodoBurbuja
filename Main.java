import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1. Arreglo de prueba proporcionado
        int[] datosPrueba1 = {12, 18, 34, 44, 3, 55, 27, 11, 86, 91};
        
        // Copia exacta para probar el método mejorado con los mismos datos
        int[] datosPrueba2 = datosPrueba1.clone();

        System.out.println("==========================================");
        System.out.println("   PRÁCTICA: ALGORITMOS DE ORDENAMIENTO   ");
        System.out.println("==========================================\n");

        // --- PRUEBA 1: BURBUJA NORMAL ---
        System.out.println("--- 🫧 BURBUJA NORMAL ---");
        System.out.println("Estado inicial: " + Arrays.toString(datosPrueba1));
        ordenamientoBurbuja(datosPrueba1);
        System.out.println("Resultado final: " + Arrays.toString(datosPrueba1));

        System.out.println("\n------------------------------------------\n");

        // --- PRUEBA 2: BURBUJA MEJORADO ---
        System.out.println("--- ⚡ BURBUJA MEJORADO (OPTIMIZADO) ---");
        System.out.println("Estado inicial: " + Arrays.toString(datosPrueba2));
        ordenamientoBurbujaMejorado(datosPrueba2);
        System.out.println("Resultado final: " + Arrays.toString(datosPrueba2));
    }

    /**
     * Algoritmo de Ordenamiento Burbuja Normal
     * Compara elementos adyacentes y los intercambia si están en orden incorrecto.
     * Ejecuta todas las pasadas sin importar si el arreglo se ordena antes.
     */
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        
        // Ciclo externo: controla el número de pasadas
        for (int i = 0; i < n - 1; i++) {
            
            // Ciclo interno: compara e intercambia vecinos
            for (int j = 0; j < n - 1; j++) {
                
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }

    /**
     * Algoritmo de Ordenamiento Burbuja Mejorado (Optimizado)
     * Utiliza una variable bandera (boolean) para detectar si hubo intercambios.
     * Se detiene tempranamente si el arreglo ya está completamente ordenado.
     */
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboIntercambio;
        
        // Ciclo externo: controla el número de pasadas
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false; // Reiniciamos la bandera al inicio de la pasada
            
            // Ciclo interno: no compara los elementos del final que ya están ordenados (-i)
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    
                    huboIntercambio = true; // Confirmamos que hubo movimiento
                }
            }
            
            // Si en toda la pasada no hubo intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }
}
