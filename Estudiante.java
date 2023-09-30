import java.time.LocalDate;
import java.time.Period;
/*
 * Clase estudiante
 */
public class Estudiante {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    /*
     * Constructores 
     * Metodo constructor para iniciar los atributos de nombre y fecha
     * @param nombre Nombre del estudiante
     * @param fechaDeNacimiento Fecha de nacimiento del estudiante
     * @param notaMateria1 Nota 1
     * @param notaMateria2 Nota 2
     * @param notaMateria3 Nota 3
     * 
     * 
     * Complejidad Temporal : O(1) Tiempo constante
     */

    public Estudiante(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.notaMateria1 = 2.0;
        this.notaMateria2 = 4.0;
        this.notaMateria3 = 3.8;
    }

    /*
     * Metodos getters y setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getNotaMateria1 () {
        return notaMateria1;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getNotaMateria2 () {
        return notaMateria2;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public double getNotaMateria3 () {
        return notaMateria3;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    /*
     * Metodo para validar que la fecha de nacimiento sea correcta
     * 
     * Complejidad Temporal: Tiempo Constante O(1)
     */
    public boolean validarFechaDeNacimiento () {
        LocalDate fechaActual = LocalDate.now();

        /*
         * La fecha dada por el usuario no puede ser en el futuro
         */

        if (fechaDeNacimiento.isAfter(fechaActual)) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Metodo para obtener edad del estudiante
     * Por medio del metodo Period.between se calcula la diferencia de tiempo entre las dos fechas
     * Se obtienen los años de diferencia por medio de getYears
     * 
     * Complejidad Temporal: O(1) Tiempo Constante
     */

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(fechaDeNacimiento, fechaActual);
        int edad = diferencia.getYears();
        return edad;
    }

    /*
     * Metodo para calcular el promedio 
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public double calcularPromedio () {
        double promedio = (notaMateria1 + notaMateria2 + notaMateria3) / 3;
        promedio = Math.round(promedio * 10.0) / 10.0;
        return promedio;

}
}