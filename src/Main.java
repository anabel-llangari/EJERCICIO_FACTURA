import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Factura factura1 = new Factura("0001", "Martillo", 5, 12.50);

        Factura factura2 = new Factura("0002", "Destornillador", -2, -50.0);

        Factura factura3 = new Factura("0003", "Sierra", 10, 24.60);

        System.out.println("--- Factura 1 ---");
        System.out.println("Establece el numero de pieza:");
        String entrada = scanner.nextLine();
        factura1.establecerNumeroPieza(entrada);
        System.out.println("Establece la descripción de la pieza:");
        String desc = scanner.nextLine();
        factura1.establecerDescripcionPieza(desc);
        System.out.println("Establece la cantidad de piezas:");
        int can = scanner.nextInt();
        factura1.establecerCantidad(can);

        System.out.println("--- Factura 1 ---");
        System.out.printf("Número de pieza: %s%n", factura1.obtenerNumeroPieza());
        System.out.printf("Descripción: %s%n", factura1.obtenerDescripcionPieza());
        System.out.printf("Cantidad: %d%n", factura1.obtenerCantidad());
        System.out.printf("Precio por artículo: $%.2f%n", factura1.obtenerPrecioPorArticulo());
        System.out.printf("MONTO TOTAL: $%.2f%n%n", factura1.obtenerMontoFactura());

        System.out.println("--- Factura 2 ---");
        System.out.printf("Número de pieza: %s%n", factura2.obtenerNumeroPieza());
        System.out.printf("Descripción: %s%n", factura2.obtenerDescripcionPieza());
        System.out.printf("Cantidad: %d%n", factura2.obtenerCantidad());
        System.out.printf("Precio por artículo: $%.2f%n", factura2.obtenerPrecioPorArticulo());
        System.out.printf("MONTO TOTAL: $%.2f%n", factura2.obtenerMontoFactura());

        System.out.println("--- Factura 3 ---");
        System.out.printf("Número de pieza: %s%n", factura3.obtenerNumeroPieza());
        System.out.printf("Descripción: %s%n", factura3.obtenerDescripcionPieza());
        System.out.printf("Cantidad: %d%n", factura3.obtenerCantidad());
        System.out.printf("Precio por artículo: $%.2f%n", factura3.obtenerPrecioPorArticulo());
        System.out.printf("MONTO TOTAL: $%.2f%n", factura3.obtenerMontoFactura());
    }
}