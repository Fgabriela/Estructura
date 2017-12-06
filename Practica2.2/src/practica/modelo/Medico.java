
package practica.modelo;

public class Medico {
    
    private Persona persona;
    private String titulo;
    private String especialidad;

    public Medico(Persona persona, String titulo, String especialidad) {
        this.persona = persona;
        this.titulo = titulo;
        this.especialidad = especialidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return  persona.getNombreYapellido() + "; CI.: " + persona.getCedula() +"; titulo "+ titulo + "; especialidad=" + especialidad + '}';
    }
    
}
