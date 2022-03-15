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

public class Password {
    
    public static void main(String[] args) {
        Password1 MiContra = new Password1();
        MiContra.setUsuario("xXx_PepeMax_xXx");
        MiContra.setContraseña("itachi23");
        if (MiContra.verificarAcceso(MiContra.getUsuario(), MiContra.getContraseña()) == true) {
            System.out.println("El usuario y contraseña es valido");
        } else {
            System.out.println("El usuario o contraseña no es valido");
        }
    }
}

class Password1 {

    private String Usuario;
    private String Contraseña;

    public Password1() {
        Usuario = "";
        Contraseña = "";
    }

    public Password1(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public boolean verificarAcceso(String usuario, String contraseña) {
        return "xXx_PepeMax_xXx".equals(usuario) & "itachi23".equals(contraseña);
    }
}
