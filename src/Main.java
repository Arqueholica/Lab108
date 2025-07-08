import com.streaming.Movie;
import com.streaming.TVSeries;
import com.streaming.Video;

public class Main {
    public static void main(String[] args) {


        Video Supernatural = new TVSeries("Supernatural",45, 200 );

        System.out.println(Supernatural.getInfo());

        Video jaula = new Movie("La Jaula de las Locas", 90, 10);

        System.out.println(jaula.getInfo());

        System.out.println("_________________________________________________-");

    }
}