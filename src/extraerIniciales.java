public class extraerIniciales {
    public static void main(String[] args) {
        String nombre;
        nombre = "Francisco Miguel CASAS MÉNDEZ";
        String getIniciales;
        {
            String iniciales = "";
            for (int i = 0; i < nombre.length(); i++) {
                if (i == 0 || nombre.charAt(i - 1) == ' ') {
                    iniciales += nombre.charAt(i);
                }
            }

            System.out.println((" ").repeat(10));
            System.out.println("El nombre completo es: " + nombre);
            System.out.println("Las iniciales del nombre son: " + iniciales);
            System.out.println((" ").repeat(10));
        }
    }
}
