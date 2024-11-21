public class PlatoPrincipal extends Plato {
    public PlatoPrincipal(String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
    }

    @Override
    public String getTipo() {
        return "Plato Principal";
    }
}