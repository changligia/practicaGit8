import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var array = crearArray();
        mostrarArray(array);
        ordenarArray(array);
        mostrarArray(array);
    }

    private static void ordenarArray(String[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) { //condición de desordenado
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void mostrarArray(String[] array) {
        System.out.printf("El array es: %s%n", Arrays.toString(array));
    }

    private static String[] crearArray() {
        return new String[]{"Adriana", "Rodrigo", "Jimena", "Ligia", "Nayelli", "Nayigia",
                "Liyelili", "Nora", "Norma", "Laura"};
    }

}
