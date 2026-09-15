package wrong.inventarios;

public class InventarioRepository {

    public void registrarSalida(String nombreProducto, int cantidad) {
        System.out.println("[InventarioRepository] Registrando salida de " + cantidad + " x " + nombreProducto);
    }
}
