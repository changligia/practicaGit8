import java.util.Arrays;
import java.util.HashSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var setValores1 = new HashSet<>(Arrays.asList("Carro", "Pelota", "Monstruo", "Pato", "Mono"));
        final var setValores2 = new HashSet<>(Arrays.asList("Patineta", "Pelota", "Zebra", "Leon", "Carro"));

        setValores1.retainAll(setValores2);
        System.out.printf("Los valores comunes entre ambos set son: %s%n", setValores1);
    }
}
