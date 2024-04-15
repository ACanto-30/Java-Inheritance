package pkgHerencia;

import javax.swing.JOptionPane;

public class clsAsistenteAdministrativo extends clsEmpleadoDeMedioTiempo {
    private String administracionEspecifica;
    private boolean atencionCliente;

    public clsAsistenteAdministrativo(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String administracionEspecifica, boolean atencionCliente) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.administracionEspecifica = administracionEspecifica;
        this.atencionCliente = atencionCliente;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Asistente Administrativo : " + super.imprimirDatosDelEmpleadomtd(),
                "Realiza: " + administracionEspecifica,
                "Atiende al cliente: " + atencionCliente,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // Lógica del salario
    }
    public void gestionarDocumentacionmtd() {
        JOptionPane.showMessageDialog(null, "Documentación gestionada por " + getNombre());
    }
    
    public void coordinarReunionesmtd() {
        JOptionPane.showMessageDialog(null, "Reuniones coordinadas por " + getNombre());
    }
    
    public void atenderLlamadasmtd() {
        JOptionPane.showMessageDialog(null, "Llamadas atendidas por " + getNombre());
    }

    public void gestionarProveedoresmtd() {
        JOptionPane.showMessageDialog(null, "Proveedores gestionados por " + getNombre());
    }
    
    public void coordinarEntregaDeDocumentosmtd() {
        JOptionPane.showMessageDialog(null, "Entrega de documentos coordinada por " + getNombre());
    }
    
    public void prepararInformesAdministrativosmtd() {
        JOptionPane.showMessageDialog(null, "Informes administrativos preparados por " + getNombre());
    }
}