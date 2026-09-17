public class Github {
    public static void main(String[] args) {

        String nombre = "Thiago";
        String carrera = "Ingeniería de Sistemas";
        int semestre = 8;

        mostrarInformacion(nombre, carrera, semestre);
    }

    public static void mostrarInformacion(String nombre, String carrera, int semestre) {

        System.out.println("=== INFORMACIÓN DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
