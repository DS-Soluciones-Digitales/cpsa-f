package wrong.pedidos;

import wrong.inventarios.InventarioRepository;
import wrong.inventarios.Producto;

public class Pedido {
    private int id;
    private Producto producto;
    private int cantidad;
    private String emailCliente;

    // ❌ No hay inyección de dependencias: Pedido construye sus propias
    // dependencias con "new" en lugar de recibirlas desde afuera.
    // Queda acoplado a estas implementaciones concretas y es imposible
    // sustituirlas (por ejemplo, en pruebas unitarias) sin modificar esta clase.
    private final InventarioRepository inventarioRepository = new InventarioRepository();
    private final NotificadorEmail notificador = new NotificadorEmail();

    public Pedido(int id, Producto producto, int cantidad, String emailCliente) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.emailCliente = emailCliente;
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
        inventarioRepository.registrarSalida(producto.getNombre(), cantidad);

        System.out.println("Pedido #" + id + " confirmado: " + cantidad + " x " + producto.getNombre()
            + " (subtotal: " + subtotal + ")");

        notificador.enviar(emailCliente, "Tu pedido #" + id + " ha sido confirmado.");
    }
}
