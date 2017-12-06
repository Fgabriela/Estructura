
package practica.modelo;

public class Persona {
    
    private String nombreYapellido;
    private String cedula;

    public Persona(String nombreYapellido, String cedula) {
        this.nombreYapellido = nombreYapellido;
        this.cedula = cedula;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
