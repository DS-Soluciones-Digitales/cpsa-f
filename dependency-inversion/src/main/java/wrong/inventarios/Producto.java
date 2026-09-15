package wrong.inventarios;

import wrong.pedidos.Pedido;

public class Producto {
    private String nombre;
    private int stockDisponible;
    private double precioUnitario;

    public Producto(String nombre, int stockDisponible, double precioUnitario) {
        this.nombre = nombre;
        this.stockDisponible = stockDisponible;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    // ✅ Uso correcto: este método no sabe nada de Pedido,
    // es una consulta pura del propio dominio de inventario.
    public boolean hayStock(int cantidad) {
        return stockDisponible >= cantidad;
    }

    // ✅ Uso correcto: cálculo propio de Producto, sin conocer al cliente.
    public double calcularSubtotal(int cantidad) {
        return precioUnitario * cantidad;
    }

    // ✅ Uso correcto: operación propia del dominio de inventario.
    public void reducirStock(int cantidad) {
        stockDisponible -= cantidad;
    }

    // ❌ Violación de ADP/DIP: este método sí depende de Pedido,
    // una clase concreta de un paquete de nivel superior.
    public void registrarUsoEnPedido(Pedido pedido) {
        System.out.println("Producto " + nombre + " usado en pedido #" + pedido.getId());
    }
}