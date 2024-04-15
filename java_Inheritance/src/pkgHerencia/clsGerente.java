package pkgHerencia;

import javax.swing.JOptionPane;

public class clsGerente extends clsEmpleadoDeTiempoCompleto {
    private int numTrabajadoresCargo;
    private double presupuestoAnual;

    public clsGerente(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, int numTrabajadoresCargo, double presupuestoAnual) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.numTrabajadoresCargo = numTrabajadoresCargo;
        this.presupuestoAnual = presupuestoAnual;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
            "Gerente: " + super.imprimirDatosDelEmpleadomtd(),
            "Numero de trabajadores cargo: " + numTrabajadoresCargo,
            "Presupuesto Anual: " + presupuestoAnual,
            "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // Lógica del salario
    }
    public void asignarTareamtd() {
        JOptionPane.showMessageDialog(null, "Tarea asignada por " + getNombre());
    }
    
    public void gestionarEquipomtd() {
        JOptionPane.showMessageDialog(null, "Equipo gestionado por " + getNombre());
    }
    
    public void realizarInformemtd() {
        JOptionPane.showMessageDialog(null, "Informe realizado por " + getNombre());
    }
    
    public void coordinarProyectosmtd() {
        JOptionPane.showMessageDialog(null, "Proyectos coordinados por " + getNombre());
    }
    
    public void supervisarOperacionesmtd() {
        JOptionPane.showMessageDialog(null, "Operaciones supervisadas por " + getNombre());
    }
    
    public void evaluarDesempenomtd() {
        JOptionPane.showMessageDialog(null, "Desempeño evaluado por " + getNombre());
    }
}