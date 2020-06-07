
package Entidad;

public class Persona {
    int id_apertura;
    String fecha;

    public Persona() {
    }

    public Persona(int id_apertura, String fecha) {
        this.id_apertura = id_apertura;
        this.fecha = fecha;
    }

    public int getId_apertura() {
        return id_apertura;
    }

    public void setId_apertura(int id_apertura) {
        this.id_apertura = id_apertura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    
    
    
}
