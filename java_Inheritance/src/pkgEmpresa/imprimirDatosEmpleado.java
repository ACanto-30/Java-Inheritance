package pkgEmpresa;

import javax.swing.JOptionPane;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class imprimirDatosEmpleado {

    public void seleccionarMetodo(Method[] metodos, Object InstanciaClase)
    {
        ArrayList<String> nombresFiltradosMetodos = new ArrayList<>();
        ArrayList<String> nombresDeMetodos = new ArrayList<>();
        boolean ciclo = true;

        for (int i = 0; i<metodos.length; i++) {
            String nombre = metodos[i].getName();
            if (nombre.endsWith("mtd")) {
                nombresFiltradosMetodos.add(nombre);
            }
        }

        nombresFiltradosMetodos.sort(Comparator.naturalOrder());
        nombresDeMetodos.addAll(nombresFiltradosMetodos);


        StringBuilder opciones = new StringBuilder("Elija la opción deseada:");

        for(int i = 0; i < nombresDeMetodos.size(); i++)
        {
            nombresDeMetodos.set(i, separarPalabras(nombresDeMetodos.get(i)));
            opciones.append("\n").append(i + 1).append(". ").append(nombresDeMetodos.get(i));
        }

        opciones.append("\n" + (nombresDeMetodos.size() + 1) + ". Elegir otro empleado");

        while(ciclo)
        {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            if (opcion >= 1 && opcion <= nombresFiltradosMetodos.size()) 
            {
                try {
                    Method metodo = InstanciaClase.getClass().getMethod(nombresFiltradosMetodos.get(opcion - 1)); // Corregir el índice
                    if (!metodo.getName().equals("imprimirDatosDelEmpleadomtd") && !metodo.getName().equals("calcularSalariomtd")) 
                        metodo.invoke(InstanciaClase);
                    else 
                    {
                        Object resultado = metodo.invoke(InstanciaClase);
                        String resultadoString = resultado != null ? resultado.toString() : "null";
                        JOptionPane.showMessageDialog(null, resultadoString);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (opcion == (nombresDeMetodos.size() + 1))
                ciclo = false;
              else
                JOptionPane.showMessageDialog(null, "Opción inválida");
        }
    }

    public static String separarPalabras(String nombre) {

        if (nombre.endsWith("mtd")) {
            nombre = nombre.substring(0, nombre.length() - 3);
        }
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
        Pattern patron = Pattern.compile("[A-Z][a-z]*");
        Matcher matcher = patron.matcher(nombre);
        StringBuilder resultado = new StringBuilder();
        while (matcher.find()) {
            resultado.append(matcher.group()).append(" ");
        }
        return resultado.toString().trim();
    }
}
