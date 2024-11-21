import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Plato> platos;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.platos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        return cliente.calcularDescuento(total);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Plato> getPlatos() {
        return platos;
    }
}
