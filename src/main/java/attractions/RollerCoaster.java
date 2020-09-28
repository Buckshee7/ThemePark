package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 8.50;
    };

    public double priceFor(Visitor visitor){
        return visitor.getHeight() > 200.00 ? this.defaultPrice()*2 : this.defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() > 12 && visitor.getHeight() > 145.00 ? true : false;
    }
}
