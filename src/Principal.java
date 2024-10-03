import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
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

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("La La Land");
        otraPelicula.setFechaDeLanzamineto(2016);
        otraPelicula.setDuracionEnMinutos(125);
        otraPelicula.setIncluidoEnElPlan(true);

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(8.2);
        otraPelicula.evalua(10);
        otraPelicula.evalua(7.5);

        System.out.println(otraPelicula.getSumaDeLasEvaluciones());
        System.out.println(otraPelicula.getTotalDeLasEvaluaciones());
        System.out.println(otraPelicula.calculaMedia());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus peliculas y series favoritas "
                + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);


    }

}