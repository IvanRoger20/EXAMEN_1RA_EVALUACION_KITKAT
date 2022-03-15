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

    private String Usuario;
    private String Contraseña;

    public Password() {
        Usuario = "";
        Contraseña = "";
    }

    public Password(String Usuario, String Contraseña) {
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
