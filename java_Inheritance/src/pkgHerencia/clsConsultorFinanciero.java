package pkgHerencia;

import javax.swing.JOptionPane;

public class clsConsultorFinanciero extends clsEmpleadoDeMedioTiempo {
    private String especializacion;
    private String cargo;

    public clsConsultorFinanciero(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String especializacion, String cargo) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.especializacion = especializacion;
        this.cargo = cargo;
    }

    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Consultor Financiero: " + super.imprimirDatosDelEmpleadomtd(),
                "Expecializado en: " + especializacion,
                "Cargo: " + cargo,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // logica
    }
    public void asesorarClientesmtd() {
        JOptionPane.showMessageDialog(null, "Clientes asesorados por " + getNombre());
    }
    
    public void realizarAnalisisDeMercadomtd() {
        JOptionPane.showMessageDialog(null, "Análisis de mercado realizado por " + getNombre());
    }
    
    public void prepararInformesEconomicosmtd() {
        JOptionPane.showMessageDialog(null, "Informes económicos preparados por " + getNombre());
    }
    
    public void ofrecerRecomendacionesmtd() {
        JOptionPane.showMessageDialog(null, "Recomendaciones ofrecidas por " + getNombre());
    }
    
    public void desarrollarEstrategiasmtd() {
        JOptionPane.showMessageDialog(null, "Estrategias desarrolladas por " + getNombre());
    }
    
    public void negociarContratosmtd() {
        JOptionPane.showMessageDialog(null, "Contratos negociados por " + getNombre());
    }
}
