package pkgHerencia;

import javax.swing.JOptionPane;

public class clsAnalistaDeSeguridad extends clsEmpleadoDeMedioTiempo {
    private String rol;
    private String gestionIdentidadesAccesos;

    public clsAnalistaDeSeguridad(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String rol, String gestionIdentidadesAccesos) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.rol = rol;
        this.gestionIdentidadesAccesos = gestionIdentidadesAccesos;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Analista de seguridad: " + super.imprimirDatosDelEmpleadomtd(),
        "Realiza: " + rol,
        "Gestiona: " + gestionIdentidadesAccesos,
        "Tipo de Empleado: " + tiempo);
        return  informacion;              
    }

    @Override
    public double calcularSalariomtd() {
        double tarifaHoraLimpieza = 10.0;
        double salarioTotal = getSalarioBase() + (getHorasTrabajadas() * tarifaHoraLimpieza);
        return salarioTotal;
    }

    public void ElaborarInformesSobreRiesgosmtd() {
        JOptionPane.showMessageDialog(null, "Informes sobre riesgos elaborados por " + getNombre());
    }
    
    public void ActualizarSistemaDeSeguridadmtd() {
        JOptionPane.showMessageDialog(null, "Sistema de seguridad actualizado por " + getNombre());
    }
    
    public void PlanificarMedidasDePreventivasmtd() {
        JOptionPane.showMessageDialog(null, "Medidas preventivas planificadas por " + getNombre());
    }
    
    public void monitorearActividadRedmtd() {
        JOptionPane.showMessageDialog(null, "Actividad de red monitoreada por " + getNombre());
    }
    
    public void realizarAuditoriasDeSeguridadmtd() {
        JOptionPane.showMessageDialog(null, "Auditorias de seguridad realizadas por " + getNombre());
    }
    
    public void implementarPoliticasDeSeguridadmtd() {
        JOptionPane.showMessageDialog(null, "Politicas de seguridad implementadas por " + getNombre());
    }
}