
package Entidad;

import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class cortes {
    int id_corte;
    int id_apertura;
    double monto_entregado;
    double gastos;
    double ventas;        
    double diferencia;
    String fecha;
    String hora;     
    int usuario;

    public cortes() {
    }

    public cortes(int id_corte, int id_apertura, double monto_entregado, double gastos, double ventas, double diferencia, String fecha, String hora, int usuario) {
        this.id_corte = id_corte;
        this.id_apertura = id_apertura;
        this.monto_entregado = monto_entregado;
        this.gastos = gastos;
        this.ventas = ventas;
        this.diferencia = diferencia;
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
    }

    public int getId_corte() {
        return id_corte;
    }

    public void setId_corte(int id_corte) {
        this.id_corte = id_corte;
    }

    public int getId_apertura() {
        return id_apertura;
    }

    public void setId_apertura(int id_apertura) {
        this.id_apertura = id_apertura;
    }

    public double getMonto_entregado() {
        return monto_entregado;
    }

    public void setMonto_entregado(double monto_entregado) {
        this.monto_entregado = monto_entregado;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
                       
}
