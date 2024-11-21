public class ClienteRegular extends Cliente {
    public ClienteRegular(String nombre, String identificacion) {
        super(nombre, identificacion);
    }

    @Override
    public double calcularDescuento(double total) {
        return total; // Sin descuento
    }
}

