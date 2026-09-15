package correct.inventarios;

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

    public boolean hayStock(int cantidad) {
        return stockDisponible >= cantidad;
    }

    public double calcularSubtotal(int cantidad) {
        return precioUnitario * cantidad;
    }

    public void reducirStock(int cantidad) {
        stockDisponible -= cantidad;
    }
}
