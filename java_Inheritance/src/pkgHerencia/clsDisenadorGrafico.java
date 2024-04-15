package pkgHerencia;

import javax.swing.JOptionPane;

public class clsDisenadorGrafico extends clsEmpleadoDeMedioTiempo {
    private String softwareDiseno;
    private boolean animador;

    public clsDisenadorGrafico(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String softwareDiseno, boolean animador) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.softwareDiseno = softwareDiseno;
        this.animador = animador;
    }

    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Disenador Grafico: "  + super.imprimirDatosDelEmpleadomtd(),
                "Aplicacion: " + softwareDiseno,
                "Animador: " + animador,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // Lógica del salario
    }
    public void disenarMaterialVisualmtd() {
        JOptionPane.showMessageDialog(null, "Material visual diseñado por " + getNombre());
    }
    
    public void colaborarEnProyectosCreativosmtd() {
        JOptionPane.showMessageDialog(null, "Proyectos creativos colaborados por " + getNombre());
    }
    
    public void presentarPropuestasmtd() {
        JOptionPane.showMessageDialog(null, "Propuestas presentadas por " + getNombre());
    }
    
    public void crearAnimacionesmtd() {
        JOptionPane.showMessageDialog(null, "Animaciones creadas por " + getNombre());
    }
    
    public void diseñarLogotiposmtd() {
        JOptionPane.showMessageDialog(null, "Logotipos diseñados por " + getNombre());
    }
    
    public void editarImagenesmtd() {
        JOptionPane.showMessageDialog(null, "Imágenes editadas por " + getNombre());
    }
}
