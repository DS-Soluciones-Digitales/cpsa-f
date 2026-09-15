package correct.inventarios;

public class InventarioRepositoryImpl implements InventarioRepository {

    @Override
    public void registrarSalida(String nombreProducto, int cantidad) {
        System.out.println("[InventarioRepository] Registrando salida de " + cantidad + " x " + nombreProducto);
    }
}
