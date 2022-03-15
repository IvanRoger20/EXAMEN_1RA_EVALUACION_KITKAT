
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class CLASE_TEST_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner sc = new Scanner(System.in);
        persona per1 = new persona();
        per1.setEdad(18);
        System.out.println("¿Tiene alguna enfermedad crónica? ");
        per1.setRespuesta(false); 
        per1.setPeso(80);
        per1.setEstatura(1.80);
        per1.imprimirDatos();
        per1.calcularPersonaRiesgo();
    }
    
}

class persona {
    private int edad;
    private double peso;
    private double estatura;
    private double masaCorporal;
    private boolean respuesta;
    private boolean si = true;
    private boolean no = false;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getMasaCorporal() {
        return masaCorporal;
    }

    public void setMasaCorporal(double masaCorporal) {
        this.masaCorporal = masaCorporal;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isSi() {
        return si;
    }

    public void setSi(boolean si) {
        this.si = si;
    }

    public boolean isNo() {
        return no;
    }

    public void setNo(boolean no) {
        this.no = no;
    }
    public void calcularPersonaRiesgo(){
        if (edad >= 65){
            System.out.println("PERSONA DE RIESGO");
        }else if (masaCorporal > 30){
            System.out.println("PERSONA DE RIESGO");
        }else if (respuesta == true){
            System.out.println("PERSONA DE RIESGO");
        }else{
            System.out.println("PERSONA SIN RIESGO");
        }
       }
    public void imprimirDatos(){
        masaCorporal = peso/(estatura*estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Indice de Masa Corporal: " + masaCorporal);
    }
    
}