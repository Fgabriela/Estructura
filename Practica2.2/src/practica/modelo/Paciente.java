
package practica.modelo;

public class Paciente {
    
    private Persona persona;
    private String tipoSangre;

    public Paciente(Persona persona, String tipoSangre) {
        this.persona = persona;
        this.tipoSangre = tipoSangre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return persona.getNombreYapellido() + "; CI.: " + persona.getCedula() + "; tipoSangre=" + tipoSangre ;
    }
    
}
