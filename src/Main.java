import com.inventory.Car;
import com.inventory.Sedan;
import com.inventory.Truck;
import com.inventory.UtilityVehicle;
import com.streaming.Movie;
import com.streaming.TVSeries;
import com.streaming.Video;

public class Main {
    public static void main(String[] args) {


        Video Supernatural = new TVSeries("Supernatural",45, 200 );

        System.out.println(Supernatural.getInfo());

        System.out.println("_________________________________________________-");


        Video jaula = new Movie("La Jaula de las Locas", 90, 10);

        System.out.println(jaula.getInfo());

        System.out.println("_________________________________________________-");

Car car1 = new Sedan("54", "Nidea", "Aston Martin", 155 );

        System.out.println(car1.getinfo());
        System.out.println("_________________________________________________-");

Car car2 = new Truck("98", "What", "Picky", 8425, 685.25);

        System.out.println(car2.getinfo());
        System.out.println("_________________________________________________-");

Car car3 = new UtilityVehicle("622", "Who", "MarisOnTheRoad", 65, false);

        System.out.println(car3.getinfo());
        System.out.println("_________________________________________________-");

Car car4 = new Sedan("32", "PullRequest", "PorfisFunciona", 99999);
        System.out.println(car4.getinfo());
        System.out.println("_________________________________________________-");




    }




}