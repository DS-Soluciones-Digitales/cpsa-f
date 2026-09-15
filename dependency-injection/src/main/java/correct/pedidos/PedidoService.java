package correct.pedidos;

import com.google.inject.Inject;
import correct.inventarios.InventarioRepository;
import correct.inventarios.Producto;

public class PedidoService {
    private final InventarioRepository inventarioRepository;
    private final Notificador notificador;

    // ✅ Inyección de dependencias por constructor: PedidoService no crea
    // sus colaboradores con "new", los recibe desde afuera como abstracciones.
    // Guice resuelve qué implementación concreta entregar (ver PedidosModule).
    @Inject
    public PedidoService(InventarioRepository inventarioRepository, Notificador notificador) {
        this.inventarioRepository = inventarioRepository;
        this.notificador = notificador;
    }

    public void confirmar(Pedido pedido) {
        Producto producto = pedido.getProducto();
        int cantidad = pedido.getCantidad();

        if (!producto.hayStock(cantidad)) {
            throw new IllegalStateException("Sin stock suficiente para " + producto.getNombre());
        }

        double subtotal = producto.calcularSubtotal(cantidad);
        producto.reducirStock(cantidad);
        inventarioRepository.registrarSalida(producto.getNombre(), cantidad);

        System.out.println("Pedido #" + pedido.getId() + " confirmado: " + cantidad + " x " + producto.getNombre()
            + " (subtotal: " + subtotal + ")");

        notificador.enviar(pedido.getEmailCliente(), "Tu pedido #" + pedido.getId() + " ha sido confirmado.");
    }
}
