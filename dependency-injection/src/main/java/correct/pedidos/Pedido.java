package correct.pedidos;

import correct.inventarios.Producto;

// Pedido queda como un simple portador de los datos de la orden.
// La lógica que necesita colaboradores (inventario, notificaciones)
// vive en PedidoService, que sí recibe esas dependencias inyectadas.
public class Pedido {
    private final int id;
    private final Producto producto;
    private final int cantidad;
    private final String emailCliente;

    public Pedido(int id, Producto producto, int cantidad, String emailCliente) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.emailCliente = emailCliente;
    }

    public int getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getEmailCliente() {
        return emailCliente;
    }
}
