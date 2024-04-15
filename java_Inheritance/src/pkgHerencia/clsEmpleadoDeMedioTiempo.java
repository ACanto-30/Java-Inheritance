package pkgHerencia;

import javax.swing.JOptionPane;

public class clsEmpleadoDeMedioTiempo extends clsEmpleado {
    public clsEmpleadoDeMedioTiempo(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
    }
    
    public double calcularSalariomtd() {
        return getSalarioBase() * getHorasTrabajadas() * 0.5;
    }
    public void solicitarPermisomtd() {
        JOptionPane.showMessageDialog(null, "Permiso solicitado por " + getNombre());
    }
    public void organizarInventariomtd() {
        JOptionPane.showMessageDialog(null, "Inventario organizado por " + getNombre());
    }
    public void atenderClientesmtd() {
        JOptionPane.showMessageDialog(null, "Clientes atendidos por " + getNombre());
    }
    public String imprimirDatosDelEmpleadomtd()
    {
        String informacion = String.join("\n", 
            super.getNombre(),
            "ID: " + super.getID(),
            "Salario Base: " + super.getSalarioBase(),
            "Horas Trabajadas: " + super.getHorasTrabajadas(),
            "Email: " + super.getEmail());
        return informacion;
    }
}