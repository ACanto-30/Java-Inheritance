package pkgHerencia;

import javax.swing.JOptionPane;

public class clsIngenieroDeSoftware extends clsEmpleadoDeTiempoCompleto {
    private String lenguajeEspecializado;
    private String area;

    public clsIngenieroDeSoftware(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String lenguajeEspecializado, String area) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.lenguajeEspecializado = lenguajeEspecializado;
        this.area = area;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Ingeniero de Software: " + super.imprimirDatosDelEmpleadomtd(),
                "Lenguaje Especializado: " + lenguajeEspecializado,
                "Area: " + area,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd();
    }
    public void desarrollarSoftwaremtd() {
        JOptionPane.showMessageDialog(null, "Software desarrollado por " + getNombre());
    }
    
    public void realizarPruebasmtd() {
        JOptionPane.showMessageDialog(null, "Pruebas realizadas por " + getNombre());
    }
    
    public void mantenerSistemasmtd() {
        JOptionPane.showMessageDialog(null, "Sistemas mantenidos por " + getNombre());
    }
    
    public void depurarErroresmtd() {
        JOptionPane.showMessageDialog(null, "Errores depurados por " + getNombre());
    }
    
    public void optimizarAlgoritmosmtd() {
        JOptionPane.showMessageDialog(null, "Algoritmos optimizados por " + getNombre());
    }
    
    public void colaborarEquipoDesarrollomtd() {
        JOptionPane.showMessageDialog(null, "Colaboración en equipo de desarrollo por " + getNombre());
    }
}
