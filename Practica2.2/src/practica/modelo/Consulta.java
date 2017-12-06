
package practica.modelo;

public class Consulta {
    private int codigo;
    private Medico medico;
    private Paciente paciente;
    private String fecha;

    public Consulta(int codigo, Medico medico, Paciente paciente, String fecha) {
        this.codigo = codigo;
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return codigo + " | " + medico.getPersona().getNombreYapellido() + " | " + paciente.getPersona().getNombreYapellido() + " | " + fecha ;
    }
    
}
