package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    };

    public double priceFor(Visitor visitor){
        return visitor.getAge() < 12 ? this.defaultPrice()/2 : this.defaultPrice();
    }
}
