package examen_1ra_evaluacion_kitkat;

import clases_examen.CLASE_EMPLEADO;
import clases_examen.DatosIntegrantes;
import clases_examen.Password;

public class EXAMEN_1RA_EVALUACION_KITKAT {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------------------------------");
        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        System.out.println("------------------------------------------");
        System.out.println("Problema clase contraseña");
        Password MiContra = new Password();
        MiContra.setUsuario("xXx_PepeMax_xXx");
        MiContra.setContraseña("itachi23");
        if (MiContra.verificarAcceso(MiContra.getUsuario(), MiContra.getContraseña()) == true) {
            System.out.println("El usuario y contraseña es valido");
        } else {
            System.out.println("El usuario o contraseña no es valido");
        }
        System.out.println("------------------------------------------");
        System.out.println("Problema Clase empleado");
        CLASE_EMPLEADO empleado = new CLASE_EMPLEADO();
        empleado.setNombre("Juan Manuel");
        empleado.setApellido("Rosa Mendoza");
        empleado.setDireccion("Calle Robinson #30132");
        empleado.setSalario(45231);
        empleado.setAñoIngreso(2010);
        empleado.imprimirDatos();
        System.out.println("------------------------------------------");
    }

}
