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

        System.out.println(miPelicula.sumaDeLasEvaluciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());
        System.out.println("******************");
        miPelicula.sumaDeLasEvaluciones = 2;
        miPelicula.totalDeLasEvaluaciones = 1;
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "La La Land";
        otraPelicula.fechaDeLanzamineto = 2016;
        otraPelicula.duracionEnMinutos = 125;

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(8.2);
        otraPelicula.evalua(10);

        System.out.println(otraPelicula.sumaDeLasEvaluciones);
        System.out.println(otraPelicula.totalDeLasEvaluaciones);
        System.out.println(otraPelicula.calculaMedia());

    }

}
