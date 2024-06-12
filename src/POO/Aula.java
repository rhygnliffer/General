package POO;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula {
    
    

    public static void main(String[] args) {
        // Probando las clases Persona y empleado
        Persona gabriel = new Persona("José Gabriel", "Britez", 1230455);
        gabriel.ver_atributos();
        Empleado pepe = new Empleado("José", "Perez", 1535623, "conserje", 2);
        pepe.ver_atributos();



        // Probando la comisión
        Estudiante alumno1 = new Estudiante("Joaquín", "Lopez", 12, "Técnico en Programación", 251);
        Estudiante alumno2 = new Estudiante("Rocío", "Campos", 3756, "Ingeniería en Electrónica", 25);
        Estudiante alumno3 = new Estudiante("Coraje", "El perro cobarde", 25, "Salvar el día", 398);
        Estudiante alumno4 = new Estudiante("Cosme", "Fulanito", 1784, "Licenciatura en elegancia", 1111);
        Estudiante alumno5 = new Estudiante("Ron", "Weasley", 189, "Sobrar en la trama", 789);


        Profesor facundo = new Profesor("Facundo", "Uferer", "Práctica de Java", 2, 1, "Programación I", 100);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(alumno1);
        estudiantes.add(alumno2);
        estudiantes.add(alumno3);

        Comision comision2 = new Comision(estudiantes, facundo);
        comision2.mostrar_comision();
        comision2.agregar_estudiante(alumno4);
        comision2.mostrar_comision();
        comision2.modificar_estudiante(alumno5, 1);
        comision2.mostrar_comision();
        //comision2.eliminar_studiante(); Este método sirve para eliminar por DNI
        comision2.mostrar_comision_completa();
        


    }
}


    
class Funciones {
    public static void imprimir(String palabra){
        System.out.println(palabra);
    }

    public static void imprimir_rayas(){
        imprimir("__________________________");
    }



    public static void imprimir_espacios(){
        imprimir(" ");
        imprimir(" ");
    }



    public static void marco(String nombre , String apellido, String clase){
        imprimir_espacios();
        imprimir_rayas();
        imprimir("INFORMACIÓN DE "+ clase.toUpperCase() + " "+ nombre.toUpperCase() + " " + apellido.toUpperCase());
        imprimir_rayas();
        imprimir_espacios();
    }


    public static void marco_comision(){
        imprimir_espacios();
        imprimir("INFORMACIÓN DE LA COMISIÓN");
        imprimir_rayas();
    }
}



class Persona{

    // Atributos
    private String nombre;
    private String apellido;
    private int dni;
    private String clase = "Persona";
    


    //Constructor
    public Persona(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }



    // Ver atributos
    public void ver_atributos(){
        Funciones.marco(nombre, apellido, clase);
        String variable = "Nombre:  " + this.nombre + "     " + "Apellido:  " + this.apellido +"     " + "DNI:  " + this.dni;
        Funciones.imprimir(variable);
    }



    // Setters y Getters

    public String get_nombre() {
        return nombre;
    }

    public String get_apellido() {
        return apellido;
    }


    public int get_dni() {
        return dni;
    }


    public String get_clase() {
        return clase;
    }


    public void setClase(String clase) {
        this.clase = clase;
    }


    
}



class Empleado extends Persona{

    // Atributos
    private long sueldo;
    private String puesto;



    // Constructor
    public Empleado(String nombre, String apellido, int dni, String puesto, long sueldo){
        super(nombre, apellido, dni);
        this.puesto = puesto;
        this.sueldo = sueldo;
        setClase("Empleardo");
        //Nota empleardo fue dejado a propósito
    }



    //Ver Atributos
    @Override
    public void ver_atributos(){
        String variable = "Nombre:  " + get_nombre() + "     " + "Apellido:  " + get_apellido() +"     " + "DNI:  " + get_dni();
        String inf_adicional = "Puesto:     " + this.puesto + "      Sueldo: $" + this.sueldo;
        Funciones.marco(get_nombre(), get_apellido(), get_clase());
        Funciones.imprimir(variable);
        Funciones.imprimir(inf_adicional);
    }

}




class Estudiante extends Persona{

    // Atributos
    private int matricula;
    private String carrera;



    // Constructor
    public Estudiante(String nombre, String apellido, int dni, String carrera, int matricula){
        super(nombre, apellido, dni);
        this.matricula = matricula;
        this.carrera = carrera;
        setClase("Estudiante");
    }



    //Ver Atributos
    @Override
    public void ver_atributos(){
        String variable = "Nombre:  " + get_nombre() + "     " + "Apellido:  " + get_apellido() +"     " + "DNI:  " + get_dni();
        String inf_adicional = "Matricula:     " + this.matricula + "      Carrera:  " + this.carrera;
        Funciones.marco(get_nombre(), get_apellido(), get_clase());
        Funciones.imprimir(variable);
        Funciones.imprimir(inf_adicional);
    }

}


class Profesor extends Empleado{

    //Atributos
    private String materia;
    private int antiguedad;



    // Constructor
    public Profesor(String nombre, String apellido, String puesto, long sueldo, int dni, String materia, int antiguedad){
        super(nombre, apellido, dni, puesto, sueldo);
        this.materia = materia;
        this.antiguedad = antiguedad;
        setClase("Profesor");
    }



    // Ver atributos
    @Override
    public void ver_atributos() {
        super.ver_atributos();
        String inf_adicional = "Materia: " + this.materia + "   "+ "Antiguedad: " + this.antiguedad;
        Funciones.imprimir(inf_adicional);
    }
}


class Comision{

    // Atributos
    private ArrayList<Estudiante> estudiantes;
    private Profesor profesor;

    

    // Constructor
    public Comision(ArrayList<Estudiante> estudiantes, Profesor profesor){
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }



    void agregar_estudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }


    void modificar_estudiante(Estudiante estudiante, int indice){
        this.estudiantes.set(indice - 1, estudiante);
    }


    void eliminar_studiante(){
        int cont = 0;
        Scanner p = new Scanner(System.in);
        Funciones.imprimir("Ingrese un dni");
        int dni = p.nextInt();
        p.close();
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.get_dni() == dni) {
                Funciones.imprimir("Se eliminó el " + estudiante.get_nombre() + " " + estudiante.get_apellido());
                estudiantes.remove(estudiante);
                cont++;
                break;
            }
        }
        if (cont == 0) {
            Funciones.imprimir("No se encontro al estudiante");
        }
    }


    void mostrar_comision(){
        int cont = 1;
        Funciones.marco_comision();
        Funciones.imprimir("Profesor: " + this.profesor.get_nombre() + " " + this.profesor.get_apellido());
        Funciones.imprimir_espacios();
        Funciones.imprimir("Lista de alumnos");
        Funciones.imprimir_espacios();
        for (Estudiante estudiante : this.estudiantes) {
            Funciones.imprimir(cont+ ": " + estudiante.get_nombre() + " " + estudiante.get_apellido());
        }

    }

    void mostrar_comision_completa(){
        Funciones.marco_comision();
        profesor.ver_atributos();
        for (Estudiante estudiante : this.estudiantes) {
            estudiante.ver_atributos();
        }
    }
}
