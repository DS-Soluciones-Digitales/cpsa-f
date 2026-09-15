package correct.inventarios;

// ✅ Abstracción de la que depende PedidoService. Guice decide, a través
// de PedidosModule, qué implementación concreta se entrega en tiempo de ejecución.
public interface InventarioRepository {

    void registrarSalida(String nombreProducto, int cantidad);
}
