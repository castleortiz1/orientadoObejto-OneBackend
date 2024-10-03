public class Pelicula {

    String nombre;
    int fechaDeLanzamineto;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluciones;
    private int totalDeLasEvaluaciones;

    double getSumaDeLasEvaluciones(){
        return sumaDeLasEvaluciones;
    }

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("\nEl nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue el: " + fechaDeLanzamineto);
        System.out.println(duracionEnMinutos + " Minutos de Duracion.");

    }

    void evalua(double nota){
        sumaDeLasEvaluciones += nota;
        totalDeLasEvaluaciones++;

    }

    double calculaMedia(){
            return sumaDeLasEvaluciones / totalDeLasEvaluaciones;

    }

}
