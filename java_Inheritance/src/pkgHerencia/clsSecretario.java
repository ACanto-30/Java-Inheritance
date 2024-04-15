package pkgHerencia;

import javax.swing.JOptionPane;

public class clsSecretario extends clsEmpleadoDeMedioTiempo {
    private String idiomas;
    private boolean atenderLlamadas;

    public clsSecretario(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String idiomas, boolean atenderLlamadas) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.idiomas = idiomas;
        this.atenderLlamadas = atenderLlamadas;
    }

    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Secretario: " + super.imprimirDatosDelEmpleadomtd(),
                "Lenguaje: " + idiomas,
                "Atencion al cliente: " + atenderLlamadas,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }

    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // Lógica del salario
    }

    public void gestionarAgendamtd() {
        JOptionPane.showMessageDialog(null, "Agenda gestionada por " + getNombre());
    }
    
    public void redactarCorrespondenciamtd() {
        JOptionPane.showMessageDialog(null, "Correspondencia redactada por " + getNombre());
    }
    
    public void organizarDocumentosmtd() {
        JOptionPane.showMessageDialog(null, "Documentos organizados por " + getNombre());
    }
    
    public void coordinarViajesmtd() {
        JOptionPane.showMessageDialog(null, "Viajes coordinados por " + getNombre());
    }
    
    public void prepararReunionesmtd() {
        JOptionPane.showMessageDialog(null, "Reuniones preparadas por " + getNombre());
    }
    
    public void gestionarCorreoElectronicomtd() {
        JOptionPane.showMessageDialog(null, "Correo electrónico gestionado por " + getNombre());
    }
}