package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        youngVisitor = new Visitor(11, 100.00, 10.00);
        oldVisitor = new Visitor(12, 201.00, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, this.dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void priceIsFullFor12YearOld(){
        assertEquals(2.25, this.dodgems.priceFor(youngVisitor), 0.01);
    }

    @Test
    public void priceIsHalfFor11YearOld(){
        assertEquals(4.50, this.dodgems.priceFor(oldVisitor), 0.01);
    }
}
