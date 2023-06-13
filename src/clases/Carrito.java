package clases;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private double total;
    
    public Carrito() {
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            total -= producto.getPrecio();
        }
    }

    public double getTotal() {
        return total;
    }
    
    public void recalcularTotal() {
        total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
    }

    public void vaciarCarrito() {
        productos.clear();
        total = 0.0;
    }

    public int obtenerCantidadProductos() {
        return productos.size();
    }
}
