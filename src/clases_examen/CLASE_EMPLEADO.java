/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author IvanTron
 */
public class CLASE_EMPLEADO {

    private String nombre;
    private String apellido;
    private String direccion;
    private int añoIngreso;
    private double salario;

    public CLASE_EMPLEADO() {
        nombre = "";
        apellido = "";
        direccion = "";
        añoIngreso = 0;
        salario = 0;
    }

    public CLASE_EMPLEADO(String nombre, String apellido, String direccion, int añoIngreso, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.añoIngreso = añoIngreso;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int calcularVacaciones(int añoIngreso) {
        int diasVacaciones;
        int años = 2022 - añoIngreso;

        if (años >= 1) {
            diasVacaciones = 6;
        } else {
            diasVacaciones = 0;
        }
        if (años > 1) {
            for (int i = 1; i < años; i++) {
                if (años > 1) {
                    diasVacaciones = diasVacaciones + 2;
                }
            }
        }
        if (años >= 5) {
            for (int i = 5; i < años;) {
                if (años > 5) {
                    diasVacaciones = diasVacaciones + 2;
                    i = i + 5;
                } else {
                    i = i + 5;
                }
            }
        }
        return diasVacaciones;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellido);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Año de ingreos: " + this.añoIngreso);
        System.out.println("Salario: " + this.salario);
        System.out.println("Dias de vacaciones: " + calcularVacaciones(this.añoIngreso));
    }
}
