package com.aluracursos.screenmatch.modelos;

public class Titulo {
    // Atributos de la clase Pelicula
    private String nombre;
    private int fechaDeLanzamineto;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluciones;
    private int totalDeLasEvaluaciones;

    // Getters y Setters (metodos)


    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamineto() {
        return fechaDeLanzamineto;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamineto(int fechaDeLanzamineto) {
        this.fechaDeLanzamineto = fechaDeLanzamineto;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    // Constructor de la clase Pelicula (metodos)
    public double getSumaDeLasEvaluciones(){
        return sumaDeLasEvaluciones;
    }
    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("\nEl nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue el: " + fechaDeLanzamineto);
//        System.out.println(duracionEnMinutos + " Minutos de Duracion.");
        System.out.println(getDuracionEnMinutos() + " minutos de Duracion. ");

    }

    public void evalua(double nota){
        sumaDeLasEvaluciones += nota;
        totalDeLasEvaluaciones++;

    }

    public double calculaMedia(){
        return sumaDeLasEvaluciones / totalDeLasEvaluaciones;

    }
}
