package com.tcs.tallerListas.beans;

public class Estudiante {
    private String identificacion, nombre, grado;
    private double edad;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(double edad) { this.edad = edad; }
    public void setGrado(String grado) { this.grado = grado; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion;}

    public String getGrado() { return grado; }
    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public double getEdad() { return edad; }

    public Estudiante(){
    }
    public Estudiante(String identificacion, String nombre, int edad, String grado){
        this();
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.grado = grado;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", grado='" + grado + '\'' +
                ", edad=" + edad +
                '}';
    }
}
