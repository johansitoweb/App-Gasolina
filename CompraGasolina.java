import java.util.Scanner;

public class CompraGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioLitro = 3.5; // Precio por litro (ajustable)

        System.out.print("Ingrese la cantidad de litros a cargar: ");
        double litros = scanner.nextDouble();

        double total = litros * precioLitro;
        System.out.println("El total a pagar es: $" + total);
    }
}