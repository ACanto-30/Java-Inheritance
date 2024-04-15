package pkgHerencia;

import javax.swing.JOptionPane;

public class clsContador extends clsEmpleadoDeTiempoCompleto{
    private String certificacion;
    private String software;

    public clsContador(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String certificacion, String software) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.software = software;
        this.certificacion = certificacion;
    }

    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
            "Contador: " + super.imprimirDatosDelEmpleadomtd(),
            "Certificacion: " + certificacion,
            "Software: " + software,
            "Tipo de Empleado: " + tiempo);
        return informacion;
    }

    public void registrarTransaccionesmtd() {
        JOptionPane.showMessageDialog(null, "Transaccion registrado por " +getNombre());
    }

    public void organizarInformacionFinancieramtd() {
        JOptionPane.showMessageDialog(null, "Informacion financiera organizada por " +getNombre());
    }
    
    public void prepararEstadosFinancierosmtd() {
        JOptionPane.showMessageDialog(null, "Estado financiero preparado por " +getNombre());
    }
    
    public void realizarAuditoriamtd() {
        JOptionPane.showMessageDialog(null, "Auditoria realizada por " +getNombre());
    }
    
    public void gestionarImpuestosmtd() {
        JOptionPane.showMessageDialog(null, "Gestion de impuesto realizada por " +getNombre());
    }
    
    public void ofrecerAsesoramientomtd() {
        JOptionPane.showMessageDialog(null, "Asesoramiento ofrecida por " +getNombre());
    }

}
