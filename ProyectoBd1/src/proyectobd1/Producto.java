package proyectobd1;
public class Producto {
    public String nombre;
    public String fecha;
    public long rtn;
    public String direccion;
    public int numero_factura;
    public int codigo_producto;

    public Producto() {
    }

    public Producto(String nombre, String fecha, long rtn, String direccion, int numero_factura, int codigo_producto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.rtn = rtn;
        this.direccion = direccion;
        this.numero_factura = numero_factura;
        this.codigo_producto = codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getRtn() {
        return rtn;
    }

    public void setRtn(long rtn) {
        this.rtn = rtn;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", fecha=" + fecha + ", rtn=" + rtn + ", direccion=" + direccion + ", numero_factura=" + numero_factura + ", codigo_producto=" + codigo_producto + '}';
    }
}