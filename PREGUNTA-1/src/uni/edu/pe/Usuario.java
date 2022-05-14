package uni.edu.pe;

import java.util.Objects;

public class Usuario {
    private  String nombre;
    private  String apellido;
    private  Integer edad;
    private  String dni;
    private Contrasenia contrasenia;

    public void visualizaUsuario(){
        System.out.println(
                        this.dni+'|'+
                        this.nombre+'|'+
                        this.apellido+'|'+
                        this.edad.toString()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public Usuario(String nombre, String apellido, Integer edad, String dni, Contrasenia contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.contrasenia = contrasenia;
    }

}
