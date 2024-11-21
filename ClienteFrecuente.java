public class ClienteFrecuente extends Cliente {
    public ClienteFrecuente(String nombre, String identificacion) {
        super(nombre, identificacion);
    }

    @Override
    public double calcularDescuento(double total) {
        return total * 0.9; // 10% de descuento
    }
}