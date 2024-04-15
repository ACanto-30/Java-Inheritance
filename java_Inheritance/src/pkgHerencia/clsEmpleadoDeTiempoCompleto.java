package pkgHerencia;

import javax.swing.JOptionPane;

public class clsEmpleadoDeTiempoCompleto extends clsEmpleado {
    public clsEmpleadoDeTiempoCompleto(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
    }
    
    public double calcularSalariomtd() {
        return getSalarioBase() * getHorasTrabajadas();
    }
    public void solicitarVacacionesmtd() {
        JOptionPane.showMessageDialog(null, "Vacaciones solicitadas por " + getNombre());
    }
    public void registrarAsistenciamtd() {
        JOptionPane.showMessageDialog(null, "Asistencia registrada para " + getNombre());
    }
    public void recibirBonomtd() {
        JOptionPane.showMessageDialog(null, "Bono recibido por desempeño excepcional para " + getNombre());
    }

    public String imprimirDatosDelEmpleadomtd() {
        String informacion = String.join("\n", 
            super.getNombre(),
            "ID: " + super.getID(),
            "Salario Base: " + super.getSalarioBase(),
            "Horas Trabajadas: " + super.getHorasTrabajadas(),
            "Email: " + super.getEmail());
            return informacion;
    }
}