package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 8.50;
    };

    public double priceFor(Visitor visitor){
        return visitor.getHeight() > 200.00 ? this.defaultPrice()*2 : this.defaultPrice();
    }
}
