package pkgHerencia;

import javax.swing.JOptionPane;

public class clsAnalistaDeDatos extends clsEmpleadoDeMedioTiempo {
    private String experienciaHerramientas;
    private boolean machineLearning;

    public clsAnalistaDeDatos(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String experienciaHerramientas, boolean machineLearning) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.experienciaHerramientas = experienciaHerramientas;
        this.machineLearning = machineLearning;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Analista de datos: " + super.imprimirDatosDelEmpleadomtd(),
        "Experiencia en herramientas: " + experienciaHerramientas,
        "Machine Learning: " + machineLearning,
        "Tipo de Empleado: " + tiempo);
        return informacion;
    }

    @Override
    public double calcularSalariomtd() {
        return super.calcularSalariomtd(); // logica
    }
    public void analizarDatosmtd() {
        JOptionPane.showMessageDialog(null, "Datos analizados por " + getNombre());
    }
    
    public void generarInformeDeAnalisismtd() {
        JOptionPane.showMessageDialog(null, "Informe de análisis generado por " + getNombre());
    }
    
    public void desarrollarModelosPredictivosmtd() {
        JOptionPane.showMessageDialog(null, "Modelos predictivos desarrollados por " + getNombre());
    }
    
    public void visualizarTendenciasmtd() {
        JOptionPane.showMessageDialog(null, "Tendencias visualizadas por " + getNombre());
    }
    
    public void limpiarDatosmtd() {
        JOptionPane.showMessageDialog(null, "Datos limpiados por " + getNombre());
    }
    
    public void interpretarResultadosmtd() {
        JOptionPane.showMessageDialog(null, "Resultados interpretados por " + getNombre());
    }
}
