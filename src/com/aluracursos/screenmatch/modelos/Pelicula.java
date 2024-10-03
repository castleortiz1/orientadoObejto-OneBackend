package com.aluracursos.screenmatch.modelos;

public class Pelicula {

    // Atributos de la clase Pelicula
    public String nombre;
    public int fechaDeLanzamineto;
    public int duracionEnMinutos;
    public boolean incluidoEnElPlan;
    private double sumaDeLasEvaluciones;
    private int totalDeLasEvaluaciones;

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
        System.out.println(duracionEnMinutos + " Minutos de Duracion.");

    }

    public void evalua(double nota){
        sumaDeLasEvaluciones += nota;
        totalDeLasEvaluaciones++;

    }

    public double calculaMedia(){
            return sumaDeLasEvaluciones / totalDeLasEvaluaciones;

    }

}
