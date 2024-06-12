package POO;

import java.util.Scanner;

public class PracticaTeoria {
    public static void main(String[] args) {
        int num = 5;
        String nombre = "José";
        Estudiante alumno1 = new Estudiante();
        alumno1.Contructor(num, nombre, 23, 12, 2002);
        alumno1.mostrar_atributos();
        alumno1.cumple();
    }
}

class Estudiante{
    private int nota;
    private String nombre;
    private int edad;
    private int dia_nac;
    private int mes_nac;
    private int ano_nac;



    public void Contructor(int nota, String palabra, int dia, int mes, int ano){
        this.nota = nota;
        this.nombre = palabra;
        this.dia_nac = dia;
        this.mes_nac = mes;
        this.ano_nac = ano;
    }

    public void mostrar_atributos(){
        String variable = "Alumno:   " + this.nombre + "Nota:   " + this.nota;
        System.out.println(variable);
        if (this.nota >= 6) {
            System.out.println("El alumno aprobó");
        } else {
            System.out.println("El alumno no aprobó");
        }
    }

    public void cumple(){
        System.out.println("Ingrese una fecha de la forma dia/mes/ano");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        this.edad = ano - this.ano_nac - 1;
        if (mes == mes_nac) {
            if (dia >= dia_nac) {
               this.edad = this.edad +1; 
               if (dia == dia_nac){
                System.out.println("Feliz cumpleaños");
               }
            }
        }else {
            if(mes > mes_nac){
                this.edad = this.edad + 1;
            }
        }
        sc.close();
        System.out.println(this.edad); 
}
}