package pkgHerencia;

import javax.swing.JOptionPane;

public class clsDirectorDeRecursosHumanos extends clsEmpleadoDeTiempoCompleto {
    private String tipoLiderazgo;
    private String gestionTalento;

    public clsDirectorDeRecursosHumanos(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String tipoLiderazgo, String gestionTalento) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.tipoLiderazgo = tipoLiderazgo;
        this.gestionTalento = gestionTalento;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Director de Recursos Humanos: " + super.imprimirDatosDelEmpleadomtd(),
        "Tipo de lider: " + tipoLiderazgo,
        "Gestion de Talento: " + gestionTalento,
        "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // Lógica del salario
    }
    public void contratarPersonalmtd() {
        JOptionPane.showMessageDialog(null, "Personal contratado por " + getNombre());
    }
    
    public void evaluarEntornoDeTrabajomtd() {
        JOptionPane.showMessageDialog(null, "Entorno de trabajo evaluado por " + getNombre());
    }
    
    public void capacitarPersonalNuevomtd() {
        JOptionPane.showMessageDialog(null, "Personal nuevo capacitado por " + getNombre());
    }
    
    public void desarrollarPoliticasDeRecursosHumanosmtd() {
        JOptionPane.showMessageDialog(null, "Políticas de RRHH desarrolladas por " + getNombre());
    }
    
    public void gestionarBeneficiosmtd() {
        JOptionPane.showMessageDialog(null, "Beneficios gestionados por " + getNombre());
    }
    
    public void resolverConflictosmtd() {
        JOptionPane.showMessageDialog(null, "Conflictos resueltos por " + getNombre());
    }
}
