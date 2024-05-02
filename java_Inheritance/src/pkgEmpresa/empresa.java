package pkgEmpresa;

import pkgHerencia.*;
import javax.swing.JOptionPane;
import java.lang.reflect.Method;

public class empresa {
    public static void main(String[] args) {

        imprimirDatosEmpleado llamadoImprimirDatosEmpleado = new imprimirDatosEmpleado();
        boolean ciclo = true;
        int opcion;
        Method[] metodos;

        clsGerente gerente = new clsGerente("Gerente2", 1, 2000, 40, true, "gerente@empresa.com", 20, 100.000);
        clsAnalistaDeSeguridad analistaSeguridad = new clsAnalistaDeSeguridad("Analista de Seguridad", 2, 1500, 40, true, "analista_seguridad@empresa.com", "Rol", "Gestión de Accesos");
        clsAnalistaDeDatos analistaDatos = new clsAnalistaDeDatos("Analista de Datos", 3, 1800, 30, false, "analista_datos@empresa.com", "Especialidad", true);
        clsConsultorFinanciero consultorFinanciero = new clsConsultorFinanciero("Consultor Financiero", 4, 2200, 35, true, "consultor_financiero@empresa.com", "Área de especialización", "Tipo de consultoría");
        clsDirectorDeRecursosHumanos directorRecursosHumanos = new clsDirectorDeRecursosHumanos("Director de Recursos Humanos", 5, 2500, 45, true, "director_rrhh@empresa.com", "Departamento", "Bono");
        clsIngenieroDeSoftware ingenieroSoftware = new clsIngenieroDeSoftware("Ingeniero de Software", 6, 1900, 40, true, "ingeniero_software@empresa.com", "Lenguaje especializado", "Área de desarrollo");
        clsTrabajadorManual senorLimpieza = new clsTrabajadorManual("Trabajador Manual", 7, 1200, 25, false, "senor_limpieza@empresa.com", "Áreas de limpieza", "Tipo de limpieza");
        clsTecnicoDeSoporte tecnicoSoporte = new clsTecnicoDeSoporte("Técnico de Soporte", 8, 1600, 40, true, "tecnico_soporte@empresa.com", "Especialidad", "Área de soporte");
        clsAsistenteAdministrativo asistenteAdmin = new clsAsistenteAdministrativo("Asistente Administrativo", 9, 1400, 35, false, "asistente_admin@empresa.com", "Segunda lengua", true);
        clsDisenadorGrafico disenadorGrafico = new clsDisenadorGrafico("Diseñador Gráfico", 10, 1700, 30, false, "disenador_grafico@empresa.com", "Área de diseño", true);
        clsSecretario secretario = new clsSecretario("Secretario", 11, 1200, 30, true, "secretario@empresa.com", "Espanol", true);
        clsContador contador = new clsContador("Contador", 12, 2000, 20, true, "contador@empresa.com", "CPA", "SAP");

        String mensaje = String.join(
            "\n",
            "Elija la opción deseada:",
            "1. Gerente",
            "2. Analista de Seguridad",
            "3. Analista de Datos",
            "4. Consultor Financiero",
            "5. Director de Recursos Humanos",
            "6. Ingeniero de Software",
            "7. Trabajador Manual",
            "8. Tecnico de Soporte",
            "9. Asistente Administrativo",
            "10. Disenador Grafico",
            "11. Secretario",
            "12. Contador",
            "13. Finalizar"
        );

        while(ciclo)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch(opcion)
            {
                case 1:  metodos = gerente.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, gerente);break;
                case 2:  metodos = analistaSeguridad.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, analistaSeguridad);break;
                case 3:  metodos = analistaDatos.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, analistaDatos);break;
                case 4:  metodos = consultorFinanciero.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, consultorFinanciero);break;
                case 5:  metodos = directorRecursosHumanos.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, directorRecursosHumanos);break;
                case 6:  metodos = ingenieroSoftware.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, ingenieroSoftware);break;
                case 7:  metodos = senorLimpieza.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, senorLimpieza);break;
                case 8:  metodos = tecnicoSoporte.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, tecnicoSoporte);break;
                case 9:  metodos = asistenteAdmin.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, asistenteAdmin);break;
                case 10:  metodos = disenadorGrafico.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, disenadorGrafico);break;
                case 11:  metodos = secretario.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, secretario);break;
                case 12:  metodos = contador.getClass().getMethods(); llamadoImprimirDatosEmpleado.seleccionarMetodo(metodos, contador);break;
                case 13: ciclo = false;break;
                default: JOptionPane.showMessageDialog(null, "Opcion invalida");break;
            }
        }
    }
}
