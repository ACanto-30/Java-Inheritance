package pkgHerencia;
import javax.swing.JOptionPane;

public class clsTrabajadorManual extends clsEmpleadoDeMedioTiempo {
    private String areas;
    private String tipoLimpieza;

    public clsTrabajadorManual(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email, String areas, String tipoLimpieza) {
        super(nombre, ID, salarioBase, horasTrabajadas, tiempoCompleto, email);
        this.areas = areas;
        this.tipoLimpieza = tipoLimpieza;
    }
    @Override
    public String imprimirDatosDelEmpleadomtd() {
        String tiempo = isTiempoCompleto() ? "Tiempo Completo" : "Medio Tiempo";
        String informacion = String.join("\n", 
        "Trabajador Manual: " + super.imprimirDatosDelEmpleadomtd(),
                "Area de limpieza: " + areas,
                "Tipo de limpieza: " + tipoLimpieza,
                "Tipo de Empleado: " + tiempo);
        return informacion;
    }
    
    public double calcularSalariomtd() {
        double tarifaHoraLimpieza = 10.0;
        double salarioTotal = getSalarioBase() + (getHorasTrabajadas() * tarifaHoraLimpieza);
        return salarioTotal;
    }
    public void LimpiarPisosmtd() {
        JOptionPane.showMessageDialog(null, "Pisos limpiados por " + getNombre());
    }
    
    public void LimpiarVentanasmtd() {
        JOptionPane.showMessageDialog(null, "Ventanas limpiadas por " + getNombre());
    }
    
    public void SacarBasuramtd() {
        JOptionPane.showMessageDialog(null, "Basura sacada por " + getNombre());
    }
    
    public void desinfectarAreamtd() {
        JOptionPane.showMessageDialog(null, "Área desinfectada por " + getNombre());
    }
    
    public void ordenarSuministrosmtd() {
        JOptionPane.showMessageDialog(null, "Suministros ordenados por " + getNombre());
    }
    
    public void repararMobiliariomtd() {
        JOptionPane.showMessageDialog(null, "Mobiliario reparado por " + getNombre());
    }
}