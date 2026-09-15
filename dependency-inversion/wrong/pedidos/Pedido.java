package wrong.pedidos;

import wrong.inventarios.Producto;

public class Pedido {
    private int id;
    private Producto producto;
    private int cantidad;

    public Pedido(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void confirmar() {
         if (!producto.hayStock(cantidad)) {
            throw new IllegalStateException("Sin stock suficiente para " + producto.getNombre());
        }

        double subtotal = producto.calcularSubtotal(cantidad);
        producto.reducirStock(cantidad);

        System.out.println("Pedido #" + id + " confirmado: " + cantidad + " x " + producto.getNombre()
            + " (subtotal: " + subtotal + ")");

        // ❌ Aquí es donde se dispara la dependencia inversa:
        // producto termina "conociendo" a Pedido.
        producto.registrarUsoEnPedido(this);
    }
}