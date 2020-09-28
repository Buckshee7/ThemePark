package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor shortVisitor;
    Visitor tallVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        shortVisitor = new Visitor(11, 199.99, 10.00);
        tallVisitor = new Visitor(12, 200.01, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void priceIsDefaultForOneNineNinePointNineNine(){
        assertEquals(8.50, this.rollerCoaster.priceFor(shortVisitor), 0.01);
    }

    @Test
    public void priceIsDoubleForTwoZeroZeroPointZeroOne(){
        assertEquals(17.00, this.rollerCoaster.priceFor(tallVisitor), 0.01);
    }
}
