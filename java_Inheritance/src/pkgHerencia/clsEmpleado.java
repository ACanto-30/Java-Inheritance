package pkgHerencia;
public  class clsEmpleado {
    private String nombre;
    private int ID;
    private double salarioBase;
    private int horasTrabajadas;
    private boolean tiempoCompleto;
    private String email;

    public clsEmpleado(String nombre, int ID, double salarioBase, int horasTrabajadas, boolean tiempoCompleto, String email) {
        this.nombre = nombre;
        this.ID = ID;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tiempoCompleto = tiempoCompleto;
        this.email = email;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public boolean isTiempoCompleto() {
        return tiempoCompleto;
    }

    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}