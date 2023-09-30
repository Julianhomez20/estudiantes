import java.util.Scanner;
import java.time.LocalDate;

/*
 * Clase principal
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Capturar datos del estudiante
         */

        /*
         * Solicitar nombre del estudiante
         */
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        /*
         * Solicitar fecha de nacimiento
         */
        System.out.println("Ingrese el día de su nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        int año = scanner.nextInt();

        /*
         * Crear un objeto LocalDate que obtiene la fecha de nacimiento del estudiante
         */
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);

        // Crear el objeto Estudiante con el constructor
        Estudiante estudiante = new Estudiante(nombre, fechaNacimiento);

        /*
         * Validacion de la fecha ingresada
         * En caso de la fecha sea valida se muestra el promedio y edad del estudiante
         */

        if (estudiante.validarFechaDeNacimiento()) {       
            // Obtener la edad y el promedio
            int edad = estudiante.calcularEdad();
            double promedio = estudiante.calcularPromedio();
            System.out.println("Promedio de " + nombre + " es: " + promedio);
            System.out.println("La edad de " + nombre +" es: " + edad);
        } else {
            System.out.println("Fecha de nacimiento inválida");
        }
    }
}
