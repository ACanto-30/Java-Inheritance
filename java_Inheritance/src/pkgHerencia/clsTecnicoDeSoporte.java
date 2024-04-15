package pkgHerencia;
import javax.swing.JOptionPane;

public class clsTecnicoDeSoporte extends clsEmpleadoDeTiempoCompleto {
    private String especialidad;
    private String tipoSoporte;

    public clsTecnicoDeSoporte(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String especialidad, String tipoSoporte) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.especialidad = especialidad;
        this.tipoSoporte = tipoSoporte;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Tecnico de Soporte: " + super.imprimirDatosDelEmpleadomtd(),
                "Especialidad: " + especialidad,
                "Tipo de Soporte: " + tipoSoporte,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }

    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // Lógica del salario
    }
    public void resolverIncidenciasmtd() {
        JOptionPane.showMessageDialog(null, "Incidencias resueltas por " + getNombre());
    }
    
    public void actualizarSoftwaremtd() {
        JOptionPane.showMessageDialog(null, "Software actualizado por " + getNombre());
    }
    
    public void brindarAsesoramientomtd() {
        JOptionPane.showMessageDialog(null, "Asesoramiento brindado por " + getNombre());
    }
    
    public void realizarMantenimientoEquiposmtd() {
        JOptionPane.showMessageDialog(null, "Mantenimiento de equipos realizado por " + getNombre());
    }
    
    public void configurarRedesmtd() {
        JOptionPane.showMessageDialog(null, "Redes configuradas por " + getNombre());
    }
    
    public void diagnosticarProblemasmtd() {
        JOptionPane.showMessageDialog(null, "Problemas diagnosticados por " + getNombre());
    }

}
