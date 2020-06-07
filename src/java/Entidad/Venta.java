
package Entidad;


public class Venta {
    int id_venta;
    int id_usuario;
    double descuento;
    double total;
    double subtotal;
    double pago;
    double cambio;
    String estado_venta;
    String fecha_reporte;
    String hora;

    public Venta() {
    }

    public Venta(int id_venta, int id_usuario, double descuento, double total, double subtotal, double pago, double cambio, String estado_venta, String fecha_reporte, String hora) {
        this.id_venta = id_venta;
        this.id_usuario = id_usuario;
        this.descuento = descuento;
        this.total = total;
        this.subtotal = subtotal;
        this.pago = pago;
        this.cambio = cambio;
        this.estado_venta = estado_venta;
        this.fecha_reporte = fecha_reporte;
        this.hora = hora;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public String getEstado_venta() {
        return estado_venta;
    }

    public void setEstado_venta(String estado_venta) {
        this.estado_venta = estado_venta;
    }

    public String getFecha_reporte() {
        return fecha_reporte;
    }

    public void setFecha_reporte(String fecha_reporte) {
        this.fecha_reporte = fecha_reporte;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }    

}
