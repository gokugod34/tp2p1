import modelo.Universidad;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.Materia;

public class App {
    public static void main(String[] args) {

        Universidad uni = new Universidad();

        Estudiante e1 = new Estudiante("Juan", "Perez");
        e1.agregarMateria(new Materia("Matemática", 8));
        e1.agregarMateria(new Materia("Historia", 6));

        Estudiante e2 = new Estudiante("Ana", "Gomez");
        e2.agregarMateria(new Materia("Matemática", 10));
        e2.agregarMateria(new Materia("Inglés", 9));

        Profesor p1 = new Profesor("Luis", "Martinez");
        p1.agregarMateria(new Materia("Matemática", 0));

        uni.agregarMiembro(e1);
        uni.agregarMiembro(e2);
        uni.agregarMiembro(p1);

        System.out.println("Promedio de " + e1 + ": " + e1.calcularPromedioRecursivo());
        System.out.println("Promedio de " + e2 + ": " + e2.calcularPromedioRecursivo());

        System.out.println("Cantidad de profesores: " + uni.contarProfesores());
    }
}
