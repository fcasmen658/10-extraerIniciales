import org.iesalandalus.programacion.utilidades.Entrada;
public class extraerIniciales {
    public static void main(String[] args) {
// Variables
        String nombre;
        System.out.print("Introduzca su nombre completo: ");
        nombre = Entrada.cadena();
        System.out.println();
// Iniciales
        String iniciales = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (i == 0 || nombre.charAt(i - 1) == ' ') {
                iniciales += nombre.charAt(i);
            }
        }
// Salida por pantalla
        System.out.println((" ").repeat(10));
        System.out.print("El nombre completo es: " + nombre);
        System.out.println();
        System.out.print("Las iniciales del nombre son: " + iniciales);
        System.out.println((" ").repeat(10));
    }
}