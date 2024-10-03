public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamineto = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.2);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getSumaDeLasEvaluciones());
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "La La Land";
        otraPelicula.fechaDeLanzamineto = 2016;
        otraPelicula.duracionEnMinutos = 125;

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(8.2);
        otraPelicula.evalua(10);
        otraPelicula.evalua(7.5);

        System.out.println(otraPelicula.getSumaDeLasEvaluciones());
        System.out.println(otraPelicula.getTotalDeLasEvaluaciones());
        System.out.println(otraPelicula.calculaMedia());

    }

}
