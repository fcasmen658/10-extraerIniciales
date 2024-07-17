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
        System.out.print("El nombre completo es: " + "\033[1m" + "\033[36m" + nombre + "\033[0m");
        System.out.println();
        System.out.print("Las iniciales del nombre son: " + "\033[1m \033[36m" + iniciales + "\033[0m");
        System.out.println();
        System.out.println((" ").repeat(10));
    }
}