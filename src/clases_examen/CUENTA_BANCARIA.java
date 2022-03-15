
package clases_examen;

import java.util.Scanner;

public class CUENTA_BANCARIA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CuentaBancaria2 cueban = new CuentaBancaria2();
        cueban.setCuenta(1123345);
        cueban.setCliente("Juan Juarez");
        cueban.setSaldo(100000);
        cueban.imprimirDatos();
        System.out.println("DESEA DEPOSITAR O RETIRAR?");
        String des = s.nextLine();
        if(des.equals("DEPOSITAR")){
            cueban.DepositarEnCuenta();
        }else{
            cueban.RetirarDeCuenta();
        }
    }
    
}

class CuentaBancaria2{
    private int cuenta;
    private String cliente;
    private double saldo;
    
    public int getCuenta(){
        return cuenta;
    }
    
    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void DepositarEnCuenta(){
        System.out.println("Monto a depositar: ");
        Scanner scp = new Scanner(System.in);
        double dep = scp.nextDouble();
        saldo = saldo + dep;
        System.out.println(saldo);
    }
    
    public void RetirarDeCuenta(){
        System.out.println("Monto a retirar: ");
        Scanner sc = new Scanner(System.in);
        double ret = sc.nextDouble();
        saldo = saldo - ret;   
        if(saldo < 0){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println(saldo);
        }
    }
    
    public void imprimirDatos(){
        System.out.println("Num. Cuenta: " + cuenta);
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
}