
import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> attractionsAndStalls;

    public ThemePark (ArrayList<IReviewed> attractionsAndStalls){
        this.attractionsAndStalls = attractionsAndStalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.attractionsAndStalls;
    }

}
