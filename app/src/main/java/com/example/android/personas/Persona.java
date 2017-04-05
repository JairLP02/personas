package com.example.android.personas;

/**
 * Created by android on 04/04/2017.
 */

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String PasaTiempo;

    public Persona(String nombre, String apellido, int edad, String pasaTiempo) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        PasaTiempo = pasaTiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getPasaTiempo() {
        return PasaTiempo;
    }

    public void setPasaTiempo(String pasaTiempo) {
        PasaTiempo = pasaTiempo;
    }
    public  void guardar(){
        Datos.guardar(this);
    }
}
