import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        Dodgems dodgems = new Dodgems("Dave's Dodgems", 4);
        Playground playground = new Playground("Pirate Pet's Play Park", 2);
        Park park = new Park("Here-be-Greens", 3);
        RollerCoaster rollercoaster = new RollerCoaster("Whirley-Dirley", 5);
        CandyflossStall candyflossstall = new CandyflossStall("Floss Your Teeth Off", "Steve", ParkingSpot.A1, 3);
        IceCreamStall icecreamstall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 4);
        TobaccoStall tobaccostall = new TobaccoStall("smoking kills", "smoky pete", ParkingSpot.A3, 0);
        ArrayList<IReviewed> attractionsAndStalls = new ArrayList<>();
        attractionsAndStalls.add(dodgems);
        attractionsAndStalls.add(playground);
        attractionsAndStalls.add(park);
        attractionsAndStalls.add(rollercoaster);
        attractionsAndStalls.add(candyflossstall);
        attractionsAndStalls.add(icecreamstall);
        attractionsAndStalls.add(tobaccostall);

        themePark = new ThemePark(attractionsAndStalls);
    }

}
