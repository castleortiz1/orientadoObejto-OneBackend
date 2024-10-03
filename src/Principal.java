import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamineto(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.2);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluacion de la pelicula: " +miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa Dragón");
        casaDragon.setFechaDeLanzamineto(2019);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        casaDragon.evalua(8.2);
        casaDragon.evalua(9.0);
        casaDragon.evalua(7.8);

        System.out.println(casaDragon.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluacion de la pelicula: " +casaDragon.calculaMedia());













//        otraPelicula.muestraFichaTecnica();
//        otraPelicula.evalua(8.2);
//        otraPelicula.evalua(10);
//        otraPelicula.evalua(7.5);
//
//        System.out.println(otraPelicula.getSumaDeLasEvaluciones());
//        System.out.println(otraPelicula.getTotalDeLasEvaluaciones());
//        System.out.println(otraPelicula.calculaMedia());

    }

}
